package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsColumnHeightOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ColumnHeightOutlined", JSImport.Default)
  @js.native
  val default: ColumnHeightOutlinedIconType = js.native
  
  @js.native
  trait ColumnHeightOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_ColumnHeightOutlinedIconType: String = js.native
  }
  
  type _To = ColumnHeightOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsColumnHeightOutlinedMod.foo` */
  override def _to: ColumnHeightOutlinedIconType = default
}
