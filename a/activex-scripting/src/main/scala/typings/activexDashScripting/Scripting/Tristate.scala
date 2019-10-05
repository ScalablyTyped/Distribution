package typings.activexDashScripting.Scripting

import typings.activexDashScripting.activexDashScriptingNumbers.`-1`
import typings.activexDashScripting.activexDashScriptingNumbers.`-2`
import typings.activexDashScripting.activexDashScriptingNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:no-const-enum
/* Rewritten from type alias, can be one of: 
  - typings.activexDashScripting.activexDashScriptingNumbers.`0`
  - typings.activexDashScripting.activexDashScriptingNumbers.`-2`
  - typings.activexDashScripting.activexDashScriptingNumbers.`-1`
*/
trait Tristate extends js.Object

object Tristate {
  @scala.inline
  def TristateFalse: `0` = this.cast(0)
  @scala.inline
  def TristateMixed: `-2` = this.cast(-2)
  @scala.inline
  def TristateTrue: `-1` = this.cast(-1)
  @scala.inline
  def TristateUseDefault: `-2` = this.cast(-2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

