package typings.awsSdk.clientsDocdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEngineDefaultClusterParametersResult extends StObject {
  
  var EngineDefaults: js.UndefOr[typings.awsSdk.clientsDocdbMod.EngineDefaults] = js.undefined
}
object DescribeEngineDefaultClusterParametersResult {
  
  inline def apply(): DescribeEngineDefaultClusterParametersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEngineDefaultClusterParametersResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeEngineDefaultClusterParametersResult] (val x: Self) extends AnyVal {
    
    inline def setEngineDefaults(value: EngineDefaults): Self = StObject.set(x, "EngineDefaults", value.asInstanceOf[js.Any])
    
    inline def setEngineDefaultsUndefined: Self = StObject.set(x, "EngineDefaults", js.undefined)
  }
}
