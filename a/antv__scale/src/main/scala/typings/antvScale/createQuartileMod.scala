package typings.antvScale

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createQuartileMod {
  
  @JSImport("@antv/scale/lib/utils/create-quartile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createQuartile(arr: js.Array[Double], n: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createQuartile")(arr.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def createQuartile(arr: js.Array[Double], n: Double, isSorted: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createQuartile")(arr.asInstanceOf[js.Any], n.asInstanceOf[js.Any], isSorted.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
}
