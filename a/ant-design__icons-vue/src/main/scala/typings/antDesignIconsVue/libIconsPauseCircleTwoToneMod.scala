package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsPauseCircleTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PauseCircleTwoTone", JSImport.Default)
  @js.native
  val default: PauseCircleTwoToneIconType = js.native
  
  @js.native
  trait PauseCircleTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_PauseCircleTwoToneIconType: String = js.native
  }
  
  type _To = PauseCircleTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsPauseCircleTwoToneMod.foo` */
  override def _to: PauseCircleTwoToneIconType = default
}
