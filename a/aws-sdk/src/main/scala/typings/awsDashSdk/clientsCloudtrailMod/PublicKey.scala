package typings.awsDashSdk.clientsCloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKey extends js.Object {
  /**
    * The fingerprint of the public key.
    */
  var Fingerprint: js.UndefOr[String] = js.undefined
  /**
    * The ending time of validity of the public key.
    */
  var ValidityEndTime: js.UndefOr[_Date] = js.undefined
  /**
    * The starting time of validity of the public key.
    */
  var ValidityStartTime: js.UndefOr[_Date] = js.undefined
  /**
    * The DER encoded public key value in PKCS#1 format.
    */
  var Value: js.UndefOr[ByteBuffer] = js.undefined
}

object PublicKey {
  @scala.inline
  def apply(
    Fingerprint: String = null,
    ValidityEndTime: _Date = null,
    ValidityStartTime: _Date = null,
    Value: ByteBuffer = null
  ): PublicKey = {
    val __obj = js.Dynamic.literal()
    if (Fingerprint != null) __obj.updateDynamic("Fingerprint")(Fingerprint)
    if (ValidityEndTime != null) __obj.updateDynamic("ValidityEndTime")(ValidityEndTime)
    if (ValidityStartTime != null) __obj.updateDynamic("ValidityStartTime")(ValidityStartTime)
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKey]
  }
}

