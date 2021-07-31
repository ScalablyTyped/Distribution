package typings.antd

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useFreshStateMod {
  
  @JSImport("antd/lib/upload/useFreshState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T](defaultValue: T): js.Tuple2[
    js.Function1[/* displayValue */ js.UndefOr[Boolean], T], 
    js.Function1[/* newValue */ T, Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    js.Function1[/* displayValue */ js.UndefOr[Boolean], T], 
    js.Function1[/* newValue */ T, Unit]
  ]]
  @scala.inline
  def default[T](defaultValue: T, propValue: T): js.Tuple2[
    js.Function1[/* displayValue */ js.UndefOr[Boolean], T], 
    js.Function1[/* newValue */ T, Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(defaultValue.asInstanceOf[js.Any], propValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.Function1[/* displayValue */ js.UndefOr[Boolean], T], 
    js.Function1[/* newValue */ T, Unit]
  ]]
}
