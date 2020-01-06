package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageScanFindingsSummary extends js.Object {
  /**
    * The image vulnerability counts, sorted by severity.
    */
  var findingSeverityCounts: js.UndefOr[FindingSeverityCounts] = js.native
  /**
    * The time of the last completed image scan.
    */
  var imageScanCompletedAt: js.UndefOr[ScanTimestamp] = js.native
  /**
    * The time when the vulnerability data was last scanned.
    */
  var vulnerabilitySourceUpdatedAt: js.UndefOr[VulnerabilitySourceUpdateTimestamp] = js.native
}

object ImageScanFindingsSummary {
  @scala.inline
  def apply(
    findingSeverityCounts: FindingSeverityCounts = null,
    imageScanCompletedAt: ScanTimestamp = null,
    vulnerabilitySourceUpdatedAt: VulnerabilitySourceUpdateTimestamp = null
  ): ImageScanFindingsSummary = {
    val __obj = js.Dynamic.literal()
    if (findingSeverityCounts != null) __obj.updateDynamic("findingSeverityCounts")(findingSeverityCounts.asInstanceOf[js.Any])
    if (imageScanCompletedAt != null) __obj.updateDynamic("imageScanCompletedAt")(imageScanCompletedAt.asInstanceOf[js.Any])
    if (vulnerabilitySourceUpdatedAt != null) __obj.updateDynamic("vulnerabilitySourceUpdatedAt")(vulnerabilitySourceUpdatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageScanFindingsSummary]
  }
}

