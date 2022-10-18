package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsOneToOneOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/OneToOneOutlined", JSImport.Default)
  @js.native
  val default: OneToOneOutlinedIconType = js.native
  
  @js.native
  trait OneToOneOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_OneToOneOutlinedIconType: String = js.native
  }
  
  type _To = OneToOneOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsOneToOneOutlinedMod.foo` */
  override def _to: OneToOneOutlinedIconType = default
}
