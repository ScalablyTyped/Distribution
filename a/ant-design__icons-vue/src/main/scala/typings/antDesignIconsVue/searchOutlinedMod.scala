package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SearchOutlined", JSImport.Default)
  @js.native
  val default: SearchOutlinedIconType = js.native
  
  @js.native
  trait SearchOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_SearchOutlinedIconType: String = js.native
  }
  
  type _To = SearchOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `searchOutlinedMod.foo` */
  override def _to: SearchOutlinedIconType = default
}
