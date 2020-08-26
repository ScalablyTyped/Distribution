package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.Uik
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
@js.native
trait XComponentRegistry extends XInterface {
  /** @deprecated Deprecated */
  def createObject(URL: String, Uik: Uik): XInterface = js.native
}

object XComponentRegistry {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createObject: (String, Uik) => XInterface,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XComponentRegistry = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createObject = js.Any.fromFunction2(createObject), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XComponentRegistry]
  }
  @scala.inline
  implicit class XComponentRegistryOps[Self <: XComponentRegistry] (val x: Self) extends AnyVal {
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
    def setCreateObject(value: (String, Uik) => XInterface): Self = this.set("createObject", js.Any.fromFunction2(value))
  }
  
}

