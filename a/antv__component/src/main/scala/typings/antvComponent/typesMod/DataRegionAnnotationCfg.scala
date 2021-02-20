package typings.antvComponent.typesMod

import typings.antvComponent.anon.`1`
import typings.antvGBase.interfacesMod.IGroup
import typings.antvGBase.typesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataRegionAnnotationCfg extends GroupComponentCfg {
  
  /**
    * 位置点信息
    * @type {Point}
    */
  var points: js.Array[Point] = js.native
  
  var region: js.UndefOr[`1`] = js.native
  
  var text: EnhancedTextCfg = js.native
}
object DataRegionAnnotationCfg {
  
  @scala.inline
  def apply(container: IGroup, points: js.Array[Point], text: EnhancedTextCfg): DataRegionAnnotationCfg = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRegionAnnotationCfg]
  }
  
  @scala.inline
  implicit class DataRegionAnnotationCfgMutableBuilder[Self <: DataRegionAnnotationCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPoints(value: js.Array[Point]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsVarargs(value: Point*): Self = StObject.set(x, "points", js.Array(value :_*))
    
    @scala.inline
    def setRegion(value: `1`): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setText(value: EnhancedTextCfg): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
