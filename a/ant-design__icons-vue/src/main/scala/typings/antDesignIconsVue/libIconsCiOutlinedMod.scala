package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCiOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CiOutlined", JSImport.Default)
  @js.native
  val default: CiOutlinedIconType = js.native
  
  @js.native
  trait CiOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_CiOutlinedIconType: String = js.native
  }
  
  type _To = CiOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCiOutlinedMod.foo` */
  override def _to: CiOutlinedIconType = default
}
