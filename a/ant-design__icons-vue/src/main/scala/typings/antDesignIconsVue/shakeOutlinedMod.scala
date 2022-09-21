package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shakeOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ShakeOutlined", JSImport.Default)
  @js.native
  val default: ShakeOutlinedIconType = js.native
  
  @js.native
  trait ShakeOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ShakeOutlinedIconType: String = js.native
  }
  
  type _To = ShakeOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `shakeOutlinedMod.foo` */
  override def _to: ShakeOutlinedIconType = default
}
