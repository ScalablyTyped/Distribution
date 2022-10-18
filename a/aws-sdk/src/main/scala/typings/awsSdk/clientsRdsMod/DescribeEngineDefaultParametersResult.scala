package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEngineDefaultParametersResult extends StObject {
  
  var EngineDefaults: js.UndefOr[typings.awsSdk.clientsRdsMod.EngineDefaults] = js.undefined
}
object DescribeEngineDefaultParametersResult {
  
  inline def apply(): DescribeEngineDefaultParametersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEngineDefaultParametersResult]
  }
  
  extension [Self <: DescribeEngineDefaultParametersResult](x: Self) {
    
    inline def setEngineDefaults(value: EngineDefaults): Self = StObject.set(x, "EngineDefaults", value.asInstanceOf[js.Any])
    
    inline def setEngineDefaultsUndefined: Self = StObject.set(x, "EngineDefaults", js.undefined)
  }
}
