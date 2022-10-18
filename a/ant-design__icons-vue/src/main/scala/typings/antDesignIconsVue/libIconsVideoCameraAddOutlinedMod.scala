package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsVideoCameraAddOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/VideoCameraAddOutlined", JSImport.Default)
  @js.native
  val default: VideoCameraAddOutlinedIconType = js.native
  
  @js.native
  trait VideoCameraAddOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_VideoCameraAddOutlinedIconType: String = js.native
  }
  
  type _To = VideoCameraAddOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsVideoCameraAddOutlinedMod.foo` */
  override def _to: VideoCameraAddOutlinedIconType = default
}
