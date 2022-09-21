package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object windowsFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/WindowsFilled", JSImport.Default)
  @js.native
  val default: WindowsFilledIconType = js.native
  
  @js.native
  trait WindowsFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_WindowsFilledIconType: String = js.native
  }
  
  type _To = WindowsFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `windowsFilledMod.foo` */
  override def _to: WindowsFilledIconType = default
}
