package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsLeftSquareTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/LeftSquareTwoTone", JSImport.Default)
  @js.native
  val default: LeftSquareTwoToneIconType = js.native
  
  @js.native
  trait LeftSquareTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_LeftSquareTwoToneIconType: String = js.native
  }
  
  type _To = LeftSquareTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsLeftSquareTwoToneMod.foo` */
  override def _to: LeftSquareTwoToneIconType = default
}
