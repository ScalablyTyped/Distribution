package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to user-visible strings for a solver. */
@js.native
trait XSolverDescription extends XInterface {
  /** A user-visible name of the component. */
  var ComponentDescription: String = js.native
  /** After calling solve, a message describing the status (explaining why no solution was found). */
  var StatusDescription: String = js.native
  /** returns a short description for a property in the component's {@link com.sun.star.beans.XPropertySet} interface. */
  def getPropertyDescription(aPropertyName: String): String = js.native
}

object XSolverDescription {
  @scala.inline
  def apply(
    ComponentDescription: String,
    StatusDescription: String,
    acquire: () => Unit,
    getPropertyDescription: String => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSolverDescription = {
    val __obj = js.Dynamic.literal(ComponentDescription = ComponentDescription.asInstanceOf[js.Any], StatusDescription = StatusDescription.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getPropertyDescription = js.Any.fromFunction1(getPropertyDescription), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSolverDescription]
  }
  @scala.inline
  implicit class XSolverDescriptionOps[Self <: XSolverDescription] (val x: Self) extends AnyVal {
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
    def setComponentDescription(value: String): Self = this.set("ComponentDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusDescription(value: String): Self = this.set("StatusDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetPropertyDescription(value: String => String): Self = this.set("getPropertyDescription", js.Any.fromFunction1(value))
  }
  
}

