package typings.activexLibreoffice.com_.sun.star.style

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface provides access to an XPropertySet of defaults. This can either be the parent of an XPropertySet or the global property defaults for a
  * document.
  */
@js.native
trait XDefaultsSupplier extends XInterface {
  /** This method returns an XPropertySet of defaults. */
  val Defaults: XPropertySet = js.native
  /** This method returns an XPropertySet of defaults. */
  def getDefaults(): XPropertySet = js.native
}

object XDefaultsSupplier {
  @scala.inline
  def apply(
    Defaults: XPropertySet,
    acquire: () => Unit,
    getDefaults: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDefaultsSupplier = {
    val __obj = js.Dynamic.literal(Defaults = Defaults.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDefaults = js.Any.fromFunction0(getDefaults), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDefaultsSupplier]
  }
  @scala.inline
  implicit class XDefaultsSupplierOps[Self <: XDefaultsSupplier] (val x: Self) extends AnyVal {
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
    def setDefaults(value: XPropertySet): Self = this.set("Defaults", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetDefaults(value: () => XPropertySet): Self = this.set("getDefaults", js.Any.fromFunction0(value))
  }
  
}

