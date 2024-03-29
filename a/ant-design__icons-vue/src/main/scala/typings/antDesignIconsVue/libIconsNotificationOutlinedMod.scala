package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsNotificationOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/NotificationOutlined", JSImport.Default)
  @js.native
  val default: NotificationOutlinedIconType = js.native
  
  @js.native
  trait NotificationOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_NotificationOutlinedIconType: String = js.native
  }
  
  type _To = NotificationOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsNotificationOutlinedMod.foo` */
  override def _to: NotificationOutlinedIconType = default
}
