package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object riseOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/RiseOutlined", JSImport.Default)
  @js.native
  val default: RiseOutlinedIconType = js.native
  
  @js.native
  trait RiseOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_RiseOutlinedIconType: String = js.native
  }
  
  type _To = RiseOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `riseOutlinedMod.foo` */
  override def _to: RiseOutlinedIconType = default
}
