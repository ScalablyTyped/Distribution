package typings.antvComponent.typesMod

import typings.antvComponent.anon.DisplayLength
import typings.antvComponent.anon.DisplayStyle
import typings.antvComponent.antvComponentStrings.downward
import typings.antvComponent.antvComponentStrings.upward
import typings.antvGBase.interfacesMod.IGroup
import typings.antvGBase.typesMod.BBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataMarkerAnnotationCfg extends GroupComponentCfg {
  
  /**
    * 是否自动调整
    */
  var autoAdjust: js.UndefOr[Boolean] = js.native
  
  /**
    * Coord 的 BBox，用于 autoAdjust
    */
  var coordBBox: js.UndefOr[BBox] = js.native
  
  /**
    * 方向
    */
  var direction: js.UndefOr[upward | downward] = js.native
  
  var line: js.UndefOr[DisplayLength] = js.native
  
  var point: js.UndefOr[DisplayStyle] = js.native
  
  var text: DataMarkerTextCfg = js.native
  
  /**
    * 标注位置 x
    * @type {number}
    */
  var x: Double = js.native
  
  /**
    * 标注位置 y
    * @type {number}
    */
  var y: Double = js.native
}
object DataMarkerAnnotationCfg {
  
  @scala.inline
  def apply(container: IGroup, text: DataMarkerTextCfg, x: Double, y: Double): DataMarkerAnnotationCfg = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataMarkerAnnotationCfg]
  }
  
  @scala.inline
  implicit class DataMarkerAnnotationCfgOps[Self <: DataMarkerAnnotationCfg] (val x: Self) extends AnyVal {
    
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
    def setText(value: DataMarkerTextCfg): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoAdjust(value: Boolean): Self = this.set("autoAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoAdjust: Self = this.set("autoAdjust", js.undefined)
    
    @scala.inline
    def setCoordBBox(value: BBox): Self = this.set("coordBBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoordBBox: Self = this.set("coordBBox", js.undefined)
    
    @scala.inline
    def setDirection(value: upward | downward): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setLine(value: DisplayLength): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    
    @scala.inline
    def setPoint(value: DisplayStyle): Self = this.set("point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoint: Self = this.set("point", js.undefined)
  }
}
