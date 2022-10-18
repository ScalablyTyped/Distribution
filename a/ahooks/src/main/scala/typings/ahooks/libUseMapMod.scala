package typings.ahooks

import typings.ahooks.anon.Get
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseMapMod {
  
  @JSImport("ahooks/lib/useMap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[K, T](): js.Tuple2[Map[K, T], Get[K, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Tuple2[Map[K, T], Get[K, T]]]
  inline def default[K, T](initialValue: js.Iterable[js.Tuple2[K, T]]): js.Tuple2[Map[K, T], Get[K, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(initialValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Map[K, T], Get[K, T]]]
}
