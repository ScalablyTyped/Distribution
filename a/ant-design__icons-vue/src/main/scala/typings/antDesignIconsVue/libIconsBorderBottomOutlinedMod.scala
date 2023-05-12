package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsBorderBottomOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/BorderBottomOutlined", JSImport.Default)
  @js.native
  val default: BorderBottomOutlinedIconType = js.native
  
  @js.native
  trait BorderBottomOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_BorderBottomOutlinedIconType: String = js.native
  }
  
  type _To = BorderBottomOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsBorderBottomOutlinedMod.foo` */
  override def _to: BorderBottomOutlinedIconType = default
}
