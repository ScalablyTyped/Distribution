package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** creates an {@link XAnyCompare} instance. */
@js.native
trait XAnyCompareFactory extends XInterface {
  /**
    * creates an {@link XAnyCompare} instance.
    * @param PropertyName is the name of a property
    * @returns a compare interface
    */
  def createAnyCompareByName(PropertyName: String): XAnyCompare = js.native
}

object XAnyCompareFactory {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createAnyCompareByName: String => XAnyCompare,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAnyCompareFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createAnyCompareByName = js.Any.fromFunction1(createAnyCompareByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAnyCompareFactory]
  }
  @scala.inline
  implicit class XAnyCompareFactoryOps[Self <: XAnyCompareFactory] (val x: Self) extends AnyVal {
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
    def setCreateAnyCompareByName(value: String => XAnyCompare): Self = this.set("createAnyCompareByName", js.Any.fromFunction1(value))
  }
  
}

