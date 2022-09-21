package typings.ahooks

import typings.ahooks.createUseStorageStateMod.IFuncUpdater
import typings.ahooks.createUseStorageStateMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useSessionStorageStateMod {
  
  @JSImport("ahooks/lib/useSessionStorageState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](key: String): js.Tuple2[T, js.Function1[/* value */ T | IFuncUpdater[T], Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(key.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[T, js.Function1[/* value */ T | IFuncUpdater[T], Unit]]]
  inline def default[T](key: String, options: Options[T]): js.Tuple2[T, js.Function1[/* value */ T | IFuncUpdater[T], Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[T, js.Function1[/* value */ T | IFuncUpdater[T], Unit]]]
}
