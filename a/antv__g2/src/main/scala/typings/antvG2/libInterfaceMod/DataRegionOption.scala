package typings.antvG2.libInterfaceMod

import typings.antvComponent.libTypesMod.EnhancedTextCfg
import typings.antvG2.anon.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataRegionOption
  extends StObject
     with RegionPositionBaseOption {
  
  /**
    * @title line长度，default为 0
    */
  val lineLength: js.UndefOr[Double] = js.undefined
  
  /**
    * @title 标注区间的配置
    */
  val region: js.UndefOr[Null | Style] = js.undefined
  
  /**
    * @title 文本的配置
    */
  val text: js.UndefOr[Null | EnhancedTextCfg] = js.undefined
}
object DataRegionOption {
  
  inline def apply(end: AnnotationPosition, start: AnnotationPosition): DataRegionOption = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRegionOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataRegionOption] (val x: Self) extends AnyVal {
    
    inline def setLineLength(value: Double): Self = StObject.set(x, "lineLength", value.asInstanceOf[js.Any])
    
    inline def setLineLengthUndefined: Self = StObject.set(x, "lineLength", js.undefined)
    
    inline def setRegion(value: Style): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setText(value: EnhancedTextCfg): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
