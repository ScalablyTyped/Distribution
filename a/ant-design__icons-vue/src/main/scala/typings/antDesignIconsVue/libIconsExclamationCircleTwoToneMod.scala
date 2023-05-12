package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsExclamationCircleTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ExclamationCircleTwoTone", JSImport.Default)
  @js.native
  val default: ExclamationCircleTwoToneIconType = js.native
  
  @js.native
  trait ExclamationCircleTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_ExclamationCircleTwoToneIconType: String = js.native
  }
  
  type _To = ExclamationCircleTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsExclamationCircleTwoToneMod.foo` */
  override def _to: ExclamationCircleTwoToneIconType = default
}
