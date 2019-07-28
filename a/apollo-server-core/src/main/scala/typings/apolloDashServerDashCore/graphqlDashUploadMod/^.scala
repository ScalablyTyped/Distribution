package typings.apolloDashServerDashCore.graphqlDashUploadMod

import typings.graphql.graphqlMod.GraphQLScalarType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-upload", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val GraphQLUpload: GraphQLScalarType = js.native
  def processRequest(request: Request, response: Response): js.Promise[_] = js.native
  def processRequest(request: Request, response: Response, options: ApolloUploadOptions): js.Promise[_] = js.native
}

