package typings.apolloDashServerDashCore

import typings.apolloDashServerDashCore.graphqlDashUploadMod.ApolloUploadOptions
import typings.apolloDashServerDashCore.graphqlDashUploadMod.Request
import typings.apolloDashServerDashCore.graphqlDashUploadMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-core/dist/processFileUploads", JSImport.Namespace)
@js.native
object distProcessFileUploadsMod extends js.Object {
  val default: js.UndefOr[
    js.Function3[
      /* request */ Request, 
      /* response */ Response, 
      /* options */ js.UndefOr[ApolloUploadOptions], 
      js.Promise[js.Any]
    ]
  ] = js.native
}

