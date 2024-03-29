package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCarryOutOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CarryOutOutlined", JSImport.Default)
  @js.native
  val default: CarryOutOutlinedIconType = js.native
  
  @js.native
  trait CarryOutOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_CarryOutOutlinedIconType: String = js.native
  }
  
  type _To = CarryOutOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCarryOutOutlinedMod.foo` */
  override def _to: CarryOutOutlinedIconType = default
}
