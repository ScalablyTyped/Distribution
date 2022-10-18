package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsInboxOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/InboxOutlined", JSImport.Default)
  @js.native
  val default: InboxOutlinedIconType = js.native
  
  @js.native
  trait InboxOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_InboxOutlinedIconType: String = js.native
  }
  
  type _To = InboxOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsInboxOutlinedMod.foo` */
  override def _to: InboxOutlinedIconType = default
}
