package typings.apolloServerCore

import typings.graphqlUpload.mod.GraphQLOperation
import typings.graphqlUpload.mod.UploadOptions
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnRequest extends js.Object {
  def apply(request: IncomingMessage, response: ServerResponse): js.Promise[GraphQLOperation | js.Array[GraphQLOperation]] = js.native
  def apply(request: IncomingMessage, response: ServerResponse, uploadOptions: UploadOptions): js.Promise[GraphQLOperation | js.Array[GraphQLOperation]] = js.native
}

