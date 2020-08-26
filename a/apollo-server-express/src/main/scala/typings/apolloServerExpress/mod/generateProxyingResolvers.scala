package typings.apolloServerExpress.mod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsDelegate.typesMod.SubschemaConfig
import typings.graphqlToolsUtils.interfacesMod.Transform
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "generateProxyingResolvers")
@js.native
object generateProxyingResolvers extends js.Object {
  def apply(subschemaOrSubschemaConfig: GraphQLSchema, transforms: js.Array[Transform[Record[String, _]]]): Record[String, Record[String, GraphQLFieldResolver[_, _, StringDictionary[_]]]] = js.native
  def apply(subschemaOrSubschemaConfig: SubschemaConfig, transforms: js.Array[Transform[Record[String, _]]]): Record[String, Record[String, GraphQLFieldResolver[_, _, StringDictionary[_]]]] = js.native
}

