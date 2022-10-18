package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsContainerTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ContainerTwoTone", JSImport.Default)
  @js.native
  val default: ContainerTwoToneIconType = js.native
  
  @js.native
  trait ContainerTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ContainerTwoToneIconType: String = js.native
  }
  
  type _To = ContainerTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsContainerTwoToneMod.foo` */
  override def _to: ContainerTwoToneIconType = default
}
