package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsColumnWidthOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ColumnWidthOutlined", JSImport.Default)
  @js.native
  val default: ColumnWidthOutlinedIconType = js.native
  
  @js.native
  trait ColumnWidthOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_ColumnWidthOutlinedIconType: String = js.native
  }
  
  type _To = ColumnWidthOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsColumnWidthOutlinedMod.foo` */
  override def _to: ColumnWidthOutlinedIconType = default
}
