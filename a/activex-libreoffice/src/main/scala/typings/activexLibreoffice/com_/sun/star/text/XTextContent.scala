package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** enables objects to be inserted into a text and to provide their location in a text once they are inserted into it. */
@js.native
trait XTextContent extends XComponent {
  
  /** @returns the text range to which the content is attached.  Note: The anchor of the actual implementation for text tables does not have a position in the t */
  val Anchor: XTextRange = js.native
  
  /**
    * is called when this object gets embedded in a text.
    *
    * This acts like a multi-phase construction, thus the object may be invalid until it is attached to a text position. Usually this method is called from
    * within {@link XText.insertTextContent()} .
    *
    * Both text objects and text content objects may only be connected to each other if they are created by the same component. When implementing new
    * components, this behavior is deprecated.
    */
  def attach(xTextRange: XTextRange): Unit = js.native
  
  /** @returns the text range to which the content is attached.  Note: The anchor of the actual implementation for text tables does not have a position in the t */
  def getAnchor(): XTextRange = js.native
}
object XTextContent {
  
  @scala.inline
  def apply(
    Anchor: XTextRange,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    attach: XTextRange => Unit,
    dispose: () => Unit,
    getAnchor: () => XTextRange,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): XTextContent = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[XTextContent]
  }
  
  @scala.inline
  implicit class XTextContentOps[Self <: XTextContent] (val x: Self) extends AnyVal {
    
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
    def setAnchor(value: XTextRange): Self = this.set("Anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttach(value: XTextRange => Unit): Self = this.set("attach", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAnchor(value: () => XTextRange): Self = this.set("getAnchor", js.Any.fromFunction0(value))
  }
}
