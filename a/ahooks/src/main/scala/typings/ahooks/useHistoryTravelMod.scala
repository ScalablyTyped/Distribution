package typings.ahooks

import typings.ahooks.anon.Back
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useHistoryTravelMod {
  
  @JSImport("ahooks/lib/useHistoryTravel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](): Back[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Back[T]]
  inline def default[T](initialValue: T): Back[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(initialValue.asInstanceOf[js.Any]).asInstanceOf[Back[T]]
}
