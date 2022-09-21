package typings.arrayUnion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[ArgumentsType /* <: js.Array[Any] */](arguments: ArgumentsType*): ArgumentsType = ^.asInstanceOf[js.Dynamic].apply(arguments.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ArgumentsType]
  
  @JSImport("array-union", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
