package typings.alex.mod

import typings.vfile.mod.VFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("alex", "mdx")
@js.native
object mdx extends js.Object {
  
  def apply(value: String): VFile = js.native
  def apply(value: String, config: Config): VFile = js.native
  /**
    * Check [MDX][] (ignoring syntax).
    *
    * Note: the syntax for [MDX@2][mdx-next], while currently in beta, is used in
    * alex
    */
  def apply(value: VFile): VFile = js.native
  def apply(value: VFile, config: Config): VFile = js.native
}
