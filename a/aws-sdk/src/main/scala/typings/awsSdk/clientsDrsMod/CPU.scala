package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CPU extends StObject {
  
  /**
    * The number of CPU cores.
    */
  var cores: js.UndefOr[PositiveInteger] = js.undefined
  
  /**
    * The model name of the CPU.
    */
  var modelName: js.UndefOr[BoundedString] = js.undefined
}
object CPU {
  
  inline def apply(): CPU = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CPU]
  }
  
  extension [Self <: CPU](x: Self) {
    
    inline def setCores(value: PositiveInteger): Self = StObject.set(x, "cores", value.asInstanceOf[js.Any])
    
    inline def setCoresUndefined: Self = StObject.set(x, "cores", js.undefined)
    
    inline def setModelName(value: BoundedString): Self = StObject.set(x, "modelName", value.asInstanceOf[js.Any])
    
    inline def setModelNameUndefined: Self = StObject.set(x, "modelName", js.undefined)
  }
}
