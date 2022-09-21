package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object carFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CarFilled", JSImport.Default)
  @js.native
  val default: CarFilledIconType = js.native
  
  @js.native
  trait CarFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_CarFilledIconType: String = js.native
  }
  
  type _To = CarFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `carFilledMod.foo` */
  override def _to: CarFilledIconType = default
}
