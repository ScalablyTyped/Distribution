package typings.arraySame

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Check one or more array whether they have the same items as `source`.
    *
    * @example
    * import hasSameElements = require('array-same');
    *
    * hasSameElements([1, 2], [2, 1]); // true
    * hasSameElements([1, 2, 3], [1, 2]); // false
    */
  inline def apply[T](source: js.Array[T], args: js.Array[T]*): Boolean = ^.asInstanceOf[js.Dynamic].apply(scala.List(source.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Boolean]
  
  @JSImport("array-same", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
