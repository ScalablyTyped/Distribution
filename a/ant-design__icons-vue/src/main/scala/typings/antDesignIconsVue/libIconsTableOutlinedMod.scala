package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsTableOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/TableOutlined", JSImport.Default)
  @js.native
  val default: TableOutlinedIconType = js.native
  
  @js.native
  trait TableOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_TableOutlinedIconType: String = js.native
  }
  
  type _To = TableOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsTableOutlinedMod.foo` */
  override def _to: TableOutlinedIconType = default
}
