package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bgColorsOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/BgColorsOutlined", JSImport.Default)
  @js.native
  val default: BgColorsOutlinedIconType = js.native
  
  @js.native
  trait BgColorsOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_BgColorsOutlinedIconType: String = js.native
  }
  
  type _To = BgColorsOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `bgColorsOutlinedMod.foo` */
  override def _to: BgColorsOutlinedIconType = default
}
