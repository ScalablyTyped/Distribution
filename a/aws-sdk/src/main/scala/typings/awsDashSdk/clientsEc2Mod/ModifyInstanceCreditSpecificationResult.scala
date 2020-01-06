package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyInstanceCreditSpecificationResult extends js.Object {
  /**
    * Information about the instances whose credit option for CPU usage was successfully modified.
    */
  var SuccessfulInstanceCreditSpecifications: js.UndefOr[SuccessfulInstanceCreditSpecificationSet] = js.native
  /**
    * Information about the instances whose credit option for CPU usage was not modified.
    */
  var UnsuccessfulInstanceCreditSpecifications: js.UndefOr[UnsuccessfulInstanceCreditSpecificationSet] = js.native
}

object ModifyInstanceCreditSpecificationResult {
  @scala.inline
  def apply(
    SuccessfulInstanceCreditSpecifications: SuccessfulInstanceCreditSpecificationSet = null,
    UnsuccessfulInstanceCreditSpecifications: UnsuccessfulInstanceCreditSpecificationSet = null
  ): ModifyInstanceCreditSpecificationResult = {
    val __obj = js.Dynamic.literal()
    if (SuccessfulInstanceCreditSpecifications != null) __obj.updateDynamic("SuccessfulInstanceCreditSpecifications")(SuccessfulInstanceCreditSpecifications.asInstanceOf[js.Any])
    if (UnsuccessfulInstanceCreditSpecifications != null) __obj.updateDynamic("UnsuccessfulInstanceCreditSpecifications")(UnsuccessfulInstanceCreditSpecifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyInstanceCreditSpecificationResult]
  }
}

