package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object weiboSquareFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/WeiboSquareFilled", JSImport.Default)
  @js.native
  val default: WeiboSquareFilledIconType = js.native
  
  @js.native
  trait WeiboSquareFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_WeiboSquareFilledIconType: String = js.native
  }
  
  type _To = WeiboSquareFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `weiboSquareFilledMod.foo` */
  override def _to: WeiboSquareFilledIconType = default
}
