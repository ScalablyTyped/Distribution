package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides the access to a collection of forms. */
@js.native
trait XFormsSupplier extends XInterface {
  /**
    * accesses the forms.
    *
    * {{program example here, see documentation}}
    * @returns the container of all the top-level forms belonging to the component.
    */
  val Forms: XNameContainer = js.native
  /**
    * accesses the forms.
    *
    * {{program example here, see documentation}}
    * @returns the container of all the top-level forms belonging to the component.
    */
  def getForms(): XNameContainer = js.native
}

object XFormsSupplier {
  @scala.inline
  def apply(
    Forms: XNameContainer,
    acquire: () => Unit,
    getForms: () => XNameContainer,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFormsSupplier = {
    val __obj = js.Dynamic.literal(Forms = Forms.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getForms = js.Any.fromFunction0(getForms), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XFormsSupplier]
  }
  @scala.inline
  implicit class XFormsSupplierOps[Self <: XFormsSupplier] (val x: Self) extends AnyVal {
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
    def setForms(value: XNameContainer): Self = this.set("Forms", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetForms(value: () => XNameContainer): Self = this.set("getForms", js.Any.fromFunction0(value))
  }
  
}

