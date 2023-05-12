package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsAlipayOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/AlipayOutlined", JSImport.Default)
  @js.native
  val default: AlipayOutlinedIconType = js.native
  
  @js.native
  trait AlipayOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_AlipayOutlinedIconType: String = js.native
  }
  
  type _To = AlipayOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsAlipayOutlinedMod.foo` */
  override def _to: AlipayOutlinedIconType = default
}
