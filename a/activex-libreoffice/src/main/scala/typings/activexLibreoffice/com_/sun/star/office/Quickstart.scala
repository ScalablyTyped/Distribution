package typings.activexLibreoffice.com_.sun.star.office

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XFastPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.2 */
@js.native
trait Quickstart extends XFastPropertySet {
  /** The first two parameters are ignored */
  def createAndSetVeto(p1: Boolean, p2: Boolean, DisableVeto: Boolean): Unit = js.native
  def createAutoStart(bQuickstart: Boolean, bAutostart: Boolean): Unit = js.native
  def createDefault(): Unit = js.native
  def createStart(bQuickstart: Boolean): Unit = js.native
}

object Quickstart {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createAndSetVeto: (Boolean, Boolean, Boolean) => Unit,
    createAutoStart: (Boolean, Boolean) => Unit,
    createDefault: () => Unit,
    createStart: Boolean => Unit,
    getFastPropertyValue: Double => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setFastPropertyValue: (Double, js.Any) => Unit
  ): Quickstart = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createAndSetVeto = js.Any.fromFunction3(createAndSetVeto), createAutoStart = js.Any.fromFunction2(createAutoStart), createDefault = js.Any.fromFunction0(createDefault), createStart = js.Any.fromFunction1(createStart), getFastPropertyValue = js.Any.fromFunction1(getFastPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFastPropertyValue = js.Any.fromFunction2(setFastPropertyValue))
    __obj.asInstanceOf[Quickstart]
  }
  @scala.inline
  implicit class QuickstartOps[Self <: Quickstart] (val x: Self) extends AnyVal {
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
    def setCreateAndSetVeto(value: (Boolean, Boolean, Boolean) => Unit): Self = this.set("createAndSetVeto", js.Any.fromFunction3(value))
    @scala.inline
    def setCreateAutoStart(value: (Boolean, Boolean) => Unit): Self = this.set("createAutoStart", js.Any.fromFunction2(value))
    @scala.inline
    def setCreateDefault(value: () => Unit): Self = this.set("createDefault", js.Any.fromFunction0(value))
    @scala.inline
    def setCreateStart(value: Boolean => Unit): Self = this.set("createStart", js.Any.fromFunction1(value))
  }
  
}

