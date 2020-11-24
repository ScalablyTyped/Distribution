package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to attach this {@link TextField} to a {@link TextFieldMaster} . */
@js.native
trait XDependentTextField extends XTextField {
  
  /** @returns the previously attached {@link TextFieldMaster} */
  val TextFieldMaster: XPropertySet = js.native
  
  /**
    * method must be called to attach the {@link TextFieldMaster} to this {@link TextField} .
    *
    * A {@link TextFieldMaster} can only be assigned once.
    *
    * Example: Create and insert a user field (with a `UserField` ):
    *
    * {{program example here, see documentation}}
    */
  def attachTextFieldMaster(xFieldMaster: XPropertySet): Unit = js.native
  
  /** @returns the previously attached {@link TextFieldMaster} */
  def getTextFieldMaster(): XPropertySet = js.native
}
object XDependentTextField {
  
  @scala.inline
  def apply(
    Anchor: XTextRange,
    TextFieldMaster: XPropertySet,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    attach: XTextRange => Unit,
    attachTextFieldMaster: XPropertySet => Unit,
    dispose: () => Unit,
    getAnchor: () => XTextRange,
    getPresentation: Boolean => String,
    getTextFieldMaster: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): XDependentTextField = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], TextFieldMaster = TextFieldMaster.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attach = js.Any.fromFunction1(attach), attachTextFieldMaster = js.Any.fromFunction1(attachTextFieldMaster), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getPresentation = js.Any.fromFunction1(getPresentation), getTextFieldMaster = js.Any.fromFunction0(getTextFieldMaster), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[XDependentTextField]
  }
  
  @scala.inline
  implicit class XDependentTextFieldOps[Self <: XDependentTextField] (val x: Self) extends AnyVal {
    
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
    def setTextFieldMaster(value: XPropertySet): Self = this.set("TextFieldMaster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachTextFieldMaster(value: XPropertySet => Unit): Self = this.set("attachTextFieldMaster", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTextFieldMaster(value: () => XPropertySet): Self = this.set("getTextFieldMaster", js.Any.fromFunction0(value))
  }
}
