package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsAlipayCircleOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/AlipayCircleOutlined", JSImport.Default)
  @js.native
  val default: AlipayCircleOutlinedIconType = js.native
  
  @js.native
  trait AlipayCircleOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_AlipayCircleOutlinedIconType: String = js.native
  }
  
  type _To = AlipayCircleOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsAlipayCircleOutlinedMod.foo` */
  override def _to: AlipayCircleOutlinedIconType = default
}
