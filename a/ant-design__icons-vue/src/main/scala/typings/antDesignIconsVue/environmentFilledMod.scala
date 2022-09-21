package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object environmentFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/EnvironmentFilled", JSImport.Default)
  @js.native
  val default: EnvironmentFilledIconType = js.native
  
  @js.native
  trait EnvironmentFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_EnvironmentFilledIconType: String = js.native
  }
  
  type _To = EnvironmentFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `environmentFilledMod.foo` */
  override def _to: EnvironmentFilledIconType = default
}
