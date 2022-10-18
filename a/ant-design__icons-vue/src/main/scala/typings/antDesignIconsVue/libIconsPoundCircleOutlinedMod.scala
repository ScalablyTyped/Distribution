package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsPoundCircleOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PoundCircleOutlined", JSImport.Default)
  @js.native
  val default: PoundCircleOutlinedIconType = js.native
  
  @js.native
  trait PoundCircleOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_PoundCircleOutlinedIconType: String = js.native
  }
  
  type _To = PoundCircleOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsPoundCircleOutlinedMod.foo` */
  override def _to: PoundCircleOutlinedIconType = default
}
