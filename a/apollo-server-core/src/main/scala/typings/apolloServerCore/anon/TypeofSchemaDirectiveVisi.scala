package typings.apolloServerCore.anon

import org.scalablytyped.runtime.Instantiable1
import typings.graphql.mod.GraphQLDirective
import typings.graphql.mod.GraphQLSchema
import typings.graphqlTools.mod.SchemaDirectiveVisitor
import typings.graphqlToolsUtils.anon.Args
import typings.graphqlToolsUtils.schemaDirectiveVisitorMod.SchemaDirectiveVisitorClass
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofSchemaDirectiveVisi
  extends Instantiable1[
      /* config */ Args[
        /* import warning: RewrittenClass.unapply cls was tparam TArgs */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam TContext */ js.Any
      ], 
      SchemaDirectiveVisitor[js.Object, js.Object]
    ] {
  /* protected */ def getDeclaredDirectives(schema: GraphQLSchema, directiveVisitors: Record[String, SchemaDirectiveVisitorClass]): Record[String, GraphQLDirective] = js.native
  def getDirectiveDeclaration(directiveName: String, schema: GraphQLSchema): js.UndefOr[GraphQLDirective | Null] = js.native
  def visitSchemaDirectives(schema: GraphQLSchema, directiveVisitors: Record[String, SchemaDirectiveVisitorClass]): Record[
    String, 
    js.Array[typings.graphqlToolsUtils.schemaDirectiveVisitorMod.SchemaDirectiveVisitor[_, _]]
  ] = js.native
  def visitSchemaDirectives(
    schema: GraphQLSchema,
    directiveVisitors: Record[String, SchemaDirectiveVisitorClass],
    context: Record[String, _]
  ): Record[
    String, 
    js.Array[typings.graphqlToolsUtils.schemaDirectiveVisitorMod.SchemaDirectiveVisitor[_, _]]
  ] = js.native
}

