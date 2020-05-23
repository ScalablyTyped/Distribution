package typings.activexLibreoffice.com_.sun.star.view

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to the view settings of the object. */
trait XViewSettingsSupplier extends XInterface {
  /** @returns an interface to the {@link ViewSettings} .  Subclasses might be returned instead, offering more settings. */
  val ViewSettings: XPropertySet
  /** @returns an interface to the {@link ViewSettings} .  Subclasses might be returned instead, offering more settings. */
  def getViewSettings(): XPropertySet
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
}

