package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsPoundCircleFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PoundCircleFilled", JSImport.Default)
  @js.native
  val default: PoundCircleFilledIconType = js.native
  
  @js.native
  trait PoundCircleFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_PoundCircleFilledIconType: String = js.native
  }
  
  type _To = PoundCircleFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsPoundCircleFilledMod.foo` */
  override def _to: PoundCircleFilledIconType = default
}
