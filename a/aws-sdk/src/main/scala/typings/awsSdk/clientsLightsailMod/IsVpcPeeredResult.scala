package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsVpcPeeredResult extends StObject {
  
  /**
    * Returns true if the Lightsail VPC is peered; otherwise, false.
    */
  var isPeered: js.UndefOr[Boolean] = js.undefined
}
object IsVpcPeeredResult {
  
  inline def apply(): IsVpcPeeredResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsVpcPeeredResult]
  }
  
  extension [Self <: IsVpcPeeredResult](x: Self) {
    
    inline def setIsPeered(value: Boolean): Self = StObject.set(x, "isPeered", value.asInstanceOf[js.Any])
    
    inline def setIsPeeredUndefined: Self = StObject.set(x, "isPeered", js.undefined)
  }
}
