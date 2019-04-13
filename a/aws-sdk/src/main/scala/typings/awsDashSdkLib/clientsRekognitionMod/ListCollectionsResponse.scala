package typings
package awsDashSdkLib.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCollectionsResponse extends js.Object {
  /**
    * An array of collection IDs.
    */
  var CollectionIds: js.UndefOr[CollectionIdList] = js.undefined
  /**
    * Version numbers of the face detection models associated with the collections in the array CollectionIds. For example, the value of FaceModelVersions[2] is the version number for the face detection model used by the collection in CollectionId[2].
    */
  var FaceModelVersions: js.UndefOr[FaceModelVersionList] = js.undefined
  /**
    * If the result is truncated, the response provides a NextToken that you can use in the subsequent request to fetch the next set of collection IDs.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListCollectionsResponse {
  @scala.inline
  def apply(
    CollectionIds: CollectionIdList = null,
    FaceModelVersions: FaceModelVersionList = null,
    NextToken: PaginationToken = null
  ): ListCollectionsResponse = {
    val __obj = js.Dynamic.literal()
    if (CollectionIds != null) __obj.updateDynamic("CollectionIds")(CollectionIds)
    if (FaceModelVersions != null) __obj.updateDynamic("FaceModelVersions")(FaceModelVersions)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListCollectionsResponse]
  }
}

