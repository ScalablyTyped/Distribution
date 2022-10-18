package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsSplitCellsOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SplitCellsOutlined", JSImport.Default)
  @js.native
  val default: SplitCellsOutlinedIconType = js.native
  
  @js.native
  trait SplitCellsOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_SplitCellsOutlinedIconType: String = js.native
  }
  
  type _To = SplitCellsOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsSplitCellsOutlinedMod.foo` */
  override def _to: SplitCellsOutlinedIconType = default
}
