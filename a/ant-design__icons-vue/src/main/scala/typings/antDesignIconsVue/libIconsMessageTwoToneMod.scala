package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsMessageTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/MessageTwoTone", JSImport.Default)
  @js.native
  val default: MessageTwoToneIconType = js.native
  
  @js.native
  trait MessageTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_MessageTwoToneIconType: String = js.native
  }
  
  type _To = MessageTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsMessageTwoToneMod.foo` */
  override def _to: MessageTwoToneIconType = default
}
