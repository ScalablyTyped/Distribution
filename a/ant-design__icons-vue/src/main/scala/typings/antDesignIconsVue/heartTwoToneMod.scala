package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object heartTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/HeartTwoTone", JSImport.Default)
  @js.native
  val default: HeartTwoToneIconType = js.native
  
  @js.native
  trait HeartTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_HeartTwoToneIconType: String = js.native
  }
  
  type _To = HeartTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `heartTwoToneMod.foo` */
  override def _to: HeartTwoToneIconType = default
}
