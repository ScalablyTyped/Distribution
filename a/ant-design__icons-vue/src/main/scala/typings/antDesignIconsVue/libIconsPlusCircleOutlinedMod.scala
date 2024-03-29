package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsPlusCircleOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PlusCircleOutlined", JSImport.Default)
  @js.native
  val default: PlusCircleOutlinedIconType = js.native
  
  @js.native
  trait PlusCircleOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_PlusCircleOutlinedIconType: String = js.native
  }
  
  type _To = PlusCircleOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsPlusCircleOutlinedMod.foo` */
  override def _to: PlusCircleOutlinedIconType = default
}
