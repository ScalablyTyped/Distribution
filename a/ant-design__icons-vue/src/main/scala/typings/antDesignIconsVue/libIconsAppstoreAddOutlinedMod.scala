package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsAppstoreAddOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/AppstoreAddOutlined", JSImport.Default)
  @js.native
  val default: AppstoreAddOutlinedIconType = js.native
  
  @js.native
  trait AppstoreAddOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_AppstoreAddOutlinedIconType: String = js.native
  }
  
  type _To = AppstoreAddOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsAppstoreAddOutlinedMod.foo` */
  override def _to: AppstoreAddOutlinedIconType = default
}
