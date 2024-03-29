package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCameraOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CameraOutlined", JSImport.Default)
  @js.native
  val default: CameraOutlinedIconType = js.native
  
  @js.native
  trait CameraOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_CameraOutlinedIconType: String = js.native
  }
  
  type _To = CameraOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCameraOutlinedMod.foo` */
  override def _to: CameraOutlinedIconType = default
}
