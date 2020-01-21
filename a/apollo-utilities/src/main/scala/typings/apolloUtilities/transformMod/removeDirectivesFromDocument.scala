package typings.apolloUtilities.transformMod

import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-utilities/lib/transform", "removeDirectivesFromDocument")
@js.native
object removeDirectivesFromDocument extends js.Object {
  def apply(directives: js.Array[RemoveDirectiveConfig], doc: DocumentNode): DocumentNode | Null = js.native
}

