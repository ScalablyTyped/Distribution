package typings.angularCore.queryDefinitionMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QueryType extends js.Object

@JSImport("@angular/core/schematics/migrations/static-queries/angular/query-definition", "QueryType")
@js.native
object QueryType extends js.Object {
  @js.native
  sealed trait ContentChild extends QueryType
  
  @js.native
  sealed trait ViewChild extends QueryType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueryType with Double] = js.native
  /* 1 */ @js.native
  object ContentChild extends TopLevel[ContentChild with Double]
  
  /* 0 */ @js.native
  object ViewChild extends TopLevel[ViewChild with Double]
  
}

