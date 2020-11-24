package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd/lib/_util/hooks/useSyncState", JSImport.Namespace)
@js.native
object useSyncStateMod extends js.Object {
  
  def default[T](initialValue: T): UseSyncStateProps[T] = js.native
  
  type UseSyncStateProps[T] = js.Tuple2[js.Function0[T], js.Function1[/* newValue */ T, Unit]]
}
