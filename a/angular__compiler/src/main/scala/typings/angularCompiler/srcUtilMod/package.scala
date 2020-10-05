package typings.angularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object srcUtilMod {
  type SyncAsync[T] = T | js.Promise[T]
}
