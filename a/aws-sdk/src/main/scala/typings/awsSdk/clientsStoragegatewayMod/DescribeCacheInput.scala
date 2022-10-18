package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCacheInput extends StObject {
  
  var GatewayARN: typings.awsSdk.clientsStoragegatewayMod.GatewayARN
}
object DescribeCacheInput {
  
  inline def apply(GatewayARN: GatewayARN): DescribeCacheInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCacheInput]
  }
  
  extension [Self <: DescribeCacheInput](x: Self) {
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
  }
}
