package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taobaoOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/TaobaoOutlined", JSImport.Default)
  @js.native
  val default: TaobaoOutlinedIconType = js.native
  
  @js.native
  trait TaobaoOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_TaobaoOutlinedIconType: String = js.native
  }
  
  type _To = TaobaoOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `taobaoOutlinedMod.foo` */
  override def _to: TaobaoOutlinedIconType = default
}
