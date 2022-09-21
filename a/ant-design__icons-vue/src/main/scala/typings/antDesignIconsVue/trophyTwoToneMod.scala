package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trophyTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/TrophyTwoTone", JSImport.Default)
  @js.native
  val default: TrophyTwoToneIconType = js.native
  
  @js.native
  trait TrophyTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_TrophyTwoToneIconType: String = js.native
  }
  
  type _To = TrophyTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `trophyTwoToneMod.foo` */
  override def _to: TrophyTwoToneIconType = default
}
