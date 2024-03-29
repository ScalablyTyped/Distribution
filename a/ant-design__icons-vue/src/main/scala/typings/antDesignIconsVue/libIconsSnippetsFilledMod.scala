package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsSnippetsFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SnippetsFilled", JSImport.Default)
  @js.native
  val default: SnippetsFilledIconType = js.native
  
  @js.native
  trait SnippetsFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_SnippetsFilledIconType: String = js.native
  }
  
  type _To = SnippetsFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsSnippetsFilledMod.foo` */
  override def _to: SnippetsFilledIconType = default
}
