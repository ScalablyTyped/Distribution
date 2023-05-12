package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsMinusCircleFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/MinusCircleFilled", JSImport.Default)
  @js.native
  val default: MinusCircleFilledIconType = js.native
  
  @js.native
  trait MinusCircleFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_MinusCircleFilledIconType: String = js.native
  }
  
  type _To = MinusCircleFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsMinusCircleFilledMod.foo` */
  override def _to: MinusCircleFilledIconType = default
}
