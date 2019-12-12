package typings.atAngularCore.schematicsMigrationsStaticDashQueriesAngularQueryDashDefinitionMod

import org.scalablytyped.runtime.TopLevel
import typings.atAngularCore.schematicsMigrationsStaticDashQueriesAngularQueryDashDefinitionMod.QueryTiming.DYNAMIC
import typings.atAngularCore.schematicsMigrationsStaticDashQueriesAngularQueryDashDefinitionMod.QueryTiming.STATIC
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueryTiming with Double] = js.native
  /* 1 */ @js.native
  object DYNAMIC extends TopLevel[DYNAMIC with Double]
  
  /* 0 */ @js.native
  object STATIC extends TopLevel[STATIC with Double]
  
}

