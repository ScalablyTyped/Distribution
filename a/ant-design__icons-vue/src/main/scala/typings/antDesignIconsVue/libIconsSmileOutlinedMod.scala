package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsSmileOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SmileOutlined", JSImport.Default)
  @js.native
  val default: SmileOutlinedIconType = js.native
  
  @js.native
  trait SmileOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_SmileOutlinedIconType: String = js.native
  }
  
  type _To = SmileOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsSmileOutlinedMod.foo` */
  override def _to: SmileOutlinedIconType = default
}
