package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsClearOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ClearOutlined", JSImport.Default)
  @js.native
  val default: ClearOutlinedIconType = js.native
  
  @js.native
  trait ClearOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_ClearOutlinedIconType: String = js.native
  }
  
  type _To = ClearOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsClearOutlinedMod.foo` */
  override def _to: ClearOutlinedIconType = default
}
