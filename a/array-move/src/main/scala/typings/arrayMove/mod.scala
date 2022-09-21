package typings.arrayMove

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("array-move", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrayMoveImmutable[ValueType](array: js.Array[ValueType], fromIndex: Double, toIndex: Double): js.Array[ValueType] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayMoveImmutable")(array.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any], toIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[ValueType]]
  
  inline def arrayMoveMutable(array: js.Array[Any], fromIndex: Double, toIndex: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayMoveMutable")(array.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any], toIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
