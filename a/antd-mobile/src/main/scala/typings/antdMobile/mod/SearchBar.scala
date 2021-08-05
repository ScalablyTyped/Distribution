package typings.antdMobile.mod

import typings.antdMobile.anon.AntLocale
import typings.antdMobile.anon.OnBlur
import typings.antdMobile.searchBarMod.SearchBarProps
import typings.antdMobile.searchBarMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile", "SearchBar")
@js.native
class SearchBar protected () extends default {
  def this(props: SearchBarProps) = this()
}
/* static members */
object SearchBar {
  
  @JSImport("antd-mobile", "SearchBar")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd-mobile", "SearchBar.contextTypes")
  @js.native
  def contextTypes: AntLocale = js.native
  inline def contextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("antd-mobile", "SearchBar.defaultProps")
  @js.native
  def defaultProps: OnBlur = js.native
  inline def defaultProps_=(x: OnBlur): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
