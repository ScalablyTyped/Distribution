package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsQrcodeOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/QrcodeOutlined", JSImport.Default)
  @js.native
  val default: QrcodeOutlinedIconType = js.native
  
  @js.native
  trait QrcodeOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_QrcodeOutlinedIconType: String = js.native
  }
  
  type _To = QrcodeOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsQrcodeOutlinedMod.foo` */
  override def _to: QrcodeOutlinedIconType = default
}
