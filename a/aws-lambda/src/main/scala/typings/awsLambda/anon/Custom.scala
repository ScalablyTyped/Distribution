package typings.awsLambda.anon

import typings.awsLambda.commonCloudfrontMod.CloudFrontOrigin
import typings.awsLambda.commonCloudfrontMod.CloudFrontS3Origin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Custom
  extends StObject
     with CloudFrontOrigin {
  
  var custom: js.UndefOr[scala.Nothing] = js.undefined
  
  var s3: CloudFrontS3Origin
}
object Custom {
  
  inline def apply(s3: CloudFrontS3Origin): Custom = {
    val __obj = js.Dynamic.literal(s3 = s3.asInstanceOf[js.Any])
    __obj.asInstanceOf[Custom]
  }
  
  extension [Self <: Custom](x: Self) {
    
    inline def setS3(value: CloudFrontS3Origin): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
  }
}
