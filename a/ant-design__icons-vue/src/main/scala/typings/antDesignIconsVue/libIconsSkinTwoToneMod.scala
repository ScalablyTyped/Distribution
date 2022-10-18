package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsSkinTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SkinTwoTone", JSImport.Default)
  @js.native
  val default: SkinTwoToneIconType = js.native
  
  @js.native
  trait SkinTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_SkinTwoToneIconType: String = js.native
  }
  
  type _To = SkinTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsSkinTwoToneMod.foo` */
  override def _to: SkinTwoToneIconType = default
}
