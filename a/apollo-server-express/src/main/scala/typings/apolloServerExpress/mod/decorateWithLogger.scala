package typings.apolloServerExpress.mod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.graphqlTools.interfacesMod.ILogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "decorateWithLogger")
@js.native
object decorateWithLogger extends js.Object {
  def apply(fn: js.UndefOr[GraphQLFieldResolver[_, _, StringDictionary[_]]], logger: ILogger, hint: String): GraphQLFieldResolver[_, _, StringDictionary[_]] = js.native
}

