package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hddFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/HddFilled", JSImport.Default)
  @js.native
  val default: HddFilledIconType = js.native
  
  @js.native
  trait HddFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_HddFilledIconType: String = js.native
  }
  
  type _To = HddFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `hddFilledMod.foo` */
  override def _to: HddFilledIconType = default
}
