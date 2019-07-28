package typings.awsDashSdk.clientsCloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPublicKeysResponse extends js.Object {
  /**
    * Reserved for future use.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * Contains an array of PublicKey objects.  The returned public keys may have validity time ranges that overlap. 
    */
  var PublicKeyList: js.UndefOr[typings.awsDashSdk.clientsCloudtrailMod.PublicKeyList] = js.undefined
}

object ListPublicKeysResponse {
  @scala.inline
  def apply(NextToken: String = null, PublicKeyList: PublicKeyList = null): ListPublicKeysResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (PublicKeyList != null) __obj.updateDynamic("PublicKeyList")(PublicKeyList)
    __obj.asInstanceOf[ListPublicKeysResponse]
  }
}

