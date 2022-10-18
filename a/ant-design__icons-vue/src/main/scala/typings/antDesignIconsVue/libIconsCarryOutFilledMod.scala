package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCarryOutFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CarryOutFilled", JSImport.Default)
  @js.native
  val default: CarryOutFilledIconType = js.native
  
  @js.native
  trait CarryOutFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_CarryOutFilledIconType: String = js.native
  }
  
  type _To = CarryOutFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCarryOutFilledMod.foo` */
  override def _to: CarryOutFilledIconType = default
}
