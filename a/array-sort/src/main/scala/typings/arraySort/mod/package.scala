package typings.arraySort

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Comparator[T] = js.Function2[/* a */ T, /* b */ T, scala.Double]
  
  type ComparisonArg[T] = java.lang.String | typings.arraySort.mod.Comparator[T]
  
  type ComparisonArgs[T] = typings.arraySort.mod.ComparisonArg[T] | js.Array[typings.arraySort.mod.ComparisonArg[T]]
}
