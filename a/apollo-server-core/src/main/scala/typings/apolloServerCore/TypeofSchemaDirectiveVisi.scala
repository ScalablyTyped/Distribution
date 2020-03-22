package typings.apolloServerCore

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.graphql.mod.GraphQLDirective
import typings.graphql.mod.GraphQLSchema
import typings.graphqlTools.AnonArgs
import typings.graphqlTools.mod.SchemaDirectiveVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofSchemaDirectiveVisi extends Instantiable1[/* config */ AnonArgs, SchemaDirectiveVisitor] {
  /* protected */ def getDeclaredDirectives(
    schema: GraphQLSchema,
    directiveVisitors: StringDictionary[typings.graphqlTools.TypeofSchemaDirectiveVisi]
  ): StringDictionary[GraphQLDirective] = js.native
  def getDirectiveDeclaration(directiveName: String, schema: GraphQLSchema): GraphQLDirective = js.native
  def visitSchemaDirectives(
    schema: GraphQLSchema,
    directiveVisitors: StringDictionary[typings.graphqlTools.TypeofSchemaDirectiveVisi]
  ): StringDictionary[js.Array[typings.graphqlTools.schemaVisitorMod.SchemaDirectiveVisitor]] = js.native
  def visitSchemaDirectives(
    schema: GraphQLSchema,
    directiveVisitors: StringDictionary[typings.graphqlTools.TypeofSchemaDirectiveVisi],
    context: StringDictionary[js.Any]
  ): StringDictionary[js.Array[typings.graphqlTools.schemaVisitorMod.SchemaDirectiveVisitor]] = js.native
}

