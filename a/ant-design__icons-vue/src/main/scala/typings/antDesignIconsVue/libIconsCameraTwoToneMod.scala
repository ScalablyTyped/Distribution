package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCameraTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CameraTwoTone", JSImport.Default)
  @js.native
  val default: CameraTwoToneIconType = js.native
  
  @js.native
  trait CameraTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_CameraTwoToneIconType: String = js.native
  }
  
  type _To = CameraTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCameraTwoToneMod.foo` */
  override def _to: CameraTwoToneIconType = default
}
