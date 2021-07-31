package typings.antdMobile.mod

import typings.antdMobile.anon.AntLocale
import typings.antdMobile.anon.Current
import typings.antdMobile.paginationMod.PaginationProps
import typings.antdMobile.paginationMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile", "Pagination")
@js.native
class Pagination protected () extends default {
  def this(props: PaginationProps) = this()
}
/* static members */
object Pagination {
  
  @JSImport("antd-mobile", "Pagination")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd-mobile", "Pagination.contextTypes")
  @js.native
  def contextTypes: AntLocale = js.native
  @scala.inline
  def contextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("antd-mobile", "Pagination.defaultProps")
  @js.native
  def defaultProps: Current = js.native
  @scala.inline
  def defaultProps_=(x: Current): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
