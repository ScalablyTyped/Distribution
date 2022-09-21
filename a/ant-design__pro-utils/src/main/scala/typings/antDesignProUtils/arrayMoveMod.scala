package typings.antDesignProUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayMoveMod {
  
  @JSImport("@ant-design/pro-utils/es/array-move", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrayMoveImmutable[T](array: js.Array[T], fromIndex: Double, toIndex: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayMoveImmutable")(array.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any], toIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def arrayMoveMutable[ValueType](array: js.Array[ValueType], fromIndex: Double, toIndex: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayMoveMutable")(array.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any], toIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
