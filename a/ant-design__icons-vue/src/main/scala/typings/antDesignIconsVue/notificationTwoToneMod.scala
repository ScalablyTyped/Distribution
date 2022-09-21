package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/NotificationTwoTone", JSImport.Default)
  @js.native
  val default: NotificationTwoToneIconType = js.native
  
  @js.native
  trait NotificationTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_NotificationTwoToneIconType: String = js.native
  }
  
  type _To = NotificationTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `notificationTwoToneMod.foo` */
  override def _to: NotificationTwoToneIconType = default
}
