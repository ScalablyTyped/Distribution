package typings.ahooks

import typings.ahooks.anon.Add
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useSetMod {
  
  @JSImport("ahooks/lib/useSet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[K](): js.Tuple2[Set[K], Add[K]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Tuple2[Set[K], Add[K]]]
  inline def default[K](initialValue: js.Iterable[K]): js.Tuple2[Set[K], Add[K]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(initialValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Set[K], Add[K]]]
}
