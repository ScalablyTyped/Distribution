package typings.apolloServer.exportsMod

import typings.graphql.mod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "slicedError")
@js.native
object slicedError extends js.Object {
  def apply(originalError: GraphQLError): GraphQLError = js.native
}

