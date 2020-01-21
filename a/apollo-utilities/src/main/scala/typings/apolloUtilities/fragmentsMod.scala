package typings.apolloUtilities

import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-utilities/lib/fragments", JSImport.Namespace)
@js.native
object fragmentsMod extends js.Object {
  def getFragmentQueryDocument(document: DocumentNode): DocumentNode = js.native
  def getFragmentQueryDocument(document: DocumentNode, fragmentName: String): DocumentNode = js.native
}

