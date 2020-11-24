package typings.alex.mod

import typings.vfile.mod.VFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("alex", "html")
@js.native
object html extends js.Object {
  
  def apply(value: String): VFile = js.native
  def apply(value: String, config: Config): VFile = js.native
  /** Check HTML (ignoring syntax). */
  def apply(value: VFile): VFile = js.native
  def apply(value: VFile, config: Config): VFile = js.native
}
