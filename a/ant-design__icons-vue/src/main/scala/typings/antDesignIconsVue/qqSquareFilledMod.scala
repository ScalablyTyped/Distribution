package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object qqSquareFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/QqSquareFilled", JSImport.Default)
  @js.native
  val default: QqSquareFilledIconType = js.native
  
  @js.native
  trait QqSquareFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_QqSquareFilledIconType: String = js.native
  }
  
  type _To = QqSquareFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `qqSquareFilledMod.foo` */
  override def _to: QqSquareFilledIconType = default
}
