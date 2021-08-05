package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IterateOptions extends StObject {
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var probability: js.UndefOr[Double] = js.undefined
}
object IterateOptions {
  
  inline def apply(): IterateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IterateOptions]
  }
  
  extension [Self <: IterateOptions](x: Self) {
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setProbability(value: Double): Self = StObject.set(x, "probability", value.asInstanceOf[js.Any])
    
    inline def setProbabilityUndefined: Self = StObject.set(x, "probability", js.undefined)
  }
}
