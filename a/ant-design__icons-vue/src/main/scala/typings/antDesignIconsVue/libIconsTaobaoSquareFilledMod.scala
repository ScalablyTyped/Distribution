package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsTaobaoSquareFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/TaobaoSquareFilled", JSImport.Default)
  @js.native
  val default: TaobaoSquareFilledIconType = js.native
  
  @js.native
  trait TaobaoSquareFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_TaobaoSquareFilledIconType: String = js.native
  }
  
  type _To = TaobaoSquareFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsTaobaoSquareFilledMod.foo` */
  override def _to: TaobaoSquareFilledIconType = default
}
