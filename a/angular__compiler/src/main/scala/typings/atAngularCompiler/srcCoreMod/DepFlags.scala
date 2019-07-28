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

