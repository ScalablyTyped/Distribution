package typings.apolloDashServerDashExpress.apolloDashServerDashExpressMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.graphqlMod.GraphQLDirective
import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphqlDashTools.Anon_Args
import typings.graphqlDashTools.TypeofClassSchemaDirectiveVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "SchemaDirectiveVisitor")
@js.native
class SchemaDirectiveVisitor protected ()
  extends typings.graphqlDashTools.graphqlDashToolsMod.SchemaDirectiveVisitor {
  protected def this(config: Anon_Args) = this()
}

/* static members */
@JSImport("apollo-server-express", "SchemaDirectiveVisitor")
@js.native
object SchemaDirectiveVisitor extends js.Object {
  /* protected */ def getDeclaredDirectives(schema: GraphQLSchema, directiveVisitors: StringDictionary[TypeofClassSchemaDirectiveVisitor]): StringDictionary[GraphQLDirective] = js.native
  def getDirectiveDeclaration(directiveName: String, schema: GraphQLSchema): GraphQLDirective = js.native
  def visitSchemaDirectives(schema: GraphQLSchema, directiveVisitors: StringDictionary[TypeofClassSchemaDirectiveVisitor]): StringDictionary[js.Array[typings.graphqlDashTools.distSchemaVisitorMod.SchemaDirectiveVisitor]] = js.native
  def visitSchemaDirectives(
    schema: GraphQLSchema,
    directiveVisitors: StringDictionary[TypeofClassSchemaDirectiveVisitor],
    context: StringDictionary[js.Any]
  ): StringDictionary[js.Array[typings.graphqlDashTools.distSchemaVisitorMod.SchemaDirectiveVisitor]] = js.native
}

