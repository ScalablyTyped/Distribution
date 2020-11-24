package typings.assertionError

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AssertionError[T] = typings.std.Error with T with typings.assertionError.anon.ShowDiff
}
