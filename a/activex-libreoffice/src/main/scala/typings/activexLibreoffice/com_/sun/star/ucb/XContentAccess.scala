package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies methods for obtaining information on a content in different levels.
  *
  * For example, if there is a cursor which points to XContents, this interface could be used to give the user access to the content under the cursor. If
  * the client only needs the identifier string of the content, there is no need to first create the content object, then to obtain the string from it and
  * after that to release the content.
  * @author Kai Sommerfeld
  * @see XContent
  * @see XContentIdentifier
  * @version 1.0
  */
@js.native
trait XContentAccess extends XInterface {
  
  /**
    * returns the content ( "most expensive method" ).
    * @returns the content.
    */
  def queryContent(): XContent = js.native
  
  /**
    * returns the identifier object of the content.
    * @returns the identifier object.
    */
  def queryContentIdentifier(): XContentIdentifier = js.native
  
  /**
    * returns the identifier string of the content ( "cheap method" ).
    *
    * Note that this string can be used later to recreate the content.
    * @returns the identifier string.
    */
  def queryContentIdentifierString(): String = js.native
}
object XContentAccess {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryContent: () => XContent,
    queryContentIdentifier: () => XContentIdentifier,
    queryContentIdentifierString: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XContentAccess = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryContent = js.Any.fromFunction0(queryContent), queryContentIdentifier = js.Any.fromFunction0(queryContentIdentifier), queryContentIdentifierString = js.Any.fromFunction0(queryContentIdentifierString), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XContentAccess]
  }
  
  @scala.inline
  implicit class XContentAccessMutableBuilder[Self <: XContentAccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueryContent(value: () => XContent): Self = StObject.set(x, "queryContent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setQueryContentIdentifier(value: () => XContentIdentifier): Self = StObject.set(x, "queryContentIdentifier", js.Any.fromFunction0(value))
    
    @scala.inline
    def setQueryContentIdentifierString(value: () => String): Self = StObject.set(x, "queryContentIdentifierString", js.Any.fromFunction0(value))
  }
}
