package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SelectOutlined", JSImport.Default)
  @js.native
  val default: SelectOutlinedIconType = js.native
  
  @js.native
  trait SelectOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_SelectOutlinedIconType: String = js.native
  }
  
  type _To = SelectOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `selectOutlinedMod.foo` */
  override def _to: SelectOutlinedIconType = default
}
