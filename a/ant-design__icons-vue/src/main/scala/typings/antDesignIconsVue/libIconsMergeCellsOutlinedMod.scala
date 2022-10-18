package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsMergeCellsOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/MergeCellsOutlined", JSImport.Default)
  @js.native
  val default: MergeCellsOutlinedIconType = js.native
  
  @js.native
  trait MergeCellsOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_MergeCellsOutlinedIconType: String = js.native
  }
  
  type _To = MergeCellsOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsMergeCellsOutlinedMod.foo` */
  override def _to: MergeCellsOutlinedIconType = default
}
