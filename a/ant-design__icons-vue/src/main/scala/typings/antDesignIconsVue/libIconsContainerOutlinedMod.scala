package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsContainerOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ContainerOutlined", JSImport.Default)
  @js.native
  val default: ContainerOutlinedIconType = js.native
  
  @js.native
  trait ContainerOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ContainerOutlinedIconType: String = js.native
  }
  
  type _To = ContainerOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsContainerOutlinedMod.foo` */
  override def _to: ContainerOutlinedIconType = default
}
