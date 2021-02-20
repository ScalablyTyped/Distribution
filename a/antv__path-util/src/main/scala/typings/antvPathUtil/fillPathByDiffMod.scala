package typings.antvPathUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fillPathByDiffMod {
  
  @JSImport("@antv/path-util/lib/fill-path-by-diff", JSImport.Default)
  @js.native
  def default(source: String, target: String): String = js.native
  
  @js.native
  trait DiffType extends StObject {
    
    var min: Double = js.native
    
    var `type`: String = js.native
  }
  object DiffType {
    
    @scala.inline
    def apply(min: Double, `type`: String): DiffType = {
      val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiffType]
    }
    
    @scala.inline
    implicit class DiffTypeMutableBuilder[Self <: DiffType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
