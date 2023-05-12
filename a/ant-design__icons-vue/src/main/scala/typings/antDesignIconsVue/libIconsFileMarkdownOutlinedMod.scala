package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFileMarkdownOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FileMarkdownOutlined", JSImport.Default)
  @js.native
  val default: FileMarkdownOutlinedIconType = js.native
  
  @js.native
  trait FileMarkdownOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_FileMarkdownOutlinedIconType: String = js.native
  }
  
  type _To = FileMarkdownOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFileMarkdownOutlinedMod.foo` */
  override def _to: FileMarkdownOutlinedIconType = default
}
