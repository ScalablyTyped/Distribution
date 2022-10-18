package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsStopOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/StopOutlined", JSImport.Default)
  @js.native
  val default: StopOutlinedIconType = js.native
  
  @js.native
  trait StopOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_StopOutlinedIconType: String = js.native
  }
  
  type _To = StopOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsStopOutlinedMod.foo` */
  override def _to: StopOutlinedIconType = default
}
