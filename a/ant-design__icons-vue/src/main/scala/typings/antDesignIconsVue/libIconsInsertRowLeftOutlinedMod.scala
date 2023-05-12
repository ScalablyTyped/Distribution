package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsInsertRowLeftOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/InsertRowLeftOutlined", JSImport.Default)
  @js.native
  val default: InsertRowLeftOutlinedIconType = js.native
  
  @js.native
  trait InsertRowLeftOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_InsertRowLeftOutlinedIconType: String = js.native
  }
  
  type _To = InsertRowLeftOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsInsertRowLeftOutlinedMod.foo` */
  override def _to: InsertRowLeftOutlinedIconType = default
}
