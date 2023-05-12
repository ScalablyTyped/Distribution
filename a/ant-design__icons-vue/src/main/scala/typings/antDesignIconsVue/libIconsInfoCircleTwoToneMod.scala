package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsInfoCircleTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/InfoCircleTwoTone", JSImport.Default)
  @js.native
  val default: InfoCircleTwoToneIconType = js.native
  
  @js.native
  trait InfoCircleTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_InfoCircleTwoToneIconType: String = js.native
  }
  
  type _To = InfoCircleTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsInfoCircleTwoToneMod.foo` */
  override def _to: InfoCircleTwoToneIconType = default
}
