package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aimOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/AimOutlined", JSImport.Default)
  @js.native
  val default: AimOutlinedIconType = js.native
  
  @js.native
  trait AimOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_AimOutlinedIconType: String = js.native
  }
  
  type _To = AimOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `aimOutlinedMod.foo` */
  override def _to: AimOutlinedIconType = default
}
