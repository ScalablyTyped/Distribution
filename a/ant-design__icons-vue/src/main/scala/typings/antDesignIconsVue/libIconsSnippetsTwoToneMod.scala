package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsSnippetsTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SnippetsTwoTone", JSImport.Default)
  @js.native
  val default: SnippetsTwoToneIconType = js.native
  
  @js.native
  trait SnippetsTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_SnippetsTwoToneIconType: String = js.native
  }
  
  type _To = SnippetsTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsSnippetsTwoToneMod.foo` */
  override def _to: SnippetsTwoToneIconType = default
}
