package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsPauseOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PauseOutlined", JSImport.Default)
  @js.native
  val default: PauseOutlinedIconType = js.native
  
  @js.native
  trait PauseOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_PauseOutlinedIconType: String = js.native
  }
  
  type _To = PauseOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsPauseOutlinedMod.foo` */
  override def _to: PauseOutlinedIconType = default
}
