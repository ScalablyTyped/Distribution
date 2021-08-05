package typings.antDesignReactNative.mod

import typings.antDesignReactNative.anon.AntLocale
import typings.antDesignReactNative.anon.Current
import typings.antDesignReactNative.paginationMod.PaginationNativeProps
import typings.antDesignReactNative.paginationMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native", "Pagination")
@js.native
class Pagination protected () extends default {
  def this(props: PaginationNativeProps) = this()
}
/* static members */
object Pagination {
  
  @JSImport("@ant-design/react-native", "Pagination")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/react-native", "Pagination.contextTypes")
  @js.native
  def contextTypes: AntLocale = js.native
  inline def contextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("@ant-design/react-native", "Pagination.defaultProps")
  @js.native
  def defaultProps: Current = js.native
  inline def defaultProps_=(x: Current): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
