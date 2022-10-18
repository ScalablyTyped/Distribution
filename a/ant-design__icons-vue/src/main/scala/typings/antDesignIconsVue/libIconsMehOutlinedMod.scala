package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsMehOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/MehOutlined", JSImport.Default)
  @js.native
  val default: MehOutlinedIconType = js.native
  
  @js.native
  trait MehOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_MehOutlinedIconType: String = js.native
  }
  
  type _To = MehOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsMehOutlinedMod.foo` */
  override def _to: MehOutlinedIconType = default
}
