package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsProjectTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ProjectTwoTone", JSImport.Default)
  @js.native
  val default: ProjectTwoToneIconType = js.native
  
  @js.native
  trait ProjectTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_ProjectTwoToneIconType: String = js.native
  }
  
  type _To = ProjectTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsProjectTwoToneMod.foo` */
  override def _to: ProjectTwoToneIconType = default
}
