package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUploadsResult extends js.Object {
  /**
    * If the number of items that are returned is significantly large, this is an identifier that is also returned, which can be used in a subsequent call to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * Information about the uploads.
    */
  var uploads: js.UndefOr[Uploads] = js.undefined
}

object ListUploadsResult {
  @scala.inline
  def apply(nextToken: PaginationToken = null, uploads: Uploads = null): ListUploadsResult = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (uploads != null) __obj.updateDynamic("uploads")(uploads)
    __obj.asInstanceOf[ListUploadsResult]
  }
}

