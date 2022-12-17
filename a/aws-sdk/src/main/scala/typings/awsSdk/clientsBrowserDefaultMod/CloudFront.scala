package typings.awsSdk.clientsBrowserDefaultMod

import typings.awsSdk.clientsCloudfrontMod.ClientConfiguration
import typings.awsSdk.clientsCloudfrontMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/clients/browser_default", "CloudFront")
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
open class CloudFront () extends ^ {
  def this(options: ClientConfiguration) = this()
}
object CloudFront {
  
  @JSImport("aws-sdk/clients/browser_default", "CloudFront.Signer")
  @js.native
  open class Signer protected ()
    extends typings.awsSdk.clientsCloudfrontMod.Signer {
    /**
      * A signer object can be used to generate signed URLs and cookies for granting access to content on restricted CloudFront distributions.
      * 
      * @param {string} keyPairId - The ID of the CloudFront key pair being used.
      * @param {string} privateKey - A private key in RSA format.
      */
    def this(keyPairId: String, privateKey: String) = this()
  }
}
