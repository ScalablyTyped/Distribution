package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsAlipayCircleFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/AlipayCircleFilled", JSImport.Default)
  @js.native
  val default: AlipayCircleFilledIconType = js.native
  
  @js.native
  trait AlipayCircleFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_AlipayCircleFilledIconType: String = js.native
  }
  
  type _To = AlipayCircleFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsAlipayCircleFilledMod.foo` */
  override def _to: AlipayCircleFilledIconType = default
}
