package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mailOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/MailOutlined", JSImport.Default)
  @js.native
  val default: MailOutlinedIconType = js.native
  
  @js.native
  trait MailOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_MailOutlinedIconType: String = js.native
  }
  
  type _To = MailOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `mailOutlinedMod.foo` */
  override def _to: MailOutlinedIconType = default
}
