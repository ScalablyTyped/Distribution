package typings.angularCompiler.outputAstMod

import typings.angularCompiler.angularCompilerStrings.desc
import typings.angularCompiler.angularCompilerStrings.id
import typings.angularCompiler.angularCompilerStrings.meaning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.angularCompiler.angularCompilerStrings.desc
  - typings.angularCompiler.angularCompilerStrings.id
  - typings.angularCompiler.angularCompilerStrings.meaning
*/
trait JSDocTagName extends js.Object

object JSDocTagName {
  @scala.inline
  def Desc: desc = this.cast("desc")
  @scala.inline
  def Id: id = this.cast("id")
  @scala.inline
  def Meaning: meaning = this.cast("meaning")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

