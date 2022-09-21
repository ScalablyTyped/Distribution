package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object translationOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/TranslationOutlined", JSImport.Default)
  @js.native
  val default: TranslationOutlinedIconType = js.native
  
  @js.native
  trait TranslationOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_TranslationOutlinedIconType: String = js.native
  }
  
  type _To = TranslationOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `translationOutlinedMod.foo` */
  override def _to: TranslationOutlinedIconType = default
}
