package typings
package awsDashSdkLib.clientsMediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAssetsResponse extends js.Object {
  /**
    * A list of MediaPackage VOD Asset resources.
    */
  var Assets: js.UndefOr[__listOfAssetShallow] = js.undefined
  /**
    * A token that can be used to resume pagination from the end of the collection.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ListAssetsResponse {
  @scala.inline
  def apply(Assets: __listOfAssetShallow = null, NextToken: __string = null): ListAssetsResponse = {
    val __obj = js.Dynamic.literal()
    if (Assets != null) __obj.updateDynamic("Assets")(Assets)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListAssetsResponse]
  }
}

