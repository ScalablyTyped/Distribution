package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsIdcardOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/IdcardOutlined", JSImport.Default)
  @js.native
  val default: IdcardOutlinedIconType = js.native
  
  @js.native
  trait IdcardOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_IdcardOutlinedIconType: String = js.native
  }
  
  type _To = IdcardOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsIdcardOutlinedMod.foo` */
  override def _to: IdcardOutlinedIconType = default
}
