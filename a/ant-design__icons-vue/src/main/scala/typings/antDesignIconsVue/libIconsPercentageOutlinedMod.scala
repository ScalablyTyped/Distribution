package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsPercentageOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PercentageOutlined", JSImport.Default)
  @js.native
  val default: PercentageOutlinedIconType = js.native
  
  @js.native
  trait PercentageOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_PercentageOutlinedIconType: String = js.native
  }
  
  type _To = PercentageOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsPercentageOutlinedMod.foo` */
  override def _to: PercentageOutlinedIconType = default
}
