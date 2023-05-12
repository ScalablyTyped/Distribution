package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsNodeExpandOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/NodeExpandOutlined", JSImport.Default)
  @js.native
  val default: NodeExpandOutlinedIconType = js.native
  
  @js.native
  trait NodeExpandOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_NodeExpandOutlinedIconType: String = js.native
  }
  
  type _To = NodeExpandOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsNodeExpandOutlinedMod.foo` */
  override def _to: NodeExpandOutlinedIconType = default
}
