package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsRestOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/RestOutlined", JSImport.Default)
  @js.native
  val default: RestOutlinedIconType = js.native
  
  @js.native
  trait RestOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_RestOutlinedIconType: String = js.native
  }
  
  type _To = RestOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsRestOutlinedMod.foo` */
  override def _to: RestOutlinedIconType = default
}
