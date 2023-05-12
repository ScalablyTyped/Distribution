package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsUndoOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/UndoOutlined", JSImport.Default)
  @js.native
  val default: UndoOutlinedIconType = js.native
  
  @js.native
  trait UndoOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_UndoOutlinedIconType: String = js.native
  }
  
  type _To = UndoOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsUndoOutlinedMod.foo` */
  override def _to: UndoOutlinedIconType = default
}
