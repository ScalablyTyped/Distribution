package typings.atAngularCompiler.srcCoreMod

import typings.atAngularCompiler.atAngularCompilerNumbers.`0`
import typings.atAngularCompiler.atAngularCompilerNumbers.`1`
import typings.atAngularCompiler.atAngularCompilerNumbers.`2`
import typings.atAngularCompiler.atAngularCompilerNumbers.`4`
import typings.atAngularCompiler.atAngularCompilerNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atAngularCompiler.atAngularCompilerNumbers.`0`
  - typings.atAngularCompiler.atAngularCompilerNumbers.`1`
  - typings.atAngularCompiler.atAngularCompilerNumbers.`2`
  - typings.atAngularCompiler.atAngularCompilerNumbers.`4`
  - typings.atAngularCompiler.atAngularCompilerNumbers.`8`
*/
trait InjectFlags extends js.Object

object InjectFlags {
  @scala.inline
  def Default: `0` = this.cast(0)
  /**
    * Specifies that an injector should retrieve a dependency from any injector until reaching the
    * host element of the current component. (Only used with Element Injector)
    */
  @scala.inline
  def Host: `1` = this.cast(1)
  /** Inject `defaultValue` instead if token not found. */
  @scala.inline
  def Optional: `8` = this.cast(8)
  /** Don't descend into ancestors of the node requesting injection. */
  @scala.inline
  def Self: `2` = this.cast(2)
  /** Skip the node that is requesting injection. */
  @scala.inline
  def SkipSelf: `4` = this.cast(4)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

