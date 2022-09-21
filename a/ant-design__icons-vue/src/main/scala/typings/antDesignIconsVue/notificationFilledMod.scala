package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/NotificationFilled", JSImport.Default)
  @js.native
  val default: NotificationFilledIconType = js.native
  
  @js.native
  trait NotificationFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_NotificationFilledIconType: String = js.native
  }
  
  type _To = NotificationFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `notificationFilledMod.foo` */
  override def _to: NotificationFilledIconType = default
}
