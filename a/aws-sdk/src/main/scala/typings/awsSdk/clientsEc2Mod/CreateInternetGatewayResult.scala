package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateInternetGatewayResult extends StObject {
  
  /**
    * Information about the internet gateway.
    */
  var InternetGateway: js.UndefOr[typings.awsSdk.clientsEc2Mod.InternetGateway] = js.undefined
}
object CreateInternetGatewayResult {
  
  inline def apply(): CreateInternetGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInternetGatewayResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateInternetGatewayResult] (val x: Self) extends AnyVal {
    
    inline def setInternetGateway(value: InternetGateway): Self = StObject.set(x, "InternetGateway", value.asInstanceOf[js.Any])
    
    inline def setInternetGatewayUndefined: Self = StObject.set(x, "InternetGateway", js.undefined)
  }
}
