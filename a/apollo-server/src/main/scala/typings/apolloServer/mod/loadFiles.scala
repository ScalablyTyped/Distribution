package typings.apolloServer.mod

import typings.graphqlToolsLoadFiles.mod.LoadFilesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "loadFiles")
@js.native
object loadFiles extends js.Object {
  def apply(pattern: String): js.Promise[js.Array[_]] = js.native
  def apply(pattern: String, options: LoadFilesOptions): js.Promise[js.Array[_]] = js.native
  def apply(pattern: js.Array[String]): js.Promise[js.Array[_]] = js.native
  def apply(pattern: js.Array[String], options: LoadFilesOptions): js.Promise[js.Array[_]] = js.native
}

