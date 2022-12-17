package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/clients/cloudfront", "Signer")
@js.native
open class Signer protected ()
  extends typings.awsSdk.libCloudfrontSignerMod.Signer {
  /**
    * A signer object can be used to generate signed URLs and cookies for granting access to content on restricted CloudFront distributions.
    * 
    * @param {string} keyPairId - The ID of the CloudFront key pair being used.
    * @param {string} privateKey - A private key in RSA format.
    */
  def this(keyPairId: String, privateKey: String) = this()
}
