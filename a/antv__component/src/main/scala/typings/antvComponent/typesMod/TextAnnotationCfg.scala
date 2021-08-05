package typings.antvComponent.typesMod

import typings.antvGBase.interfacesMod.IGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextAnnotationCfg
  extends StObject
     with GroupComponentCfg
     with EnhancedTextCfg {
  
  /**
    * 文本标注位置 x
    * @type {number}
    */
  var x: Double
  
  /**
    * 文本标注位置 y
    * @type {number}
    */
  var y: Double
}
object TextAnnotationCfg {
  
  inline def apply(container: IGroup, content: String | Double, x: Double, y: Double): TextAnnotationCfg = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAnnotationCfg]
  }
  
  extension [Self <: TextAnnotationCfg](x: Self) {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
