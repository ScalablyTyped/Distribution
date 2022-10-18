package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsBuildFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/BuildFilled", JSImport.Default)
  @js.native
  val default: BuildFilledIconType = js.native
  
  @js.native
  trait BuildFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_BuildFilledIconType: String = js.native
  }
  
  type _To = BuildFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsBuildFilledMod.foo` */
  override def _to: BuildFilledIconType = default
}
