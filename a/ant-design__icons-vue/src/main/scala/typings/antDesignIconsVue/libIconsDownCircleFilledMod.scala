package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsDownCircleFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DownCircleFilled", JSImport.Default)
  @js.native
  val default: DownCircleFilledIconType = js.native
  
  @js.native
  trait DownCircleFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_DownCircleFilledIconType: String = js.native
  }
  
  type _To = DownCircleFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsDownCircleFilledMod.foo` */
  override def _to: DownCircleFilledIconType = default
}
