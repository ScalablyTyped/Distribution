package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCopyrightTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CopyrightTwoTone", JSImport.Default)
  @js.native
  val default: CopyrightTwoToneIconType = js.native
  
  @js.native
  trait CopyrightTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_CopyrightTwoToneIconType: String = js.native
  }
  
  type _To = CopyrightTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCopyrightTwoToneMod.foo` */
  override def _to: CopyrightTwoToneIconType = default
}
