package typings.aureliaTemplating.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewStrategyDependencyConfig extends StObject {
  
  var as: String
  
  var from: String
}
object ViewStrategyDependencyConfig {
  
  inline def apply(as: String, from: String): ViewStrategyDependencyConfig = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewStrategyDependencyConfig]
  }
  
  extension [Self <: ViewStrategyDependencyConfig](x: Self) {
    
    inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
  }
}
