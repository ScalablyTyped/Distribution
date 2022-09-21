package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object antCloudOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/AntCloudOutlined", JSImport.Default)
  @js.native
  val default: AntCloudOutlinedIconType = js.native
  
  @js.native
  trait AntCloudOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_AntCloudOutlinedIconType: String = js.native
  }
  
  type _To = AntCloudOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `antCloudOutlinedMod.foo` */
  override def _to: AntCloudOutlinedIconType = default
}
