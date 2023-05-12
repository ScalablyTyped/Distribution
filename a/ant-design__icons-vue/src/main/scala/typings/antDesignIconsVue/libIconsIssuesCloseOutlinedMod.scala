package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsIssuesCloseOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/IssuesCloseOutlined", JSImport.Default)
  @js.native
  val default: IssuesCloseOutlinedIconType = js.native
  
  @js.native
  trait IssuesCloseOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_IssuesCloseOutlinedIconType: String = js.native
  }
  
  type _To = IssuesCloseOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsIssuesCloseOutlinedMod.foo` */
  override def _to: IssuesCloseOutlinedIconType = default
}
