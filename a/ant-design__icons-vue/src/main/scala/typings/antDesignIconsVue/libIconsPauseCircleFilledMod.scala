package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsPauseCircleFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PauseCircleFilled", JSImport.Default)
  @js.native
  val default: PauseCircleFilledIconType = js.native
  
  @js.native
  trait PauseCircleFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_PauseCircleFilledIconType: String = js.native
  }
  
  type _To = PauseCircleFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsPauseCircleFilledMod.foo` */
  override def _to: PauseCircleFilledIconType = default
}
