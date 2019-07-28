package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKeyConfig extends js.Object {
  /**
    * A unique number that ensures that the request can't be replayed.
    */
  var CallerReference: String
  /**
    * An optional comment about a public key.
    */
  var Comment: js.UndefOr[String] = js.undefined
  /**
    * The encoded public key that you want to add to CloudFront to use with features like field-level encryption.
    */
  var EncodedKey: String
  /**
    * The name for a public key you add to CloudFront to use with features like field-level encryption.
    */
  var Name: String
}

object PublicKeyConfig {
  @scala.inline
  def apply(CallerReference: String, EncodedKey: String, Name: String, Comment: String = null): PublicKeyConfig = {
    val __obj = js.Dynamic.literal(CallerReference = CallerReference, EncodedKey = EncodedKey, Name = Name)
    if (Comment != null) __obj.updateDynamic("Comment")(Comment)
    __obj.asInstanceOf[PublicKeyConfig]
  }
}

