package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsMailTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/MailTwoTone", JSImport.Default)
  @js.native
  val default: MailTwoToneIconType = js.native
  
  @js.native
  trait MailTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_MailTwoToneIconType: String = js.native
  }
  
  type _To = MailTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsMailTwoToneMod.foo` */
  override def _to: MailTwoToneIconType = default
}
