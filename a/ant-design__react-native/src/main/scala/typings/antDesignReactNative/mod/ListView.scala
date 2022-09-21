package typings.antDesignReactNative.mod

import typings.antDesignReactNative.listViewMod.default
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native", "ListView")
@js.native
open class ListView[T] () extends default[T]
object ListView {
  
  @JSImport("@ant-design/react-native", "ListView")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("@ant-design/react-native", "ListView.contextType")
  @js.native
  def contextType: Context[js.Object] = js.native
  inline def contextType_=(x: Context[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
}
