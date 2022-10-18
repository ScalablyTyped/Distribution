package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScanCondition extends StObject {
  
  /**
    * Represents an mapEqual  condition to be applied to a single field when triggering for malware scan.
    */
  var MapEquals: typings.awsSdk.clientsGuarddutyMod.MapEquals
}
object ScanCondition {
  
  inline def apply(MapEquals: MapEquals): ScanCondition = {
    val __obj = js.Dynamic.literal(MapEquals = MapEquals.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScanCondition]
  }
  
  extension [Self <: ScanCondition](x: Self) {
    
    inline def setMapEquals(value: MapEquals): Self = StObject.set(x, "MapEquals", value.asInstanceOf[js.Any])
    
    inline def setMapEqualsVarargs(value: ScanConditionPair*): Self = StObject.set(x, "MapEquals", js.Array(value*))
  }
}
