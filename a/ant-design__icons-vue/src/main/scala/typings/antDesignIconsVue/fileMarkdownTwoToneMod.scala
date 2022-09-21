package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileMarkdownTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FileMarkdownTwoTone", JSImport.Default)
  @js.native
  val default: FileMarkdownTwoToneIconType = js.native
  
  @js.native
  trait FileMarkdownTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_FileMarkdownTwoToneIconType: String = js.native
  }
  
  type _To = FileMarkdownTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `fileMarkdownTwoToneMod.foo` */
  override def _to: FileMarkdownTwoToneIconType = default
}
