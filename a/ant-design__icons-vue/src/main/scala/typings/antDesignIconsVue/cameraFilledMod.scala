package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cameraFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CameraFilled", JSImport.Default)
  @js.native
  val default: CameraFilledIconType = js.native
  
  @js.native
  trait CameraFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_CameraFilledIconType: String = js.native
  }
  
  type _To = CameraFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `cameraFilledMod.foo` */
  override def _to: CameraFilledIconType = default
}
