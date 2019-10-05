package typings.apolloDashServer.distExportsMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.typeDefinitionMod.GraphQLFieldResolver
import typings.graphqlDashTools.distInterfacesMod.ILogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "decorateWithLogger")
@js.native
object decorateWithLogger extends js.Object {
  def apply(fn: js.UndefOr[scala.Nothing], logger: ILogger, hint: String): GraphQLFieldResolver[_, _, StringDictionary[_]] = js.native
  def apply(fn: GraphQLFieldResolver[_, _, StringDictionary[_]], logger: ILogger, hint: String): GraphQLFieldResolver[_, _, StringDictionary[_]] = js.native
}

