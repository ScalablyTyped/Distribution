package typings.antvComponent

import typings.antvComponent.libTypesMod.EnhancedTextCfg
import typings.antvGBase.libInterfacesMod.IGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilGraphicMod {
  
  @JSImport("@antv/component/lib/util/graphic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def renderTag(container: IGroup, tagCfg: TagCfg): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderTag")(container.asInstanceOf[js.Any], tagCfg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait TagCfg
    extends StObject
       with EnhancedTextCfg {
    
    /** 组件的 id 标识 */
    var id: js.UndefOr[String] = js.undefined
    
    /** 组件的名字 */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * 文本标注位置 x
      */
    var x: Double
    
    /**
      * 文本标注位置 y
      */
    var y: Double
  }
  object TagCfg {
    
    inline def apply(content: String | Double, x: Double, y: Double): TagCfg = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagCfg]
    }
    
    extension [Self <: TagCfg](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
