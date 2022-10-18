package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsSortAscendingOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SortAscendingOutlined", JSImport.Default)
  @js.native
  val default: SortAscendingOutlinedIconType = js.native
  
  @js.native
  trait SortAscendingOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_SortAscendingOutlinedIconType: String = js.native
  }
  
  type _To = SortAscendingOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsSortAscendingOutlinedMod.foo` */
  override def _to: SortAscendingOutlinedIconType = default
}
