package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a content with a type and an identifier, which is able to manage listeners for events that are related to contents.
  * @author Kai Sommerfeld
  * @see XContentIdentifier
  * @see XContentEventListener
  * @version 1.0
  */
trait XContent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns a type string, which is unique for that type of content (e.g. "application/vnd.sun.star.hierarchy-folder").
    * @returns the content type string.
    */
  val ContentType: java.lang.String
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
  def addContentEventListener(Listener: XContentEventListener): scala.Unit
  /**
    * returns a type string, which is unique for that type of content (e.g. "application/vnd.sun.star.hierarchy-folder").
    * @returns the content type string.
    */
  def getContentType(): java.lang.String
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
  def removeContentEventListener(Listener: XContentEventListener): scala.Unit
}

object XContent {
  @scala.inline
  def apply(
    ContentType: java.lang.String,
    Identifier: XContentIdentifier,
    acquire: js.Function0[scala.Unit],
    addContentEventListener: js.Function1[XContentEventListener, scala.Unit],
    getContentType: js.Function0[java.lang.String],
    getIdentifier: js.Function0[XContentIdentifier],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeContentEventListener: js.Function1[XContentEventListener, scala.Unit]
  ): XContent = {
    val __obj = js.Dynamic.literal(ContentType = ContentType, Identifier = Identifier, acquire = acquire, addContentEventListener = addContentEventListener, getContentType = getContentType, getIdentifier = getIdentifier, queryInterface = queryInterface, release = release, removeContentEventListener = removeContentEventListener)
  
    __obj.asInstanceOf[XContent]
  }
}

