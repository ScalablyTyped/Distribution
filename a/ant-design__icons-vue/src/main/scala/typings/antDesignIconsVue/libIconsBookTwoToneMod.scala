package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsBookTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/BookTwoTone", JSImport.Default)
  @js.native
  val default: BookTwoToneIconType = js.native
  
  @js.native
  trait BookTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_BookTwoToneIconType: String = js.native
  }
  
  type _To = BookTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsBookTwoToneMod.foo` */
  override def _to: BookTwoToneIconType = default
}
