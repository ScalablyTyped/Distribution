package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsDislikeTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DislikeTwoTone", JSImport.Default)
  @js.native
  val default: DislikeTwoToneIconType = js.native
  
  @js.native
  trait DislikeTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_DislikeTwoToneIconType: String = js.native
  }
  
  type _To = DislikeTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsDislikeTwoToneMod.foo` */
  override def _to: DislikeTwoToneIconType = default
}
