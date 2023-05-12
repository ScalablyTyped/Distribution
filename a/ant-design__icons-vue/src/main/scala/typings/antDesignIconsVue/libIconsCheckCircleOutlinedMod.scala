package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCheckCircleOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CheckCircleOutlined", JSImport.Default)
  @js.native
  val default: CheckCircleOutlinedIconType = js.native
  
  @js.native
  trait CheckCircleOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_CheckCircleOutlinedIconType: String = js.native
  }
  
  type _To = CheckCircleOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCheckCircleOutlinedMod.foo` */
  override def _to: CheckCircleOutlinedIconType = default
}
