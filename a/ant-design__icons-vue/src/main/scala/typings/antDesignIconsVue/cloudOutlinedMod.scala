package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CloudOutlined", JSImport.Default)
  @js.native
  val default: CloudOutlinedIconType = js.native
  
  @js.native
  trait CloudOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_CloudOutlinedIconType: String = js.native
  }
  
  type _To = CloudOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `cloudOutlinedMod.foo` */
  override def _to: CloudOutlinedIconType = default
}
