package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsApiFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ApiFilled", JSImport.Default)
  @js.native
  val default: ApiFilledIconType = js.native
  
  @js.native
  trait ApiFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_ApiFilledIconType: String = js.native
  }
  
  type _To = ApiFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsApiFilledMod.foo` */
  override def _to: ApiFilledIconType = default
}
