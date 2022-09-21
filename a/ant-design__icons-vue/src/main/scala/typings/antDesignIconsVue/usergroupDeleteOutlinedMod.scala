package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usergroupDeleteOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/UsergroupDeleteOutlined", JSImport.Default)
  @js.native
  val default: UsergroupDeleteOutlinedIconType = js.native
  
  @js.native
  trait UsergroupDeleteOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_UsergroupDeleteOutlinedIconType: String = js.native
  }
  
  type _To = UsergroupDeleteOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `usergroupDeleteOutlinedMod.foo` */
  override def _to: UsergroupDeleteOutlinedIconType = default
}
