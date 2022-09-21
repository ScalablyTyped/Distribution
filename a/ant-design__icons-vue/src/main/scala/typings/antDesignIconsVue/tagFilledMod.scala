package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/TagFilled", JSImport.Default)
  @js.native
  val default: TagFilledIconType = js.native
  
  @js.native
  trait TagFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_TagFilledIconType: String = js.native
  }
  
  type _To = TagFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `tagFilledMod.foo` */
  override def _to: TagFilledIconType = default
}
