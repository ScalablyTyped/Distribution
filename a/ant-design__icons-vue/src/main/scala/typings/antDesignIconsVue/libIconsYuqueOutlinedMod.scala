package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsYuqueOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/YuqueOutlined", JSImport.Default)
  @js.native
  val default: YuqueOutlinedIconType = js.native
  
  @js.native
  trait YuqueOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_YuqueOutlinedIconType: String = js.native
  }
  
  type _To = YuqueOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsYuqueOutlinedMod.foo` */
  override def _to: YuqueOutlinedIconType = default
}
