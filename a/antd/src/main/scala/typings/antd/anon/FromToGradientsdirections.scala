package typings.antd.anon

import typings.antd.progressProgressMod.ProgressGradient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined antd.antd/lib/progress/progress.FromToGradients & {  direction :string | undefined} */
trait FromToGradientsdirections
  extends StObject
     with ProgressGradient {
  
  var direction: js.UndefOr[String] = js.undefined
  
  var from: String
  
  var to: String
}
object FromToGradientsdirections {
  
  inline def apply(from: String, to: String): FromToGradientsdirections = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromToGradientsdirections]
  }
  
  extension [Self <: FromToGradientsdirections](x: Self) {
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
