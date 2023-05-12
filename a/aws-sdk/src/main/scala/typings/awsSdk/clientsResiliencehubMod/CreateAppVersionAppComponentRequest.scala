package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAppVersionAppComponentRequest extends StObject {
  
  /**
    * Currently, there is no supported additional information for Application Components.
    */
  var additionalInfo: js.UndefOr[AdditionalInfoMap] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:partition:resiliencehub:region:account:app/app-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference guide.
    */
  var appArn: Arn
  
  /**
    * Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII characters. You should not reuse the same client token for other API requests.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The identifier of the Application Component.
    */
  var id: js.UndefOr[String255] = js.undefined
  
  /**
    * The name of the Application Component.
    */
  var name: String255
  
  /**
    * The type of Application Component. For more information about the types of Application Component, see Grouping resources in an AppComponent.
    */
  var `type`: String255
}
object CreateAppVersionAppComponentRequest {
  
  inline def apply(appArn: Arn, name: String255, `type`: String255): CreateAppVersionAppComponentRequest = {
    val __obj = js.Dynamic.literal(appArn = appArn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppVersionAppComponentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAppVersionAppComponentRequest] (val x: Self) extends AnyVal {
    
    inline def setAdditionalInfo(value: AdditionalInfoMap): Self = StObject.set(x, "additionalInfo", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInfoUndefined: Self = StObject.set(x, "additionalInfo", js.undefined)
    
    inline def setAppArn(value: Arn): Self = StObject.set(x, "appArn", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setId(value: String255): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String255): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String255): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
