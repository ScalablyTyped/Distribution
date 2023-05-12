package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCiTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CiTwoTone", JSImport.Default)
  @js.native
  val default: CiTwoToneIconType = js.native
  
  @js.native
  trait CiTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_CiTwoToneIconType: String = js.native
  }
  
  type _To = CiTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCiTwoToneMod.foo` */
  override def _to: CiTwoToneIconType = default
}
