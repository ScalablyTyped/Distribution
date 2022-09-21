package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flagTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FlagTwoTone", JSImport.Default)
  @js.native
  val default: FlagTwoToneIconType = js.native
  
  @js.native
  trait FlagTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_FlagTwoToneIconType: String = js.native
  }
  
  type _To = FlagTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `flagTwoToneMod.foo` */
  override def _to: FlagTwoToneIconType = default
}
