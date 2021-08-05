package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * a content provider which creates and manages XContents.
  * @author Kai Sommerfeld
  * @see XContent
  * @see XContentIdentifier
  * @version 1.0
  */
trait XContentProvider
  extends StObject
     with XInterface {
  
  /**
    * compares two XContentIdentifiers.
    * @param Id1 first content identifier.
    * @param Id2 second content identifier.
    * @returns `0` is returned, if the identifiers are equal. A value less than `0` indicates, that the Id1 is less than Id2. A value greater than `0` is return
    */
  def compareContentIds(Id1: XContentIdentifier, Id2: XContentIdentifier): Double
  
  /**
    * creates a new {@link XContent} instance, if the given {@link XContentIdentifier} matches a content provided by the implementation of this interface.
    * @param Identifier an identifier for the content to query.
    * @returns the content.
    * @throws IllegalIdentifierException if the given identifier does not match a content provided by the implementation of this interface
    */
  def queryContent(Identifier: XContentIdentifier): XContent
}
object XContentProvider {
  
  inline def apply(
    acquire: () => Unit,
    compareContentIds: (XContentIdentifier, XContentIdentifier) => Double,
    queryContent: XContentIdentifier => XContent,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XContentProvider = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), compareContentIds = js.Any.fromFunction2(compareContentIds), queryContent = js.Any.fromFunction1(queryContent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XContentProvider]
  }
  
  extension [Self <: XContentProvider](x: Self) {
    
    inline def setCompareContentIds(value: (XContentIdentifier, XContentIdentifier) => Double): Self = StObject.set(x, "compareContentIds", js.Any.fromFunction2(value))
    
    inline def setQueryContent(value: XContentIdentifier => XContent): Self = StObject.set(x, "queryContent", js.Any.fromFunction1(value))
  }
}
