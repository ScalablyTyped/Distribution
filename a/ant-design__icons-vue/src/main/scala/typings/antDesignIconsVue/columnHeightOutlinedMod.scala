package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnHeightOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ColumnHeightOutlined", JSImport.Default)
  @js.native
  val default: ColumnHeightOutlinedIconType = js.native
  
  @js.native
  trait ColumnHeightOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ColumnHeightOutlinedIconType: String = js.native
  }
  
  type _To = ColumnHeightOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `columnHeightOutlinedMod.foo` */
  override def _to: ColumnHeightOutlinedIconType = default
}
