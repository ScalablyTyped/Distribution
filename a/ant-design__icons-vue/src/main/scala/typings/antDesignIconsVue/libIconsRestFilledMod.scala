package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsRestFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/RestFilled", JSImport.Default)
  @js.native
  val default: RestFilledIconType = js.native
  
  @js.native
  trait RestFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_RestFilledIconType: String = js.native
  }
  
  type _To = RestFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsRestFilledMod.foo` */
  override def _to: RestFilledIconType = default
}
