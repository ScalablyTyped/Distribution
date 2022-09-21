package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dingtalkOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DingtalkOutlined", JSImport.Default)
  @js.native
  val default: DingtalkOutlinedIconType = js.native
  
  @js.native
  trait DingtalkOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_DingtalkOutlinedIconType: String = js.native
  }
  
  type _To = DingtalkOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `dingtalkOutlinedMod.foo` */
  override def _to: DingtalkOutlinedIconType = default
}
