package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenIDConnectProviderListEntry extends StObject {
  
  var Arn: js.UndefOr[arnType] = js.undefined
}
object OpenIDConnectProviderListEntry {
  
  inline def apply(): OpenIDConnectProviderListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenIDConnectProviderListEntry]
  }
  
  extension [Self <: OpenIDConnectProviderListEntry](x: Self) {
    
    inline def setArn(value: arnType): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
