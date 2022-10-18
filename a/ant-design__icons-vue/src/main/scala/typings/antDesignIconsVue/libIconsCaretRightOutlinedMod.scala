package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCaretRightOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CaretRightOutlined", JSImport.Default)
  @js.native
  val default: CaretRightOutlinedIconType = js.native
  
  @js.native
  trait CaretRightOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_CaretRightOutlinedIconType: String = js.native
  }
  
  type _To = CaretRightOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCaretRightOutlinedMod.foo` */
  override def _to: CaretRightOutlinedIconType = default
}
