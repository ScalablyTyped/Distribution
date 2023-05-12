package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsMailFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/MailFilled", JSImport.Default)
  @js.native
  val default: MailFilledIconType = js.native
  
  @js.native
  trait MailFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_MailFilledIconType: String = js.native
  }
  
  type _To = MailFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsMailFilledMod.foo` */
  override def _to: MailFilledIconType = default
}
