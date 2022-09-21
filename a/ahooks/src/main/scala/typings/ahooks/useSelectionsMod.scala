package typings.ahooks

import typings.ahooks.anon.AllSelected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useSelectionsMod {
  
  @JSImport("ahooks/lib/useSelections", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](items: js.Array[T]): AllSelected[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(items.asInstanceOf[js.Any]).asInstanceOf[AllSelected[T]]
  inline def default[T](items: js.Array[T], defaultSelected: js.Array[T]): AllSelected[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(items.asInstanceOf[js.Any], defaultSelected.asInstanceOf[js.Any])).asInstanceOf[AllSelected[T]]
}
