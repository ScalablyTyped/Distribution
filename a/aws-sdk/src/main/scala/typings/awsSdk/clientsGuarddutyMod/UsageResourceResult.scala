package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsageResourceResult extends StObject {
  
  /**
    * The Amazon Web Services resource that generated usage.
    */
  var Resource: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the sum total of usage for the specified resource type.
    */
  var Total: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.Total] = js.undefined
}
object UsageResourceResult {
  
  inline def apply(): UsageResourceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageResourceResult]
  }
  
  extension [Self <: UsageResourceResult](x: Self) {
    
    inline def setResource(value: String): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "Resource", js.undefined)
    
    inline def setTotal(value: Total): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "Total", js.undefined)
  }
}
