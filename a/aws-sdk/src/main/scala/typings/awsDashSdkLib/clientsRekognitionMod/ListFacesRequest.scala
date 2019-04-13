package typings
package awsDashSdkLib.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFacesRequest extends js.Object {
  /**
    * ID of the collection from which to list the faces.
    */
  var CollectionId: awsDashSdkLib.clientsRekognitionMod.CollectionId
  /**
    * Maximum number of faces to return.
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  /**
    * If the previous response was incomplete (because there is more data to retrieve), Amazon Rekognition returns a pagination token in the response. You can use this pagination token to retrieve the next set of faces.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListFacesRequest {
  @scala.inline
  def apply(
    CollectionId: CollectionId,
    MaxResults: js.UndefOr[PageSize] = js.undefined,
    NextToken: PaginationToken = null
  ): ListFacesRequest = {
    val __obj = js.Dynamic.literal(CollectionId = CollectionId)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListFacesRequest]
  }
}

