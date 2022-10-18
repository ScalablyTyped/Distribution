package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsDeleteFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DeleteFilled", JSImport.Default)
  @js.native
  val default: DeleteFilledIconType = js.native
  
  @js.native
  trait DeleteFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_DeleteFilledIconType: String = js.native
  }
  
  type _To = DeleteFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsDeleteFilledMod.foo` */
  override def _to: DeleteFilledIconType = default
}
