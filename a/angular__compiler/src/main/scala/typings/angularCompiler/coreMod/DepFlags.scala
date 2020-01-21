package typings.angularCompiler.coreMod

import typings.angularCompiler.angularCompilerNumbers.`0`
import typings.angularCompiler.angularCompilerNumbers.`1`
import typings.angularCompiler.angularCompilerNumbers.`2`
import typings.angularCompiler.angularCompilerNumbers.`4`
import typings.angularCompiler.angularCompilerNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.angularCompiler.angularCompilerNumbers.`0`
  - typings.angularCompiler.angularCompilerNumbers.`1`
  - typings.angularCompiler.angularCompilerNumbers.`2`
  - typings.angularCompiler.angularCompilerNumbers.`4`
  - typings.angularCompiler.angularCompilerNumbers.`8`
*/
trait DepFlags extends js.Object

object DepFlags {
  @scala.inline
  def None: `0` = this.cast(0)
  @scala.inline
  def Optional: `2` = this.cast(2)
  @scala.inline
  def Self: `4` = this.cast(4)
  @scala.inline
  def SkipSelf: `1` = this.cast(1)
  @scala.inline
  def Value: `8` = this.cast(8)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

