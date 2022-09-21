package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alipayOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/AlipayOutlined", JSImport.Default)
  @js.native
  val default: AlipayOutlinedIconType = js.native
  
  @js.native
  trait AlipayOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_AlipayOutlinedIconType: String = js.native
  }
  
  type _To = AlipayOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `alipayOutlinedMod.foo` */
  override def _to: AlipayOutlinedIconType = default
}
