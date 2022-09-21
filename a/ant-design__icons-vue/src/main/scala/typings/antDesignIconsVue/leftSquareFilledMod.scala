package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object leftSquareFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/LeftSquareFilled", JSImport.Default)
  @js.native
  val default: LeftSquareFilledIconType = js.native
  
  @js.native
  trait LeftSquareFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_LeftSquareFilledIconType: String = js.native
  }
  
  type _To = LeftSquareFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `leftSquareFilledMod.foo` */
  override def _to: LeftSquareFilledIconType = default
}
