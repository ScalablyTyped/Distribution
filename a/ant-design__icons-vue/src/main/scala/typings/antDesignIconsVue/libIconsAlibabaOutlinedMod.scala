package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsAlibabaOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/AlibabaOutlined", JSImport.Default)
  @js.native
  val default: AlibabaOutlinedIconType = js.native
  
  @js.native
  trait AlibabaOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_AlibabaOutlinedIconType: String = js.native
  }
  
  type _To = AlibabaOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsAlibabaOutlinedMod.foo` */
  override def _to: AlibabaOutlinedIconType = default
}
