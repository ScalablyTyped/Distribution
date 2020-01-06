package typings.awsDashSdk.clientsDataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAssetRequest extends js.Object {
  /**
    * The unique identifier for an asset.
    */
  var AssetId: __string = js.native
  /**
    * The unique identifier for a data set.
    */
  var DataSetId: __string = js.native
  /**
    * The unique identifier for a revision.
    */
  var RevisionId: __string = js.native
}

object GetAssetRequest {
  @scala.inline
  def apply(AssetId: __string, DataSetId: __string, RevisionId: __string): GetAssetRequest = {
    val __obj = js.Dynamic.literal(AssetId = AssetId.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetAssetRequest]
  }
}

