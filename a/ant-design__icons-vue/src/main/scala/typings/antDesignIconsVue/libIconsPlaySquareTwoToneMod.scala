package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsPlaySquareTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PlaySquareTwoTone", JSImport.Default)
  @js.native
  val default: PlaySquareTwoToneIconType = js.native
  
  @js.native
  trait PlaySquareTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_PlaySquareTwoToneIconType: String = js.native
  }
  
  type _To = PlaySquareTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsPlaySquareTwoToneMod.foo` */
  override def _to: PlaySquareTwoToneIconType = default
}
