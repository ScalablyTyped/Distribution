package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expandOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ExpandOutlined", JSImport.Default)
  @js.native
  val default: ExpandOutlinedIconType = js.native
  
  @js.native
  trait ExpandOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ExpandOutlinedIconType: String = js.native
  }
  
  type _To = ExpandOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `expandOutlinedMod.foo` */
  override def _to: ExpandOutlinedIconType = default
}
