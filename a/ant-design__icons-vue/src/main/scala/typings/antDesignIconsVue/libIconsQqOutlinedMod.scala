package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsQqOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/QqOutlined", JSImport.Default)
  @js.native
  val default: QqOutlinedIconType = js.native
  
  @js.native
  trait QqOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_QqOutlinedIconType: String = js.native
  }
  
  type _To = QqOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsQqOutlinedMod.foo` */
  override def _to: QqOutlinedIconType = default
}
