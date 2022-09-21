package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ControlFilled", JSImport.Default)
  @js.native
  val default: ControlFilledIconType = js.native
  
  @js.native
  trait ControlFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ControlFilledIconType: String = js.native
  }
  
  type _To = ControlFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `controlFilledMod.foo` */
  override def _to: ControlFilledIconType = default
}
