package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsInsertRowAboveOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/InsertRowAboveOutlined", JSImport.Default)
  @js.native
  val default: InsertRowAboveOutlinedIconType = js.native
  
  @js.native
  trait InsertRowAboveOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_InsertRowAboveOutlinedIconType: String = js.native
  }
  
  type _To = InsertRowAboveOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsInsertRowAboveOutlinedMod.foo` */
  override def _to: InsertRowAboveOutlinedIconType = default
}
