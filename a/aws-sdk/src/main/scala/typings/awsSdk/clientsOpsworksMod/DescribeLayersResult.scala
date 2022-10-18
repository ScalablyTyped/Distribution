package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLayersResult extends StObject {
  
  /**
    * An array of Layer objects that describe the layers.
    */
  var Layers: js.UndefOr[typings.awsSdk.clientsOpsworksMod.Layers] = js.undefined
}
object DescribeLayersResult {
  
  inline def apply(): DescribeLayersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLayersResult]
  }
  
  extension [Self <: DescribeLayersResult](x: Self) {
    
    inline def setLayers(value: Layers): Self = StObject.set(x, "Layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "Layers", js.undefined)
    
    inline def setLayersVarargs(value: Layer*): Self = StObject.set(x, "Layers", js.Array(value*))
  }
}
