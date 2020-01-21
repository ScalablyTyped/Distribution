package typings.apolloServerExpress.mod

import typings.apolloServerExpress.apolloServerMod.ApolloServerExpressConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "ApolloServer")
@js.native
class ApolloServer protected ()
  extends typings.apolloServerExpress.apolloServerMod.ApolloServer {
  def this(config: ApolloServerExpressConfig) = this()
}

