package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFileMarkdownFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FileMarkdownFilled", JSImport.Default)
  @js.native
  val default: FileMarkdownFilledIconType = js.native
  
  @js.native
  trait FileMarkdownFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_FileMarkdownFilledIconType: String = js.native
  }
  
  type _To = FileMarkdownFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFileMarkdownFilledMod.foo` */
  override def _to: FileMarkdownFilledIconType = default
}
