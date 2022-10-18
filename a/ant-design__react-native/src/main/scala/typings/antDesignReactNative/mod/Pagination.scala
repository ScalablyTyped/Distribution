package typings.antDesignReactNative.mod

import typings.antDesignReactNative.anon.Current
import typings.antDesignReactNative.libPaginationMod.PaginationNativeProps
import typings.antDesignReactNative.libPaginationMod.default
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native", "Pagination")
@js.native
open class Pagination protected () extends default {
  def this(props: PaginationNativeProps) = this()
}
/* static members */
object Pagination {
  
  @JSImport("@ant-design/react-native", "Pagination")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/react-native", "Pagination.contextType")
  @js.native
  def contextType: Context[js.Object] = js.native
  inline def contextType_=(x: Context[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  
  @JSImport("@ant-design/react-native", "Pagination.defaultProps")
  @js.native
  def defaultProps: Current = js.native
  inline def defaultProps_=(x: Current): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
