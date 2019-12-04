package typings.atAngularCore.schematicsMigrationsStaticDashQueriesAngularQueryDashDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QueryType extends js.Object

@JSImport("@angular/core/schematics/migrations/static-queries/angular/query-definition", "QueryType")
@js.native
object QueryType extends js.Object {
  @js.native
  sealed trait ContentChild extends QueryType
  
  @js.native
  sealed trait ViewChild extends QueryType
  
  /* 1 */ val ContentChild: typings.atAngularCore.schematicsMigrationsStaticDashQueriesAngularQueryDashDefinitionMod.QueryType.ContentChild with Double = js.native
  /* 0 */ val ViewChild: typings.atAngularCore.schematicsMigrationsStaticDashQueriesAngularQueryDashDefinitionMod.QueryType.ViewChild with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueryType with Double] = js.native
}

