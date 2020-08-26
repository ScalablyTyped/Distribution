package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is supported by objects with data that can be updated from a data source. */
@js.native
trait XUpdatable extends XInterface {
  /** refreshes the data of the object from the connected data source. */
  def update(): Unit = js.native
}

object XUpdatable {
  @scala.inline
  def apply(acquire: () => Unit, queryInterface: `type` => js.Any, release: () => Unit, update: () => Unit): XUpdatable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[XUpdatable]
  }
  @scala.inline
  implicit class XUpdatableOps[Self <: XUpdatable] (val x: Self) extends AnyVal {
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
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
  }
  
}

