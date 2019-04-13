package typings
package awsDashSdkLib.clientsCloudfrontMod

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
  var Id: java.lang.String
  /**
    * A complex data type for a public key you add to CloudFront to use with features like field-level encryption.
    */
  var PublicKeyConfig: awsDashSdkLib.clientsCloudfrontMod.PublicKeyConfig
}

object PublicKey {
  @scala.inline
  def apply(CreatedTime: timestamp, Id: java.lang.String, PublicKeyConfig: PublicKeyConfig): PublicKey = {
    val __obj = js.Dynamic.literal(CreatedTime = CreatedTime, Id = Id, PublicKeyConfig = PublicKeyConfig)
  
    __obj.asInstanceOf[PublicKey]
  }
}

