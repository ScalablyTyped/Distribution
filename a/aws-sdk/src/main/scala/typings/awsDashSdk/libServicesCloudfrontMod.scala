package typings.awsDashSdk

import org.scalablytyped.runtime.Instantiable2
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/services/cloudfront", JSImport.Namespace)
@js.native
object libServicesCloudfrontMod extends js.Object {
  @js.native
  class CloudFrontCustomizations () extends Service
  
  /* static members */
  @js.native
  object CloudFrontCustomizations extends js.Object {
    var Signer: Instantiable2[
        /* keyPairId */ String, 
        /* privateKey */ String, 
        typings.awsDashSdk.libCloudfrontSignerMod.Signer
      ] = js.native
  }
  
}

