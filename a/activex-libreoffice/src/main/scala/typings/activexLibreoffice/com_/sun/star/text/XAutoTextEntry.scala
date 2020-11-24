package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * identifies an autotext entry.
  * @deprecated Deprecated
  */
@js.native
trait XAutoTextEntry extends XInterface {
  
  /** inserts the contents represented by this auto text entry at the specified text range. */
  def applyTo(xRange: XTextRange): Unit = js.native
}
object XAutoTextEntry {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    applyTo: XTextRange => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAutoTextEntry = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), applyTo = js.Any.fromFunction1(applyTo), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAutoTextEntry]
  }
  
  @scala.inline
  implicit class XAutoTextEntryOps[Self <: XAutoTextEntry] (val x: Self) extends AnyVal {
    
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
    def setApplyTo(value: XTextRange => Unit): Self = this.set("applyTo", js.Any.fromFunction1(value))
  }
}
