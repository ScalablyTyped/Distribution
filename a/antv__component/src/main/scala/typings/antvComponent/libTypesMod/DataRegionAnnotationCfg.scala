package typings.antvComponent.libTypesMod

import typings.antvComponent.anon.`4`
import typings.antvGBase.libInterfacesMod.IGroup
import typings.antvGBase.libTypesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataRegionAnnotationCfg
  extends StObject
     with GroupComponentCfg {
  
  /**
    * 位置点信息
    * @type {Point}
    */
  var points: js.Array[Point]
  
  var region: js.UndefOr[`4`] = js.undefined
  
  var text: EnhancedTextCfg
}
object DataRegionAnnotationCfg {
  
  inline def apply(container: IGroup, points: js.Array[Point], text: EnhancedTextCfg): DataRegionAnnotationCfg = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRegionAnnotationCfg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataRegionAnnotationCfg] (val x: Self) extends AnyVal {
    
    inline def setPoints(value: js.Array[Point]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: Point*): Self = StObject.set(x, "points", js.Array(value*))
    
    inline def setRegion(value: `4`): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setText(value: EnhancedTextCfg): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
