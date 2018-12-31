package typings
package awsDashSdkLib.libServicesCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/services/cloudfront", "CloudFrontCustomizations")
@js.native
class CloudFrontCustomizations ()
  extends awsDashSdkLib.libServiceMod.Service

@JSImport("aws-sdk/lib/services/cloudfront", "CloudFrontCustomizations")
@js.native
object CloudFrontCustomizations extends js.Object {
  var Signer: org.scalablytyped.runtime.Instantiable2[
    /* keyPairId */ java.lang.String, 
    /* privateKey */ java.lang.String, 
    awsDashSdkLib.libCloudfrontSignerMod.Signer
  ] = js.native
}

