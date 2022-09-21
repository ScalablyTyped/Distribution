package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object videoCameraOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/VideoCameraOutlined", JSImport.Default)
  @js.native
  val default: VideoCameraOutlinedIconType = js.native
  
  @js.native
  trait VideoCameraOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_VideoCameraOutlinedIconType: String = js.native
  }
  
  type _To = VideoCameraOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `videoCameraOutlinedMod.foo` */
  override def _to: VideoCameraOutlinedIconType = default
}
