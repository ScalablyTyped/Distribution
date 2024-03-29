package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsAlertOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/AlertOutlined", JSImport.Default)
  @js.native
  val default: AlertOutlinedIconType = js.native
  
  @js.native
  trait AlertOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_AlertOutlinedIconType: String = js.native
  }
  
  type _To = AlertOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsAlertOutlinedMod.foo` */
  override def _to: AlertOutlinedIconType = default
}
