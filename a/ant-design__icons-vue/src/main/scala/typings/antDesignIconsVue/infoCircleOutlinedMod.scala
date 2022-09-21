package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object infoCircleOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/InfoCircleOutlined", JSImport.Default)
  @js.native
  val default: InfoCircleOutlinedIconType = js.native
  
  @js.native
  trait InfoCircleOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_InfoCircleOutlinedIconType: String = js.native
  }
  
  type _To = InfoCircleOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `infoCircleOutlinedMod.foo` */
  override def _to: InfoCircleOutlinedIconType = default
}
