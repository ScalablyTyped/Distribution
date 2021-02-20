package typings.asyncblock

import typings.asyncblock.ab.ab.Flow
import typings.asyncblock.ab.ab.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("asyncblock", JSImport.Namespace)
  @js.native
  def apply[T](run: js.Function0[T]): Result[T] = js.native
  @JSImport("asyncblock", JSImport.Namespace)
  @js.native
  def apply[T](run: js.Function0[T], done: js.Function): Result[T] = js.native
  @JSImport("asyncblock", JSImport.Namespace)
  @js.native
  def apply[T](run: js.Function1[/* flow */ Flow, T]): Result[T] = js.native
  @JSImport("asyncblock", JSImport.Namespace)
  @js.native
  def apply[T](run: js.Function1[/* flow */ Flow, T], done: js.Function): Result[T] = js.native
  
  @JSImport("asyncblock", "enableTransform")
  @js.native
  def enableTransform(module: js.Any): Boolean = js.native
  
  @JSImport("asyncblock", "getCurrentFlow")
  @js.native
  def getCurrentFlow(): Flow = js.native
  
  @JSImport("asyncblock", "ifError")
  @js.native
  def ifError(callback: js.Function): js.Function = js.native
  
  @JSImport("asyncblock", "nostack")
  @js.native
  def nostack[T](run: js.Function0[T]): Result[T] = js.native
  @JSImport("asyncblock", "nostack")
  @js.native
  def nostack[T](run: js.Function0[T], done: js.Function): Result[T] = js.native
  @JSImport("asyncblock", "nostack")
  @js.native
  def nostack[T](run: js.Function1[/* flow */ Flow, T]): Result[T] = js.native
  @JSImport("asyncblock", "nostack")
  @js.native
  def nostack[T](run: js.Function1[/* flow */ Flow, T], done: js.Function): Result[T] = js.native
}
