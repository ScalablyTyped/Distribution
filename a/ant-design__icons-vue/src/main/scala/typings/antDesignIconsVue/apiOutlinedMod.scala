package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ApiOutlined", JSImport.Default)
  @js.native
  val default: ApiOutlinedIconType = js.native
  
  @js.native
  trait ApiOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ApiOutlinedIconType: String = js.native
  }
  
  type _To = ApiOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `apiOutlinedMod.foo` */
  override def _to: ApiOutlinedIconType = default
}
