package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCoipPoolResult extends StObject {
  
  /**
    * Information about the CoIP address pool.
    */
  var CoipPool: js.UndefOr[typings.awsSdk.clientsEc2Mod.CoipPool] = js.undefined
}
object DeleteCoipPoolResult {
  
  inline def apply(): DeleteCoipPoolResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCoipPoolResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteCoipPoolResult] (val x: Self) extends AnyVal {
    
    inline def setCoipPool(value: CoipPool): Self = StObject.set(x, "CoipPool", value.asInstanceOf[js.Any])
    
    inline def setCoipPoolUndefined: Self = StObject.set(x, "CoipPool", js.undefined)
  }
}
