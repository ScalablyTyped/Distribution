package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zhihuSquareFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ZhihuSquareFilled", JSImport.Default)
  @js.native
  val default: ZhihuSquareFilledIconType = js.native
  
  @js.native
  trait ZhihuSquareFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ZhihuSquareFilledIconType: String = js.native
  }
  
  type _To = ZhihuSquareFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `zhihuSquareFilledMod.foo` */
  override def _to: ZhihuSquareFilledIconType = default
}
