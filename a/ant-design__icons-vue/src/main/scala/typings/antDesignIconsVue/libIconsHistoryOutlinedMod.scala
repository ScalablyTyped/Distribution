package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsHistoryOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/HistoryOutlined", JSImport.Default)
  @js.native
  val default: HistoryOutlinedIconType = js.native
  
  @js.native
  trait HistoryOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_HistoryOutlinedIconType: String = js.native
  }
  
  type _To = HistoryOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsHistoryOutlinedMod.foo` */
  override def _to: HistoryOutlinedIconType = default
}
