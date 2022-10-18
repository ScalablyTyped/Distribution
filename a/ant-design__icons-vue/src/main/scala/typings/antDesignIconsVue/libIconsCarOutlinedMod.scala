package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCarOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CarOutlined", JSImport.Default)
  @js.native
  val default: CarOutlinedIconType = js.native
  
  @js.native
  trait CarOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_CarOutlinedIconType: String = js.native
  }
  
  type _To = CarOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCarOutlinedMod.foo` */
  override def _to: CarOutlinedIconType = default
}
