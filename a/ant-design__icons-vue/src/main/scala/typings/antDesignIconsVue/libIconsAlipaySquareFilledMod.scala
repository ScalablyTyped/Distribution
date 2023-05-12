package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsAlipaySquareFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/AlipaySquareFilled", JSImport.Default)
  @js.native
  val default: AlipaySquareFilledIconType = js.native
  
  @js.native
  trait AlipaySquareFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_AlipaySquareFilledIconType: String = js.native
  }
  
  type _To = AlipaySquareFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsAlipaySquareFilledMod.foo` */
  override def _to: AlipaySquareFilledIconType = default
}
