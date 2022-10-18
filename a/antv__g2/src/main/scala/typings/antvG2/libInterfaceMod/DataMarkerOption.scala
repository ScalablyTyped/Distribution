package typings.antvG2.libInterfaceMod

import typings.antvComponent.libTypesMod.EnhancedTextCfg
import typings.antvG2.anon.Length
import typings.antvG2.anon.Style
import typings.antvG2.antvG2Strings.downward
import typings.antvG2.antvG2Strings.upward
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataMarkerOption
  extends StObject
     with PointPositionBaseOption {
  
  /**
    * @title 文本超出绘制区域时，是否自动调节文本方向，默认为 true
    */
  val autoAdjust: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @title 朝向，默认为 upward，可选值为 'upward' 或者 'downward'
    */
  val direction: js.UndefOr[upward | downward] = js.undefined
  
  /**
    * @title line 设置
    */
  val line: js.UndefOr[Null | Length] = js.undefined
  
  /**
    * @title point 设置
    */
  val point: js.UndefOr[Null | Style] = js.undefined
  
  /**
    * @title text 设置
    */
  val text: Null | EnhancedTextCfg
}
object DataMarkerOption {
  
  inline def apply(position: AnnotationPosition): DataMarkerOption = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], text = null)
    __obj.asInstanceOf[DataMarkerOption]
  }
  
  extension [Self <: DataMarkerOption](x: Self) {
    
    inline def setAutoAdjust(value: Boolean): Self = StObject.set(x, "autoAdjust", value.asInstanceOf[js.Any])
    
    inline def setAutoAdjustUndefined: Self = StObject.set(x, "autoAdjust", js.undefined)
    
    inline def setDirection(value: upward | downward): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setLine(value: Length): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineNull: Self = StObject.set(x, "line", null)
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setPoint(value: Style): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setPointNull: Self = StObject.set(x, "point", null)
    
    inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
    
    inline def setText(value: EnhancedTextCfg): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
  }
}
