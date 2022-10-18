package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCoipPoolResult extends StObject {
  
  var CoipPool: js.UndefOr[typings.awsSdk.clientsEc2Mod.CoipPool] = js.undefined
}
object DeleteCoipPoolResult {
  
  inline def apply(): DeleteCoipPoolResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCoipPoolResult]
  }
  
  extension [Self <: DeleteCoipPoolResult](x: Self) {
    
    inline def setCoipPool(value: CoipPool): Self = StObject.set(x, "CoipPool", value.asInstanceOf[js.Any])
    
    inline def setCoipPoolUndefined: Self = StObject.set(x, "CoipPool", js.undefined)
  }
}
