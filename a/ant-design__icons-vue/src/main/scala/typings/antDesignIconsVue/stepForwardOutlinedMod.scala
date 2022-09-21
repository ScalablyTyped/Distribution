package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepForwardOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/StepForwardOutlined", JSImport.Default)
  @js.native
  val default: StepForwardOutlinedIconType = js.native
  
  @js.native
  trait StepForwardOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_StepForwardOutlinedIconType: String = js.native
  }
  
  type _To = StepForwardOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `stepForwardOutlinedMod.foo` */
  override def _to: StepForwardOutlinedIconType = default
}
