package typings.antdMobile.mod

import typings.antdMobile.anon.AntLocale
import typings.antdMobile.anon.Data
import typings.antdMobile.menuMod.default
import typings.antdMobile.menuPropsTypeMod.MenuProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile", "Menu")
@js.native
class Menu protected () extends default {
  def this(props: MenuProps) = this()
}
/* static members */
object Menu {
  
  @JSImport("antd-mobile", "Menu")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd-mobile", "Menu.contextTypes")
  @js.native
  def contextTypes: AntLocale = js.native
  @scala.inline
  def contextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("antd-mobile", "Menu.defaultProps")
  @js.native
  def defaultProps: Data = js.native
  @scala.inline
  def defaultProps_=(x: Data): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
