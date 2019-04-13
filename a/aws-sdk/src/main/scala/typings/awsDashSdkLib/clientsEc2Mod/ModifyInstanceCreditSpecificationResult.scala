package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyInstanceCreditSpecificationResult extends js.Object {
  /**
    * Information about the instances whose credit option for CPU usage was successfully modified.
    */
  var SuccessfulInstanceCreditSpecifications: js.UndefOr[SuccessfulInstanceCreditSpecificationSet] = js.undefined
  /**
    * Information about the instances whose credit option for CPU usage was not modified.
    */
  var UnsuccessfulInstanceCreditSpecifications: js.UndefOr[UnsuccessfulInstanceCreditSpecificationSet] = js.undefined
}

object ModifyInstanceCreditSpecificationResult {
  @scala.inline
  def apply(
    SuccessfulInstanceCreditSpecifications: SuccessfulInstanceCreditSpecificationSet = null,
    UnsuccessfulInstanceCreditSpecifications: UnsuccessfulInstanceCreditSpecificationSet = null
  ): ModifyInstanceCreditSpecificationResult = {
    val __obj = js.Dynamic.literal()
    if (SuccessfulInstanceCreditSpecifications != null) __obj.updateDynamic("SuccessfulInstanceCreditSpecifications")(SuccessfulInstanceCreditSpecifications)
    if (UnsuccessfulInstanceCreditSpecifications != null) __obj.updateDynamic("UnsuccessfulInstanceCreditSpecifications")(UnsuccessfulInstanceCreditSpecifications)
    __obj.asInstanceOf[ModifyInstanceCreditSpecificationResult]
  }
}

