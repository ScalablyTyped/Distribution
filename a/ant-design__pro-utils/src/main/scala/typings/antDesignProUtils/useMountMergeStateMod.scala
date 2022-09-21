package typings.antDesignProUtils

import typings.rcUtil.anon.DefaultValue
import typings.rcUtil.useMergedStateMod.Updater
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useMountMergeStateMod {
  
  @JSImport("@ant-design/pro-utils/es/useMountMergeState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useMountMergeState[T, R](defaultStateValue: T): js.Tuple2[R, Updater[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMountMergeState")(defaultStateValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[R, Updater[T]]]
  inline def useMountMergeState[T, R](defaultStateValue: T, option: DefaultValue[T]): js.Tuple2[R, Updater[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useMountMergeState")(defaultStateValue.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[R, Updater[T]]]
  inline def useMountMergeState[T, R](defaultStateValue: js.Function0[T]): js.Tuple2[R, Updater[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMountMergeState")(defaultStateValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[R, Updater[T]]]
  inline def useMountMergeState[T, R](defaultStateValue: js.Function0[T], option: DefaultValue[T]): js.Tuple2[R, Updater[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useMountMergeState")(defaultStateValue.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[R, Updater[T]]]
}
