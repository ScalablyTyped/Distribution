package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsDownCircleTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DownCircleTwoTone", JSImport.Default)
  @js.native
  val default: DownCircleTwoToneIconType = js.native
  
  @js.native
  trait DownCircleTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_DownCircleTwoToneIconType: String = js.native
  }
  
  type _To = DownCircleTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsDownCircleTwoToneMod.foo` */
  override def _to: DownCircleTwoToneIconType = default
}
