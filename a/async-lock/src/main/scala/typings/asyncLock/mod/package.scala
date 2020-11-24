package typings.asyncLock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AsyncLockDoneCallback[T] = js.Function2[/* err */ js.UndefOr[typings.std.Error], /* ret */ js.UndefOr[T], scala.Unit]
}
