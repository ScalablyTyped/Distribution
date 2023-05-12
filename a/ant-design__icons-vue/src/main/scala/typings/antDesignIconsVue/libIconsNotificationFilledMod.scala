package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsNotificationFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/NotificationFilled", JSImport.Default)
  @js.native
  val default: NotificationFilledIconType = js.native
  
  @js.native
  trait NotificationFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_NotificationFilledIconType: String = js.native
  }
  
  type _To = NotificationFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsNotificationFilledMod.foo` */
  override def _to: NotificationFilledIconType = default
}
