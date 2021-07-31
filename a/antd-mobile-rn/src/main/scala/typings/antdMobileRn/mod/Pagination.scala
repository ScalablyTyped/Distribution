package typings.antdMobileRn.mod

import typings.antdMobileRn.anon.AntLocale
import typings.antdMobileRn.anon.Current
import typings.antdMobileRn.paginationIndexNativeMod.PaginationNativeProps
import typings.antdMobileRn.paginationIndexNativeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile-rn", "Pagination")
@js.native
class Pagination protected () extends default {
  def this(props: PaginationNativeProps) = this()
}
/* static members */
object Pagination {
  
  @JSImport("antd-mobile-rn", "Pagination")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd-mobile-rn", "Pagination.contextTypes")
  @js.native
  def contextTypes: AntLocale = js.native
  @scala.inline
  def contextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("antd-mobile-rn", "Pagination.defaultProps")
  @js.native
  def defaultProps: Current = js.native
  @scala.inline
  def defaultProps_=(x: Current): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
