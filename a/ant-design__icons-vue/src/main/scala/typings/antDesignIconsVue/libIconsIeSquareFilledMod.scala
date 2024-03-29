package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsIeSquareFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/IeSquareFilled", JSImport.Default)
  @js.native
  val default: IeSquareFilledIconType = js.native
  
  @js.native
  trait IeSquareFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_IeSquareFilledIconType: String = js.native
  }
  
  type _To = IeSquareFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsIeSquareFilledMod.foo` */
  override def _to: IeSquareFilledIconType = default
}
