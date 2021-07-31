package typings.antvComponent.typesMod

import typings.antvComponent.anon.DisplayLength
import typings.antvComponent.anon.DisplayStyle
import typings.antvComponent.antvComponentStrings.downward
import typings.antvComponent.antvComponentStrings.upward
import typings.antvGBase.interfacesMod.IGroup
import typings.antvGBase.typesMod.BBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataMarkerAnnotationCfg
  extends StObject
     with GroupComponentCfg {
  
  /**
    * 是否自动调整
    */
  var autoAdjust: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Coord 的 BBox，用于 autoAdjust
    */
  var coordBBox: js.UndefOr[BBox] = js.undefined
  
  /**
    * 方向
    */
  var direction: js.UndefOr[upward | downward] = js.undefined
  
  var line: js.UndefOr[DisplayLength] = js.undefined
  
  var point: js.UndefOr[DisplayStyle] = js.undefined
  
  var text: DataMarkerTextCfg
  
  /**
    * 标注位置 x
    * @type {number}
    */
  var x: Double
  
  /**
    * 标注位置 y
    * @type {number}
    */
  var y: Double
}
object DataMarkerAnnotationCfg {
  
  @scala.inline
  def apply(container: IGroup, text: DataMarkerTextCfg, x: Double, y: Double): DataMarkerAnnotationCfg = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataMarkerAnnotationCfg]
  }
  
  @scala.inline
  implicit class DataMarkerAnnotationCfgMutableBuilder[Self <: DataMarkerAnnotationCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoAdjust(value: Boolean): Self = StObject.set(x, "autoAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoAdjustUndefined: Self = StObject.set(x, "autoAdjust", js.undefined)
    
    @scala.inline
    def setCoordBBox(value: BBox): Self = StObject.set(x, "coordBBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordBBoxUndefined: Self = StObject.set(x, "coordBBox", js.undefined)
    
    @scala.inline
    def setDirection(value: upward | downward): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setLine(value: DisplayLength): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setPoint(value: DisplayStyle): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
    
    @scala.inline
    def setText(value: DataMarkerTextCfg): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
