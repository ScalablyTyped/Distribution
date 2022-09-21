package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mobileOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/MobileOutlined", JSImport.Default)
  @js.native
  val default: MobileOutlinedIconType = js.native
  
  @js.native
  trait MobileOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_MobileOutlinedIconType: String = js.native
  }
  
  type _To = MobileOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `mobileOutlinedMod.foo` */
  override def _to: MobileOutlinedIconType = default
}
