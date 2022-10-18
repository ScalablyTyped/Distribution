package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsSortDescendingOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SortDescendingOutlined", JSImport.Default)
  @js.native
  val default: SortDescendingOutlinedIconType = js.native
  
  @js.native
  trait SortDescendingOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_SortDescendingOutlinedIconType: String = js.native
  }
  
  type _To = SortDescendingOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsSortDescendingOutlinedMod.foo` */
  override def _to: SortDescendingOutlinedIconType = default
}
