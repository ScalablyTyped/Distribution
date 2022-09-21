package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object minusSquareFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/MinusSquareFilled", JSImport.Default)
  @js.native
  val default: MinusSquareFilledIconType = js.native
  
  @js.native
  trait MinusSquareFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_MinusSquareFilledIconType: String = js.native
  }
  
  type _To = MinusSquareFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `minusSquareFilledMod.foo` */
  override def _to: MinusSquareFilledIconType = default
}
