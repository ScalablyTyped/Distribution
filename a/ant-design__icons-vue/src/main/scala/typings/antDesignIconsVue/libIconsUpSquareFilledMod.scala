package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsUpSquareFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/UpSquareFilled", JSImport.Default)
  @js.native
  val default: UpSquareFilledIconType = js.native
  
  @js.native
  trait UpSquareFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_UpSquareFilledIconType: String = js.native
  }
  
  type _To = UpSquareFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsUpSquareFilledMod.foo` */
  override def _to: UpSquareFilledIconType = default
}
