package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsUpSquareTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/UpSquareTwoTone", JSImport.Default)
  @js.native
  val default: UpSquareTwoToneIconType = js.native
  
  @js.native
  trait UpSquareTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_UpSquareTwoToneIconType: String = js.native
  }
  
  type _To = UpSquareTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsUpSquareTwoToneMod.foo` */
  override def _to: UpSquareTwoToneIconType = default
}
