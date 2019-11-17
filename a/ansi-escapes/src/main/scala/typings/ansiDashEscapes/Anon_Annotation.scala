package typings.ansiDashEscapes

import typings.ansiDashEscapes.ansiDashEscapesMod.AnnotationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Annotation extends js.Object {
  /**
  		An annotation looks like this when shown:
  		![screenshot of iTerm annotation](https://user-images.githubusercontent.com/924465/64382136-b60ac700-cfe9-11e9-8a35-9682e8dc4b72.png)
  		See the [iTerm Proprietary Escape Codes documentation](https://iterm2.com/documentation-escape-codes.html) for more information.
  		@param message - The message to display within the annotation. The `|` character is disallowed and will be stripped.
  		@returns An escape code which will create an annotation when printed in iTerm2.
  		*/
  def annotation(message: String): String = js.native
  def annotation(message: String, options: AnnotationOptions): String = js.native
  /**
  		[Inform iTerm2](https://www.iterm2.com/documentation-escape-codes.html) of the current directory to help semantic history and enable [Cmd-clicking relative paths](https://coderwall.com/p/b7e82q/quickly-open-files-in-iterm-with-cmd-click).
  		@param cwd - Current directory. Default: `process.cwd()`.
  		*/
  def setCwd(cwd: String): String = js.native
}

