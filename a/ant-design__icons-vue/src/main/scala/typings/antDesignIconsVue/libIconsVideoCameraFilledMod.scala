package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsVideoCameraFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/VideoCameraFilled", JSImport.Default)
  @js.native
  val default: VideoCameraFilledIconType = js.native
  
  @js.native
  trait VideoCameraFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_VideoCameraFilledIconType: String = js.native
  }
  
  type _To = VideoCameraFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsVideoCameraFilledMod.foo` */
  override def _to: VideoCameraFilledIconType = default
}
