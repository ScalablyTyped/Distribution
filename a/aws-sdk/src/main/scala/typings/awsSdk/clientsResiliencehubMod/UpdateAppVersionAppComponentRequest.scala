package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAppVersionAppComponentRequest extends StObject {
  
  /**
    * Currently, there is no supported additional information for Application Components.
    */
  var additionalInfo: js.UndefOr[AdditionalInfoMap] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:partition:resiliencehub:region:account:app/app-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference guide.
    */
  var appArn: Arn
  
  /**
    * The identifier of the Application Component.
    */
  var id: String255
  
  /**
    * The name of the Application Component.
    */
  var name: js.UndefOr[String255] = js.undefined
  
  /**
    * The type of Application Component. For more information about the types of Application Component, see Grouping resources in an AppComponent.
    */
  var `type`: js.UndefOr[String255] = js.undefined
}
object UpdateAppVersionAppComponentRequest {
  
  inline def apply(appArn: Arn, id: String255): UpdateAppVersionAppComponentRequest = {
    val __obj = js.Dynamic.literal(appArn = appArn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAppVersionAppComponentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAppVersionAppComponentRequest] (val x: Self) extends AnyVal {
    
    inline def setAdditionalInfo(value: AdditionalInfoMap): Self = StObject.set(x, "additionalInfo", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInfoUndefined: Self = StObject.set(x, "additionalInfo", js.undefined)
    
    inline def setAppArn(value: Arn): Self = StObject.set(x, "appArn", value.asInstanceOf[js.Any])
    
    inline def setId(value: String255): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String255): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: String255): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
