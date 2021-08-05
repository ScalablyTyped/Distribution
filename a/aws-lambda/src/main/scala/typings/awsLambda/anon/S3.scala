package typings.awsLambda.anon

import typings.awsLambda.cloudfrontMod.CloudFrontCustomOrigin
import typings.awsLambda.cloudfrontMod.CloudFrontOrigin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3
  extends StObject
     with CloudFrontOrigin {
  
  var custom: CloudFrontCustomOrigin
  
  var s3: js.UndefOr[scala.Nothing] = js.undefined
}
object S3 {
  
  inline def apply(custom: CloudFrontCustomOrigin): S3 = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3]
  }
  
  extension [Self <: S3](x: Self) {
    
    inline def setCustom(value: CloudFrontCustomOrigin): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
  }
}
