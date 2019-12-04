package typings.atAngularCore.schematicsMigrationsStaticDashQueriesAngularQueryDashDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QueryTiming extends js.Object

@JSImport("@angular/core/schematics/migrations/static-queries/angular/query-definition", "QueryTiming")
@js.native
object QueryTiming extends js.Object {
  @js.native
  sealed trait DYNAMIC extends QueryTiming
  
  @js.native
  sealed trait STATIC extends QueryTiming
  
  /* 1 */ val DYNAMIC: typings.atAngularCore.schematicsMigrationsStaticDashQueriesAngularQueryDashDefinitionMod.QueryTiming.DYNAMIC with Double = js.native
  /* 0 */ val STATIC: typings.atAngularCore.schematicsMigrationsStaticDashQueriesAngularQueryDashDefinitionMod.QueryTiming.STATIC with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueryTiming with Double] = js.native
}

