package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAppVersionAppComponentRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:partition:resiliencehub:region:account:app/app-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference guide.
    */
  var appArn: Arn
  
  /**
    * The Resilience Hub application version.
    */
  var appVersion: EntityVersion
  
  /**
    * The identifier of the Application Component.
    */
  var id: String255
}
object DescribeAppVersionAppComponentRequest {
  
  inline def apply(appArn: Arn, appVersion: EntityVersion, id: String255): DescribeAppVersionAppComponentRequest = {
    val __obj = js.Dynamic.literal(appArn = appArn.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAppVersionAppComponentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAppVersionAppComponentRequest] (val x: Self) extends AnyVal {
    
    inline def setAppArn(value: Arn): Self = StObject.set(x, "appArn", value.asInstanceOf[js.Any])
    
    inline def setAppVersion(value: EntityVersion): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
    
    inline def setId(value: String255): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
