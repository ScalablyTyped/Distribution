package typings.activexLibreoffice.com_.sun.star.view

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to the view settings of the object. */
@js.native
trait XViewSettingsSupplier extends XInterface {
  /** @returns an interface to the {@link ViewSettings} .  Subclasses might be returned instead, offering more settings. */
  val ViewSettings: XPropertySet = js.native
  /** @returns an interface to the {@link ViewSettings} .  Subclasses might be returned instead, offering more settings. */
  def getViewSettings(): XPropertySet = js.native
}

object XViewSettingsSupplier {
  @scala.inline
  def apply(
    ViewSettings: XPropertySet,
    acquire: () => Unit,
    getViewSettings: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XViewSettingsSupplier = {
    val __obj = js.Dynamic.literal(ViewSettings = ViewSettings.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getViewSettings = js.Any.fromFunction0(getViewSettings), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XViewSettingsSupplier]
  }
  @scala.inline
  implicit class XViewSettingsSupplierOps[Self <: XViewSettingsSupplier] (val x: Self) extends AnyVal {
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
    def setViewSettings(value: XPropertySet): Self = this.set("ViewSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetViewSettings(value: () => XPropertySet): Self = this.set("getViewSettings", js.Any.fromFunction0(value))
  }
  
}

