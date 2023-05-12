package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsSendOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SendOutlined", JSImport.Default)
  @js.native
  val default: SendOutlinedIconType = js.native
  
  @js.native
  trait SendOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_SendOutlinedIconType: String = js.native
  }
  
  type _To = SendOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsSendOutlinedMod.foo` */
  override def _to: SendOutlinedIconType = default
}
