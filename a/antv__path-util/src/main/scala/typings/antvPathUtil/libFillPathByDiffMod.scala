package typings.antvPathUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFillPathByDiffMod {
  
  @JSImport("@antv/path-util/lib/fill-path-by-diff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(source: String, target: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait DiffType extends StObject {
    
    var min: Double
    
    var `type`: String
  }
  object DiffType {
    
    inline def apply(min: Double, `type`: String): DiffType = {
      val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiffType]
    }
    
    extension [Self <: DiffType](x: Self) {
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
