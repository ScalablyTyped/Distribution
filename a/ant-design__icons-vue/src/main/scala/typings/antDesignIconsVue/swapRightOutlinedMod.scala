package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swapRightOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SwapRightOutlined", JSImport.Default)
  @js.native
  val default: SwapRightOutlinedIconType = js.native
  
  @js.native
  trait SwapRightOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_SwapRightOutlinedIconType: String = js.native
  }
  
  type _To = SwapRightOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `swapRightOutlinedMod.foo` */
  override def _to: SwapRightOutlinedIconType = default
}
