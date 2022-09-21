package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object caretUpOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CaretUpOutlined", JSImport.Default)
  @js.native
  val default: CaretUpOutlinedIconType = js.native
  
  @js.native
  trait CaretUpOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_CaretUpOutlinedIconType: String = js.native
  }
  
  type _To = CaretUpOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `caretUpOutlinedMod.foo` */
  override def _to: CaretUpOutlinedIconType = default
}
