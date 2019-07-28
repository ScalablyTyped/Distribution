package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKey extends js.Object {
  /**
    * A time you added a public key to CloudFront.
    */
  var CreatedTime: timestamp
  /**
    * A unique ID assigned to a public key you've added to CloudFront.
    */
  var Id: String
  /**
    * A complex data type for a public key you add to CloudFront to use with features like field-level encryption.
    */
  var PublicKeyConfig: typings.awsDashSdk.clientsCloudfrontMod.PublicKeyConfig
}

object PublicKey {
  @scala.inline
  def apply(CreatedTime: timestamp, Id: String, PublicKeyConfig: PublicKeyConfig): PublicKey = {
    val __obj = js.Dynamic.literal(CreatedTime = CreatedTime, Id = Id, PublicKeyConfig = PublicKeyConfig)
  
    __obj.asInstanceOf[PublicKey]
  }
}

