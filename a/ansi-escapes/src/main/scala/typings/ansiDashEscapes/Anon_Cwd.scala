package typings.ansiDashEscapes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cwd extends js.Object {
  /**
  		[Inform iTerm2](https://www.iterm2.com/documentation-escape-codes.html) of the current directory to help semantic history and enable [Cmd-clicking relative paths](https://coderwall.com/p/b7e82q/quickly-open-files-in-iterm-with-cmd-click).
  		@param cwd - Current directory. Default: `process.cwd()`.
  		*/
  def setCwd(cwd: String): String
}

object Anon_Cwd {
  @scala.inline
  def apply(setCwd: String => String): Anon_Cwd = {
    val __obj = js.Dynamic.literal(setCwd = js.Any.fromFunction1(setCwd))
  
    __obj.asInstanceOf[Anon_Cwd]
  }
}

