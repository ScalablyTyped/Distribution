package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
@js.native
trait XContent extends XInterface {
  /**
    * returns a type string, which is unique for that type of content (e.g. "application/vnd.sun.star.hierarchy-folder").
    * @returns the content type string.
    */
  val ContentType: String = js.native
  /**
    * returns the identifier of the content.
    * @returns the identifier.
    */
  val Identifier: XContentIdentifier = js.native
  /**
    * adds a listener for content events.
    * @param Listener the listener to add.
    * @see ContentEvent
    */
  def addContentEventListener(Listener: XContentEventListener): Unit = js.native
  /**
    * returns a type string, which is unique for that type of content (e.g. "application/vnd.sun.star.hierarchy-folder").
    * @returns the content type string.
    */
  def getContentType(): String = js.native
  /**
    * returns the identifier of the content.
    * @returns the identifier.
    */
  def getIdentifier(): XContentIdentifier = js.native
  /**
    * removes a listener for content events.
    * @param Listener the listener to remove.
    * @see ContentEvent
    */
  def removeContentEventListener(Listener: XContentEventListener): Unit = js.native
}

object XContent {
  @scala.inline
  def apply(
    ContentType: String,
    Identifier: XContentIdentifier,
    acquire: () => Unit,
    addContentEventListener: XContentEventListener => Unit,
    getContentType: () => String,
    getIdentifier: () => XContentIdentifier,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeContentEventListener: XContentEventListener => Unit
  ): XContent = {
    val __obj = js.Dynamic.literal(ContentType = ContentType.asInstanceOf[js.Any], Identifier = Identifier.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addContentEventListener = js.Any.fromFunction1(addContentEventListener), getContentType = js.Any.fromFunction0(getContentType), getIdentifier = js.Any.fromFunction0(getIdentifier), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeContentEventListener = js.Any.fromFunction1(removeContentEventListener))
    __obj.asInstanceOf[XContent]
  }
  @scala.inline
  implicit class XContentOps[Self <: XContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContentType(value: String): Self = this.set("ContentType", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentifier(value: XContentIdentifier): Self = this.set("Identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddContentEventListener(value: XContentEventListener => Unit): Self = this.set("addContentEventListener", js.Any.fromFunction1(value))
    @scala.inline
    def setGetContentType(value: () => String): Self = this.set("getContentType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetIdentifier(value: () => XContentIdentifier): Self = this.set("getIdentifier", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveContentEventListener(value: XContentEventListener => Unit): Self = this.set("removeContentEventListener", js.Any.fromFunction1(value))
  }
  
}

