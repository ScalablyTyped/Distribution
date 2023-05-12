package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsAppstoreOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/AppstoreOutlined", JSImport.Default)
  @js.native
  val default: AppstoreOutlinedIconType = js.native
  
  @js.native
  trait AppstoreOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_AppstoreOutlinedIconType: String = js.native
  }
  
  type _To = AppstoreOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsAppstoreOutlinedMod.foo` */
  override def _to: AppstoreOutlinedIconType = default
}
