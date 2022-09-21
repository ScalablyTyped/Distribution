package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object amazonSquareFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/AmazonSquareFilled", JSImport.Default)
  @js.native
  val default: AmazonSquareFilledIconType = js.native
  
  @js.native
  trait AmazonSquareFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_AmazonSquareFilledIconType: String = js.native
  }
  
  type _To = AmazonSquareFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `amazonSquareFilledMod.foo` */
  override def _to: AmazonSquareFilledIconType = default
}
