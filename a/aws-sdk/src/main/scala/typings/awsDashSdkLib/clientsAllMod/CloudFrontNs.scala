package typings
package awsDashSdkLib.clientsAllMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/all", "CloudFront")
@js.native
object CloudFrontNs extends js.Object {
  @js.native
  class Signer protected ()
    extends awsDashSdkLib.clientsCloudfrontMod.Signer {
    /**
      * A signer object can be used to generate signed URLs and cookies for granting access to content on restricted CloudFront distributions.
      * 
      * @param {string} keyPairId - The ID of the CloudFront key pair being used.
      * @param {string} privateKey - A private key in RSA format.
      */
    def this(keyPairId: java.lang.String, privateKey: java.lang.String) = this()
  }
  
}

