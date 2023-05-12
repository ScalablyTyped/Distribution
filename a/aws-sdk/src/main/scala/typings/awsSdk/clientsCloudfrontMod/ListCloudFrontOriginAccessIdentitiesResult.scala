package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCloudFrontOriginAccessIdentitiesResult extends StObject {
  
  /**
    * The CloudFrontOriginAccessIdentityList type.
    */
  var CloudFrontOriginAccessIdentityList: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.CloudFrontOriginAccessIdentityList] = js.undefined
}
object ListCloudFrontOriginAccessIdentitiesResult {
  
  inline def apply(): ListCloudFrontOriginAccessIdentitiesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCloudFrontOriginAccessIdentitiesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListCloudFrontOriginAccessIdentitiesResult] (val x: Self) extends AnyVal {
    
    inline def setCloudFrontOriginAccessIdentityList(value: CloudFrontOriginAccessIdentityList): Self = StObject.set(x, "CloudFrontOriginAccessIdentityList", value.asInstanceOf[js.Any])
    
    inline def setCloudFrontOriginAccessIdentityListUndefined: Self = StObject.set(x, "CloudFrontOriginAccessIdentityList", js.undefined)
  }
}
