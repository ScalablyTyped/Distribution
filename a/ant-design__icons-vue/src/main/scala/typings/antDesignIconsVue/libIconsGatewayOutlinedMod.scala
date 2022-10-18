package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsGatewayOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/GatewayOutlined", JSImport.Default)
  @js.native
  val default: GatewayOutlinedIconType = js.native
  
  @js.native
  trait GatewayOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_GatewayOutlinedIconType: String = js.native
  }
  
  type _To = GatewayOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsGatewayOutlinedMod.foo` */
  override def _to: GatewayOutlinedIconType = default
}
