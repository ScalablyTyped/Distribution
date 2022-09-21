package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object euroCircleOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/EuroCircleOutlined", JSImport.Default)
  @js.native
  val default: EuroCircleOutlinedIconType = js.native
  
  @js.native
  trait EuroCircleOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_EuroCircleOutlinedIconType: String = js.native
  }
  
  type _To = EuroCircleOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `euroCircleOutlinedMod.foo` */
  override def _to: EuroCircleOutlinedIconType = default
}
