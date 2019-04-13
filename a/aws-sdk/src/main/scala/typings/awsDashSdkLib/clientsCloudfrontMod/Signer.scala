package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/cloudfront", "Signer")
@js.native
class Signer protected ()
  extends awsDashSdkLib.libCloudfrontSignerMod.Signer {
  /**
    * A signer object can be used to generate signed URLs and cookies for granting access to content on restricted CloudFront distributions.
    * 
    * @param {string} keyPairId - The ID of the CloudFront key pair being used.
    * @param {string} privateKey - A private key in RSA format.
    */
  def this(keyPairId: java.lang.String, privateKey: java.lang.String) = this()
}

