package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsSwitcherFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SwitcherFilled", JSImport.Default)
  @js.native
  val default: SwitcherFilledIconType = js.native
  
  @js.native
  trait SwitcherFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_SwitcherFilledIconType: String = js.native
  }
  
  type _To = SwitcherFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsSwitcherFilledMod.foo` */
  override def _to: SwitcherFilledIconType = default
}
