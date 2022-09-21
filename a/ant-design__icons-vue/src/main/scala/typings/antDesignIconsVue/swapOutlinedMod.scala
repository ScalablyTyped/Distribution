package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swapOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SwapOutlined", JSImport.Default)
  @js.native
  val default: SwapOutlinedIconType = js.native
  
  @js.native
  trait SwapOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_SwapOutlinedIconType: String = js.native
  }
  
  type _To = SwapOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `swapOutlinedMod.foo` */
  override def _to: SwapOutlinedIconType = default
}
