package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCiCircleOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CiCircleOutlined", JSImport.Default)
  @js.native
  val default: CiCircleOutlinedIconType = js.native
  
  @js.native
  trait CiCircleOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_CiCircleOutlinedIconType: String = js.native
  }
  
  type _To = CiCircleOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCiCircleOutlinedMod.foo` */
  override def _to: CiCircleOutlinedIconType = default
}
