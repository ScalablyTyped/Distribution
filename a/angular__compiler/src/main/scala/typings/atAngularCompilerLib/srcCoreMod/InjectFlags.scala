package typings
package atAngularCompilerLib.srcCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - atAngularCompilerLib.atAngularCompilerLibNumbers.`0`
  - atAngularCompilerLib.atAngularCompilerLibNumbers.`1`
  - atAngularCompilerLib.atAngularCompilerLibNumbers.`2`
  - atAngularCompilerLib.atAngularCompilerLibNumbers.`4`
  - atAngularCompilerLib.atAngularCompilerLibNumbers.`8`
*/
trait InjectFlags extends js.Object

object InjectFlags {
  @scala.inline
  def Default: atAngularCompilerLib.atAngularCompilerLibNumbers.`0` = this.cast(0)
  /**
    * Specifies that an injector should retrieve a dependency from any injector until reaching the
    * host element of the current component. (Only used with Element Injector)
    */
  @scala.inline
  def Host: atAngularCompilerLib.atAngularCompilerLibNumbers.`1` = this.cast(1)
  /** Inject `defaultValue` instead if token not found. */
  @scala.inline
  def Optional: atAngularCompilerLib.atAngularCompilerLibNumbers.`8` = this.cast(8)
  /** Don't descend into ancestors of the node requesting injection. */
  @scala.inline
  def Self: atAngularCompilerLib.atAngularCompilerLibNumbers.`2` = this.cast(2)
  /** Skip the node that is requesting injection. */
  @scala.inline
  def SkipSelf: atAngularCompilerLib.atAngularCompilerLibNumbers.`4` = this.cast(4)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

