package typings.awsDashSdk.clientsDataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportAssetsToS3ResponseDetails extends js.Object {
  /**
    * The destination in Amazon S3 where the asset is exported.
    */
  var AssetDestinations: ListOfAssetDestinationEntry = js.native
  /**
    * The unique identifier for the data set associated with this export job.
    */
  var DataSetId: Id = js.native
  /**
    * The unique identifier for the revision associated with this export response.
    */
  var RevisionId: Id = js.native
}

object ExportAssetsToS3ResponseDetails {
  @scala.inline
  def apply(AssetDestinations: ListOfAssetDestinationEntry, DataSetId: Id, RevisionId: Id): ExportAssetsToS3ResponseDetails = {
    val __obj = js.Dynamic.literal(AssetDestinations = AssetDestinations.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExportAssetsToS3ResponseDetails]
  }
}

