package typings.antDesignProUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUseSafeStateMod {
  
  @JSImport("@ant-design/pro-utils/es/useSafeState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](): js.Tuple2[js.UndefOr[T], SetState[js.UndefOr[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Tuple2[js.UndefOr[T], SetState[js.UndefOr[T]]]]
  inline def default[T](defaultValue: T): js.Tuple2[js.UndefOr[T], SetState[js.UndefOr[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.UndefOr[T], SetState[js.UndefOr[T]]]]
  inline def default[T](defaultValue: js.Function0[T]): js.Tuple2[js.UndefOr[T], SetState[js.UndefOr[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.UndefOr[T], SetState[js.UndefOr[T]]]]
  
  type SetState[T] = js.Function2[/* nextValue */ Updater[T], /* ignoreDestroy */ js.UndefOr[Boolean], Unit]
  
  type Updater[T] = T | (js.Function1[/* prevValue */ T, T])
}
