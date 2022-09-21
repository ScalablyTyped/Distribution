package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stopFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/StopFilled", JSImport.Default)
  @js.native
  val default: StopFilledIconType = js.native
  
  @js.native
  trait StopFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_StopFilledIconType: String = js.native
  }
  
  type _To = StopFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `stopFilledMod.foo` */
  override def _to: StopFilledIconType = default
}
