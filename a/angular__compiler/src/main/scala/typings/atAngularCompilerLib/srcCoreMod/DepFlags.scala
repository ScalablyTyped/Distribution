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
trait DepFlags extends js.Object

object DepFlags {
  @scala.inline
  def None: atAngularCompilerLib.atAngularCompilerLibNumbers.`0` = this.cast(0)
  @scala.inline
  def Optional: atAngularCompilerLib.atAngularCompilerLibNumbers.`2` = this.cast(2)
  @scala.inline
  def Self: atAngularCompilerLib.atAngularCompilerLibNumbers.`4` = this.cast(4)
  @scala.inline
  def SkipSelf: atAngularCompilerLib.atAngularCompilerLibNumbers.`1` = this.cast(1)
  @scala.inline
  def Value: atAngularCompilerLib.atAngularCompilerLibNumbers.`8` = this.cast(8)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

