package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dollarOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DollarOutlined", JSImport.Default)
  @js.native
  val default: DollarOutlinedIconType = js.native
  
  @js.native
  trait DollarOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_DollarOutlinedIconType: String = js.native
  }
  
  type _To = DollarOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `dollarOutlinedMod.foo` */
  override def _to: DollarOutlinedIconType = default
}
