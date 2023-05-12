package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCiCircleTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CiCircleTwoTone", JSImport.Default)
  @js.native
  val default: CiCircleTwoToneIconType = js.native
  
  @js.native
  trait CiCircleTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_CiCircleTwoToneIconType: String = js.native
  }
  
  type _To = CiCircleTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCiCircleTwoToneMod.foo` */
  override def _to: CiCircleTwoToneIconType = default
}
