package typings.antvComponent.typesMod

import typings.antvComponent.anon.`1`
import typings.antvGBase.interfacesMod.IGroup
import typings.antvGBase.typesMod.Point
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
  implicit class DataRegionAnnotationCfgOps[Self <: DataRegionAnnotationCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPointsVarargs(value: Point*): Self = this.set("points", js.Array(value :_*))
    
    @scala.inline
    def setPoints(value: js.Array[Point]): Self = this.set("points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: EnhancedTextCfg): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: `1`): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
  }
}
