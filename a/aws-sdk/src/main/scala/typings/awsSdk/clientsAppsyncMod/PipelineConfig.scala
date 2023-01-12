package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipelineConfig extends StObject {
  
  /**
    * A list of Function objects.
    */
  var functions: js.UndefOr[FunctionsIds] = js.undefined
}
object PipelineConfig {
  
  inline def apply(): PipelineConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PipelineConfig] (val x: Self) extends AnyVal {
    
    inline def setFunctions(value: FunctionsIds): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
    
    inline def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
    
    inline def setFunctionsVarargs(value: String*): Self = StObject.set(x, "functions", js.Array(value*))
  }
}
