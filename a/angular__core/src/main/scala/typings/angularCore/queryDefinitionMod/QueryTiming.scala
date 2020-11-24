package typings.angularCore.queryDefinitionMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QueryTiming extends js.Object
@JSImport("@angular/core/schematics/migrations/static-queries/angular/query-definition", "QueryTiming")
@js.native
object QueryTiming extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueryTiming with Double] = js.native
  
  @js.native
  sealed trait DYNAMIC extends QueryTiming
  /* 1 */ @js.native
  object DYNAMIC extends TopLevel[DYNAMIC with Double]
  
  @js.native
  sealed trait STATIC extends QueryTiming
  /* 0 */ @js.native
  object STATIC extends TopLevel[STATIC with Double]
}
