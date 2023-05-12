package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsWeiboSquareFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/WeiboSquareFilled", JSImport.Default)
  @js.native
  val default: WeiboSquareFilledIconType = js.native
  
  @js.native
  trait WeiboSquareFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_WeiboSquareFilledIconType: String = js.native
  }
  
  type _To = WeiboSquareFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsWeiboSquareFilledMod.foo` */
  override def _to: WeiboSquareFilledIconType = default
}
