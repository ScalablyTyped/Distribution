package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsGoldFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/GoldFilled", JSImport.Default)
  @js.native
  val default: GoldFilledIconType = js.native
  
  @js.native
  trait GoldFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_GoldFilledIconType: String = js.native
  }
  
  type _To = GoldFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsGoldFilledMod.foo` */
  override def _to: GoldFilledIconType = default
}
