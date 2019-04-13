package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKeyList extends js.Object {
  /**
    * An array of information about a public key you add to CloudFront to use with features like field-level encryption.
    */
  var Items: js.UndefOr[PublicKeySummaryList] = js.undefined
  /**
    * The maximum number of public keys you want in the response body. 
    */
  var MaxItems: integer
  /**
    * If there are more elements to be listed, this element is present and contains the value that you can use for the Marker request parameter to continue listing your public keys where you left off.
    */
  var NextMarker: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The number of public keys you added to CloudFront to use with features like field-level encryption.
    */
  var Quantity: integer
}

object PublicKeyList {
  @scala.inline
  def apply(
    MaxItems: integer,
    Quantity: integer,
    Items: PublicKeySummaryList = null,
    NextMarker: java.lang.String = null
  ): PublicKeyList = {
    val __obj = js.Dynamic.literal(MaxItems = MaxItems, Quantity = Quantity)
    if (Items != null) __obj.updateDynamic("Items")(Items)
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    __obj.asInstanceOf[PublicKeyList]
  }
}

