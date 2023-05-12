package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsItalicOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ItalicOutlined", JSImport.Default)
  @js.native
  val default: ItalicOutlinedIconType = js.native
  
  @js.native
  trait ItalicOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_ItalicOutlinedIconType: String = js.native
  }
  
  type _To = ItalicOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsItalicOutlinedMod.foo` */
  override def _to: ItalicOutlinedIconType = default
}
