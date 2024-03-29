package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCloseSquareTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CloseSquareTwoTone", JSImport.Default)
  @js.native
  val default: CloseSquareTwoToneIconType = js.native
  
  @js.native
  trait CloseSquareTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_CloseSquareTwoToneIconType: String = js.native
  }
  
  type _To = CloseSquareTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCloseSquareTwoToneMod.foo` */
  override def _to: CloseSquareTwoToneIconType = default
}
