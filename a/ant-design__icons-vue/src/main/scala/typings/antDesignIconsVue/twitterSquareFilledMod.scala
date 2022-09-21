package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object twitterSquareFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/TwitterSquareFilled", JSImport.Default)
  @js.native
  val default: TwitterSquareFilledIconType = js.native
  
  @js.native
  trait TwitterSquareFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_TwitterSquareFilledIconType: String = js.native
  }
  
  type _To = TwitterSquareFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `twitterSquareFilledMod.foo` */
  override def _to: TwitterSquareFilledIconType = default
}
