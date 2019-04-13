package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPublicKeysResult extends js.Object {
  /**
    * Returns a list of all public keys that have been added to CloudFront for this account.
    */
  var PublicKeyList: js.UndefOr[PublicKeyList] = js.undefined
}

object ListPublicKeysResult {
  @scala.inline
  def apply(PublicKeyList: PublicKeyList = null): ListPublicKeysResult = {
    val __obj = js.Dynamic.literal()
    if (PublicKeyList != null) __obj.updateDynamic("PublicKeyList")(PublicKeyList)
    __obj.asInstanceOf[ListPublicKeysResult]
  }
}

