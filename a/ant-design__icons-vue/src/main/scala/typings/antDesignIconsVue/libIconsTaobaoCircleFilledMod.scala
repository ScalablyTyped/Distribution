package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsTaobaoCircleFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/TaobaoCircleFilled", JSImport.Default)
  @js.native
  val default: TaobaoCircleFilledIconType = js.native
  
  @js.native
  trait TaobaoCircleFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_TaobaoCircleFilledIconType: String = js.native
  }
  
  type _To = TaobaoCircleFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsTaobaoCircleFilledMod.foo` */
  override def _to: TaobaoCircleFilledIconType = default
}
