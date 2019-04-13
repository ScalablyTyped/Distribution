package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKeyConfig extends js.Object {
  /**
    * A unique number that ensures that the request can't be replayed.
    */
  var CallerReference: java.lang.String
  /**
    * An optional comment about a public key.
    */
  var Comment: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The encoded public key that you want to add to CloudFront to use with features like field-level encryption.
    */
  var EncodedKey: java.lang.String
  /**
    * The name for a public key you add to CloudFront to use with features like field-level encryption.
    */
  var Name: java.lang.String
}

object PublicKeyConfig {
  @scala.inline
  def apply(
    CallerReference: java.lang.String,
    EncodedKey: java.lang.String,
    Name: java.lang.String,
    Comment: java.lang.String = null
  ): PublicKeyConfig = {
    val __obj = js.Dynamic.literal(CallerReference = CallerReference, EncodedKey = EncodedKey, Name = Name)
    if (Comment != null) __obj.updateDynamic("Comment")(Comment)
    __obj.asInstanceOf[PublicKeyConfig]
  }
}

