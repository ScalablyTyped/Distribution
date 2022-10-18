package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsMessageOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/MessageOutlined", JSImport.Default)
  @js.native
  val default: MessageOutlinedIconType = js.native
  
  @js.native
  trait MessageOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_MessageOutlinedIconType: String = js.native
  }
  
  type _To = MessageOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsMessageOutlinedMod.foo` */
  override def _to: MessageOutlinedIconType = default
}
