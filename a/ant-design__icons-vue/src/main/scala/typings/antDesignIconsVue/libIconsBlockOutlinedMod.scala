package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsBlockOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/BlockOutlined", JSImport.Default)
  @js.native
  val default: BlockOutlinedIconType = js.native
  
  @js.native
  trait BlockOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_BlockOutlinedIconType: String = js.native
  }
  
  type _To = BlockOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsBlockOutlinedMod.foo` */
  override def _to: BlockOutlinedIconType = default
}
