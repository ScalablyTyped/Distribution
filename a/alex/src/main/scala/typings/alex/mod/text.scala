package typings.alex.mod

import typings.vfile.mod.VFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("alex", "text")
@js.native
object text extends js.Object {
  
  def apply(value: String): VFile = js.native
  def apply(value: String, config: Config): VFile = js.native
  /** Check plain text (as in, syntax is checked). */
  def apply(value: VFile): VFile = js.native
  def apply(value: VFile, config: Config): VFile = js.native
}
