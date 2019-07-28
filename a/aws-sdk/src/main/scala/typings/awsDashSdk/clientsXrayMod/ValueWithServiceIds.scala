package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueWithServiceIds extends js.Object {
  /**
    * Values of the annotation.
    */
  var AnnotationValue: js.UndefOr[typings.awsDashSdk.clientsXrayMod.AnnotationValue] = js.undefined
  /**
    * Services to which the annotation applies.
    */
  var ServiceIds: js.UndefOr[typings.awsDashSdk.clientsXrayMod.ServiceIds] = js.undefined
}

object ValueWithServiceIds {
  @scala.inline
  def apply(AnnotationValue: AnnotationValue = null, ServiceIds: ServiceIds = null): ValueWithServiceIds = {
    val __obj = js.Dynamic.literal()
    if (AnnotationValue != null) __obj.updateDynamic("AnnotationValue")(AnnotationValue)
    if (ServiceIds != null) __obj.updateDynamic("ServiceIds")(ServiceIds)
    __obj.asInstanceOf[ValueWithServiceIds]
  }
}

