package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsKeyOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/KeyOutlined", JSImport.Default)
  @js.native
  val default: KeyOutlinedIconType = js.native
  
  @js.native
  trait KeyOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_KeyOutlinedIconType: String = js.native
  }
  
  type _To = KeyOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsKeyOutlinedMod.foo` */
  override def _to: KeyOutlinedIconType = default
}
