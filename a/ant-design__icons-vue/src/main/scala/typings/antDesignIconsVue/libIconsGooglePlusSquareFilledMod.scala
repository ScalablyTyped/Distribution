package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsGooglePlusSquareFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/GooglePlusSquareFilled", JSImport.Default)
  @js.native
  val default: GooglePlusSquareFilledIconType = js.native
  
  @js.native
  trait GooglePlusSquareFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_GooglePlusSquareFilledIconType: String = js.native
  }
  
  type _To = GooglePlusSquareFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsGooglePlusSquareFilledMod.foo` */
  override def _to: GooglePlusSquareFilledIconType = default
}
