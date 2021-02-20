package typings.atomically

import typings.atomically.typesMod.Exception
import typings.atomically.typesMod.FN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attemptifyMod {
  
  @JSImport("atomically/dist/utils/attemptify", "attemptifyAsync")
  @js.native
  def attemptifyAsync[T /* <: FN[js.Array[_], _] */](fn: T): T = js.native
  @JSImport("atomically/dist/utils/attemptify", "attemptifyAsync")
  @js.native
  def attemptifyAsync[T /* <: FN[js.Array[_], _] */](fn: T, onError: FN[js.Array[Exception], _]): T = js.native
  
  @JSImport("atomically/dist/utils/attemptify", "attemptifySync")
  @js.native
  def attemptifySync[T /* <: FN[js.Array[_], _] */](fn: T): T = js.native
  @JSImport("atomically/dist/utils/attemptify", "attemptifySync")
  @js.native
  def attemptifySync[T /* <: FN[js.Array[_], _] */](fn: T, onError: FN[js.Array[Exception], _]): T = js.native
}
