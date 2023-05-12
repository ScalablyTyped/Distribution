package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAppVersionResourceResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:partition:resiliencehub:region:account:app/app-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference guide.
    */
  var appArn: Arn
  
  /**
    * The Resilience Hub application version.
    */
  var appVersion: EntityVersion
  
  /**
    * Defines a physical resource. A physical resource is a resource that exists in your account. It can be identified using an Amazon Resource Name (ARN) or a Resilience Hub-native identifier.
    */
  var physicalResource: js.UndefOr[PhysicalResource] = js.undefined
}
object DeleteAppVersionResourceResponse {
  
  inline def apply(appArn: Arn, appVersion: EntityVersion): DeleteAppVersionResourceResponse = {
    val __obj = js.Dynamic.literal(appArn = appArn.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAppVersionResourceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteAppVersionResourceResponse] (val x: Self) extends AnyVal {
    
    inline def setAppArn(value: Arn): Self = StObject.set(x, "appArn", value.asInstanceOf[js.Any])
    
    inline def setAppVersion(value: EntityVersion): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
    
    inline def setPhysicalResource(value: PhysicalResource): Self = StObject.set(x, "physicalResource", value.asInstanceOf[js.Any])
    
    inline def setPhysicalResourceUndefined: Self = StObject.set(x, "physicalResource", js.undefined)
  }
}
