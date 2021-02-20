package typings.antvComponent

import typings.antvComponent.typesMod.EnhancedTextCfg
import typings.antvGBase.interfacesMod.IGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object graphicMod {
  
  @JSImport("@antv/component/lib/util/graphic", "renderTag")
  @js.native
  def renderTag(container: IGroup, tagCfg: TagCfg): Unit = js.native
  
  @js.native
  trait TagCfg extends EnhancedTextCfg {
    
    /** 组件的 id 标识 */
    var id: js.UndefOr[String] = js.native
    
    /** 组件的名字 */
    var name: js.UndefOr[String] = js.native
    
    /**
      * 文本标注位置 x
      */
    var x: Double = js.native
    
    /**
      * 文本标注位置 y
      */
    var y: Double = js.native
  }
  object TagCfg {
    
    @scala.inline
    def apply(content: String | Double, x: Double, y: Double): TagCfg = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagCfg]
    }
    
    @scala.inline
    implicit class TagCfgMutableBuilder[Self <: TagCfg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
