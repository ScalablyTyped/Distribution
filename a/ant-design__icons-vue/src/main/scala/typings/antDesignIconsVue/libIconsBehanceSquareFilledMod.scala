package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsBehanceSquareFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/BehanceSquareFilled", JSImport.Default)
  @js.native
  val default: BehanceSquareFilledIconType = js.native
  
  @js.native
  trait BehanceSquareFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_BehanceSquareFilledIconType: String = js.native
  }
  
  type _To = BehanceSquareFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsBehanceSquareFilledMod.foo` */
  override def _to: BehanceSquareFilledIconType = default
}
