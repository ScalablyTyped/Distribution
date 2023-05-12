package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsMediumSquareFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/MediumSquareFilled", JSImport.Default)
  @js.native
  val default: MediumSquareFilledIconType = js.native
  
  @js.native
  trait MediumSquareFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_MediumSquareFilledIconType: String = js.native
  }
  
  type _To = MediumSquareFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsMediumSquareFilledMod.foo` */
  override def _to: MediumSquareFilledIconType = default
}
