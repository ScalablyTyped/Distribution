package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngressConfiguration extends StObject {
  
  /**
    * Specifies whether your App Runner service is publicly accessible. To make the service publicly accessible set it to True. To make the service privately accessible, from only within an Amazon VPC set it to False. 
    */
  var IsPubliclyAccessible: js.UndefOr[Boolean] = js.undefined
}
object IngressConfiguration {
  
  inline def apply(): IngressConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngressConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IngressConfiguration] (val x: Self) extends AnyVal {
    
    inline def setIsPubliclyAccessible(value: Boolean): Self = StObject.set(x, "IsPubliclyAccessible", value.asInstanceOf[js.Any])
    
    inline def setIsPubliclyAccessibleUndefined: Self = StObject.set(x, "IsPubliclyAccessible", js.undefined)
  }
}
