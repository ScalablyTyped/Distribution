package typings.antd

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useSyncStateMod {
  
  @JSImport("antd/lib/_util/hooks/useSyncState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T](initialValue: T): UseSyncStateProps[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(initialValue.asInstanceOf[js.Any]).asInstanceOf[UseSyncStateProps[T]]
  
  type UseSyncStateProps[T] = js.Tuple2[js.Function0[T], js.Function1[/* newValue */ T, Unit]]
}
