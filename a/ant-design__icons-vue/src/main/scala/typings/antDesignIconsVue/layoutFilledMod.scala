package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/LayoutFilled", JSImport.Default)
  @js.native
  val default: LayoutFilledIconType = js.native
  
  @js.native
  trait LayoutFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_LayoutFilledIconType: String = js.native
  }
  
  type _To = LayoutFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `layoutFilledMod.foo` */
  override def _to: LayoutFilledIconType = default
}
