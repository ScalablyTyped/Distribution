package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsDatabaseFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DatabaseFilled", JSImport.Default)
  @js.native
  val default: DatabaseFilledIconType = js.native
  
  @js.native
  trait DatabaseFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_DatabaseFilledIconType: String = js.native
  }
  
  type _To = DatabaseFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsDatabaseFilledMod.foo` */
  override def _to: DatabaseFilledIconType = default
}
