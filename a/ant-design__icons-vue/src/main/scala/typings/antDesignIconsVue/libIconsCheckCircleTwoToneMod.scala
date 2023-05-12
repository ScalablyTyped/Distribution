package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCheckCircleTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CheckCircleTwoTone", JSImport.Default)
  @js.native
  val default: CheckCircleTwoToneIconType = js.native
  
  @js.native
  trait CheckCircleTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_CheckCircleTwoToneIconType: String = js.native
  }
  
  type _To = CheckCircleTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCheckCircleTwoToneMod.foo` */
  override def _to: CheckCircleTwoToneIconType = default
}
