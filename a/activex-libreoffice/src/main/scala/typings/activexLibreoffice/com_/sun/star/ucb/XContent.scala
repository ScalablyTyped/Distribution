package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a content with a type and an identifier, which is able to manage listeners for events that are related to contents.
  * @author Kai Sommerfeld
  * @see XContentIdentifier
  * @see XContentEventListener
  * @version 1.0
  */
trait XContent
  extends StObject
     with XInterface {
  
  /**
    * returns a type string, which is unique for that type of content (e.g. "application/vnd.sun.star.hierarchy-folder").
    * @returns the content type string.
    */
  val ContentType: String
  
  /**
    * returns the identifier of the content.
    * @returns the identifier.
    */
  val Identifier: XContentIdentifier
  
  /**
    * adds a listener for content events.
    * @param Listener the listener to add.
    * @see ContentEvent
    */
  def addContentEventListener(Listener: XContentEventListener): Unit
  
  /**
    * returns a type string, which is unique for that type of content (e.g. "application/vnd.sun.star.hierarchy-folder").
    * @returns the content type string.
    */
  def getContentType(): String
  
  /**
    * returns the identifier of the content.
    * @returns the identifier.
    */
  def getIdentifier(): XContentIdentifier
  
  /**
    * removes a listener for content events.
    * @param Listener the listener to remove.
    * @see ContentEvent
    */
  def removeContentEventListener(Listener: XContentEventListener): Unit
}
object XContent {
  
  inline def apply(
    ContentType: String,
    Identifier: XContentIdentifier,
    acquire: () => Unit,
    addContentEventListener: XContentEventListener => Unit,
    getContentType: () => String,
    getIdentifier: () => XContentIdentifier,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeContentEventListener: XContentEventListener => Unit
  ): XContent = {
    val __obj = js.Dynamic.literal(ContentType = ContentType.asInstanceOf[js.Any], Identifier = Identifier.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addContentEventListener = js.Any.fromFunction1(addContentEventListener), getContentType = js.Any.fromFunction0(getContentType), getIdentifier = js.Any.fromFunction0(getIdentifier), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeContentEventListener = js.Any.fromFunction1(removeContentEventListener))
    __obj.asInstanceOf[XContent]
  }
  
  extension [Self <: XContent](x: Self) {
    
    inline def setAddContentEventListener(value: XContentEventListener => Unit): Self = StObject.set(x, "addContentEventListener", js.Any.fromFunction1(value))
    
    inline def setContentType(value: String): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setGetContentType(value: () => String): Self = StObject.set(x, "getContentType", js.Any.fromFunction0(value))
    
    inline def setGetIdentifier(value: () => XContentIdentifier): Self = StObject.set(x, "getIdentifier", js.Any.fromFunction0(value))
    
    inline def setIdentifier(value: XContentIdentifier): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setRemoveContentEventListener(value: XContentEventListener => Unit): Self = StObject.set(x, "removeContentEventListener", js.Any.fromFunction1(value))
  }
}
