package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CfCloudFrontEventreadonlyre extends StObject {
  
  var cf: CloudFrontEventreadonlyre = js.native
}
object CfCloudFrontEventreadonlyre {
  
  @scala.inline
  def apply(cf: CloudFrontEventreadonlyre): CfCloudFrontEventreadonlyre = {
    val __obj = js.Dynamic.literal(cf = cf.asInstanceOf[js.Any])
    __obj.asInstanceOf[CfCloudFrontEventreadonlyre]
  }
  
  @scala.inline
  implicit class CfCloudFrontEventreadonlyreMutableBuilder[Self <: CfCloudFrontEventreadonlyre] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCf(value: CloudFrontEventreadonlyre): Self = StObject.set(x, "cf", value.asInstanceOf[js.Any])
  }
}
