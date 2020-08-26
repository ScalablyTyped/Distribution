package typings.apolloServerExpress.mod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsDelegate.anon.Field
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "ReplaceFieldWithFragment")
@js.native
class ReplaceFieldWithFragment protected ()
  extends typings.graphqlTools.mod.ReplaceFieldWithFragment {
  def this(targetSchema: GraphQLSchema, fragments: js.Array[Field]) = this()
}

