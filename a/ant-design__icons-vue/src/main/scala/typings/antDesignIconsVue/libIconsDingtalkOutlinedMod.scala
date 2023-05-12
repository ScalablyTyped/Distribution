package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsDingtalkOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DingtalkOutlined", JSImport.Default)
  @js.native
  val default: DingtalkOutlinedIconType = js.native
  
  @js.native
  trait DingtalkOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_DingtalkOutlinedIconType: String = js.native
  }
  
  type _To = DingtalkOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsDingtalkOutlinedMod.foo` */
  override def _to: DingtalkOutlinedIconType = default
}
