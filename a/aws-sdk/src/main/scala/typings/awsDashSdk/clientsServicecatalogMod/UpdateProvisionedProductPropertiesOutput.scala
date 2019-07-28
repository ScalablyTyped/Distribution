package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateProvisionedProductPropertiesOutput extends js.Object {
  /**
    * The provisioned product identifier.
    */
  var ProvisionedProductId: js.UndefOr[Id] = js.undefined
  /**
    * A map that contains the properties updated.
    */
  var ProvisionedProductProperties: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ProvisionedProductProperties] = js.undefined
  /**
    * The identifier of the record.
    */
  var RecordId: js.UndefOr[Id] = js.undefined
  /**
    * The status of the request.
    */
  var Status: js.UndefOr[RecordStatus] = js.undefined
}

object UpdateProvisionedProductPropertiesOutput {
  @scala.inline
  def apply(
    ProvisionedProductId: Id = null,
    ProvisionedProductProperties: ProvisionedProductProperties = null,
    RecordId: Id = null,
    Status: RecordStatus = null
  ): UpdateProvisionedProductPropertiesOutput = {
    val __obj = js.Dynamic.literal()
    if (ProvisionedProductId != null) __obj.updateDynamic("ProvisionedProductId")(ProvisionedProductId)
    if (ProvisionedProductProperties != null) __obj.updateDynamic("ProvisionedProductProperties")(ProvisionedProductProperties)
    if (RecordId != null) __obj.updateDynamic("RecordId")(RecordId)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProvisionedProductPropertiesOutput]
  }
}

