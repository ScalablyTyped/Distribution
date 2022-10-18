package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsSearchOutlinedMod extends Shortcut {
  
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
  
  /* This means you don't have to write `default`, but can instead just say `libIconsSearchOutlinedMod.foo` */
  override def _to: SearchOutlinedIconType = default
}
