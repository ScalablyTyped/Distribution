package typings.apolloCache

import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-cache/lib/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  val justTypenameQuery: DocumentNode = js.native
  def fragmentFromPojo(obj: js.Any): DocumentNode = js.native
  def fragmentFromPojo(obj: js.Any, typename: String): DocumentNode = js.native
  def queryFromPojo(obj: js.Any): DocumentNode = js.native
}

