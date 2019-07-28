package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestoreRequest extends js.Object {
  /**
    * Lifetime of the active copy in days. Do not use with restores that specify OutputLocation.
    */
  var Days: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Days] = js.undefined
  /**
    * The optional description for the job.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Description] = js.undefined
  /**
    * Glacier related parameters pertaining to this job. Do not use with restores that specify OutputLocation.
    */
  var GlacierJobParameters: js.UndefOr[typings.awsDashSdk.clientsS3Mod.GlacierJobParameters] = js.undefined
  /**
    * Describes the location where the restore job's output is stored.
    */
  var OutputLocation: js.UndefOr[typings.awsDashSdk.clientsS3Mod.OutputLocation] = js.undefined
  /**
    * Describes the parameters for Select job types.
    */
  var SelectParameters: js.UndefOr[typings.awsDashSdk.clientsS3Mod.SelectParameters] = js.undefined
  /**
    * Glacier retrieval tier at which the restore will be processed.
    */
  var Tier: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Tier] = js.undefined
  /**
    * Type of restore request.
    */
  var Type: js.UndefOr[RestoreRequestType] = js.undefined
}

object RestoreRequest {
  @scala.inline
  def apply(
    Days: js.UndefOr[Days] = js.undefined,
    Description: Description = null,
    GlacierJobParameters: GlacierJobParameters = null,
    OutputLocation: OutputLocation = null,
    SelectParameters: SelectParameters = null,
    Tier: Tier = null,
    Type: RestoreRequestType = null
  ): RestoreRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Days)) __obj.updateDynamic("Days")(Days)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (GlacierJobParameters != null) __obj.updateDynamic("GlacierJobParameters")(GlacierJobParameters)
    if (OutputLocation != null) __obj.updateDynamic("OutputLocation")(OutputLocation)
    if (SelectParameters != null) __obj.updateDynamic("SelectParameters")(SelectParameters)
    if (Tier != null) __obj.updateDynamic("Tier")(Tier.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreRequest]
  }
}

