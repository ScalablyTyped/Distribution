package typings.antvG2.libInterfaceMod

import typings.antvComponent.libTypesMod.LineAnnotationTextCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineOption
  extends StObject
     with RegionPositionBaseOption {
  
  /**
    * @title 文本配置定义
    */
  val text: js.UndefOr[LineAnnotationTextCfg] = js.undefined
}
object LineOption {
  
  inline def apply(end: AnnotationPosition, start: AnnotationPosition): LineOption = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineOption] (val x: Self) extends AnyVal {
    
    inline def setText(value: LineAnnotationTextCfg): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
