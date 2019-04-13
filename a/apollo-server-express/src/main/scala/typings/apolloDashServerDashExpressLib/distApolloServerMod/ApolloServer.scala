package typings
package apolloDashServerDashExpressLib.distApolloServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @JSImport("apollo-server-express/dist/ApolloServer", "ApolloServer")
@js.native
class ApolloServer protected () extends js.Object {
  def this(config: ApolloServerExpressConfig) = this()
  def applyMiddleware(hasAppPathCorsBodyParserConfigDisableHealthCheckOnHealthCheck: ServerRegistration): scala.Unit = js.native
  def createGraphQLServerOptions(req: expressLib.expressMod.Request, res: expressLib.expressMod.Response): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GraphQLOptions */ _
  ] = js.native
  /* protected */ def supportsSubscriptions(): scala.Boolean = js.native
  /* protected */ def supportsUploads(): scala.Boolean = js.native
}

