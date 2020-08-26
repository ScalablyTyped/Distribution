package typings.apolloServer.mod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.graphqlToolsDelegate.typesMod.Executor
import typings.graphqlToolsDelegate.typesMod.Subscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "defaultCreateRemoteResolver")
@js.native
object defaultCreateRemoteResolver extends js.Object {
  def apply(executor: Executor, subscriber: Subscriber): GraphQLFieldResolver[_, _, StringDictionary[_]] = js.native
}

