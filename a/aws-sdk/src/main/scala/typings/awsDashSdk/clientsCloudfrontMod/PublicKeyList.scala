package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicKeyList extends js.Object {
  /**
    * An array of information about a public key you add to CloudFront to use with features like field-level encryption.
    */
  var Items: js.UndefOr[PublicKeySummaryList] = js.native
  /**
    * The maximum number of public keys you want in the response body. 
    */
  var MaxItems: integer = js.native
  /**
    * If there are more elements to be listed, this element is present and contains the value that you can use for the Marker request parameter to continue listing your public keys where you left off.
    */
  var NextMarker: js.UndefOr[String] = js.native
  /**
    * The number of public keys you added to CloudFront to use with features like field-level encryption.
    */
  var Quantity: integer = js.native
}

object PublicKeyList {
  @scala.inline
  def apply(
    MaxItems: integer,
    Quantity: integer,
    Items: PublicKeySummaryList = null,
    NextMarker: String = null
  ): PublicKeyList = {
    val __obj = js.Dynamic.literal(MaxItems = MaxItems.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    if (Items != null) __obj.updateDynamic("Items")(Items.asInstanceOf[js.Any])
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyList]
  }
}

