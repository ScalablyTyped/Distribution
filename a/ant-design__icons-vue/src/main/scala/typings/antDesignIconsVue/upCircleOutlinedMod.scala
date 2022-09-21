package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object upCircleOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/UpCircleOutlined", JSImport.Default)
  @js.native
  val default: UpCircleOutlinedIconType = js.native
  
  @js.native
  trait UpCircleOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_UpCircleOutlinedIconType: String = js.native
  }
  
  type _To = UpCircleOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `upCircleOutlinedMod.foo` */
  override def _to: UpCircleOutlinedIconType = default
}
