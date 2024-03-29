package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsAppstoreFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/AppstoreFilled", JSImport.Default)
  @js.native
  val default: AppstoreFilledIconType = js.native
  
  @js.native
  trait AppstoreFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_AppstoreFilledIconType: String = js.native
  }
  
  type _To = AppstoreFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsAppstoreFilledMod.foo` */
  override def _to: AppstoreFilledIconType = default
}
