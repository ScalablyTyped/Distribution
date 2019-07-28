package typings.apolloDashServerDashCore

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.graphql.graphqlMod.GraphQLDirective
import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphqlDashTools.Anon_Args
import typings.graphqlDashTools.graphqlDashToolsMod.SchemaDirectiveVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassSchemaDirectiveVisitor extends Instantiable1[/* config */ Anon_Args, SchemaDirectiveVisitor] {
  /* protected */ def getDeclaredDirectives(
    schema: GraphQLSchema,
    directiveVisitors: StringDictionary[typings.graphqlDashTools.TypeofClassSchemaDirectiveVisitor]
  ): StringDictionary[GraphQLDirective] = js.native
  def getDirectiveDeclaration(directiveName: String, schema: GraphQLSchema): GraphQLDirective = js.native
  def visitSchemaDirectives(
    schema: GraphQLSchema,
    directiveVisitors: StringDictionary[typings.graphqlDashTools.TypeofClassSchemaDirectiveVisitor]
  ): StringDictionary[js.Array[typings.graphqlDashTools.distSchemaVisitorMod.SchemaDirectiveVisitor]] = js.native
  def visitSchemaDirectives(
    schema: GraphQLSchema,
    directiveVisitors: StringDictionary[typings.graphqlDashTools.TypeofClassSchemaDirectiveVisitor],
    context: StringDictionary[js.Any]
  ): StringDictionary[js.Array[typings.graphqlDashTools.distSchemaVisitorMod.SchemaDirectiveVisitor]] = js.native
}

