package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.task.XInteractionContinuation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interaction continuation handing back parameter data.
  *
  * This continuation is typically used in conjunction with a {@link com.sun.star.sdb.ParametersRequest} .
  */
@js.native
trait XInteractionSupplyParameters extends XInteractionContinuation {
  /**
    * set the parameters chosen by the interaction handler
    * @param Values the parameters to set
    */
  def setParameters(Values: SeqEquiv[PropertyValue]): Unit = js.native
}

object XInteractionSupplyParameters {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    select: () => Unit,
    setParameters: SeqEquiv[PropertyValue] => Unit
  ): XInteractionSupplyParameters = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), select = js.Any.fromFunction0(select), setParameters = js.Any.fromFunction1(setParameters))
    __obj.asInstanceOf[XInteractionSupplyParameters]
  }
  @scala.inline
  implicit class XInteractionSupplyParametersOps[Self <: XInteractionSupplyParameters] (val x: Self) extends AnyVal {
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
    def setSetParameters(value: SeqEquiv[PropertyValue] => Unit): Self = this.set("setParameters", js.Any.fromFunction1(value))
  }
  
}

