package typings.arrDiff

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T](first: js.Array[T], args: js.Array[Any]*): js.Array[T] = ^.asInstanceOf[js.Dynamic].apply(List(first.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Array[T]]
  
  @JSImport("arr-diff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
