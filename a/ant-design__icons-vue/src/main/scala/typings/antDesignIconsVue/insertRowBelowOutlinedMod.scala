package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object insertRowBelowOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/InsertRowBelowOutlined", JSImport.Default)
  @js.native
  val default: InsertRowBelowOutlinedIconType = js.native
  
  @js.native
  trait InsertRowBelowOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_InsertRowBelowOutlinedIconType: String = js.native
  }
  
  type _To = InsertRowBelowOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `insertRowBelowOutlinedMod.foo` */
  override def _to: InsertRowBelowOutlinedIconType = default
}
