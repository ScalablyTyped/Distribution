package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsPauseCircleOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PauseCircleOutlined", JSImport.Default)
  @js.native
  val default: PauseCircleOutlinedIconType = js.native
  
  @js.native
  trait PauseCircleOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_PauseCircleOutlinedIconType: String = js.native
  }
  
  type _To = PauseCircleOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsPauseCircleOutlinedMod.foo` */
  override def _to: PauseCircleOutlinedIconType = default
}
