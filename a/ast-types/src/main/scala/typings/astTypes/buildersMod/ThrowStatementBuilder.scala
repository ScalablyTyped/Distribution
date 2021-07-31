package typings.astTypes.buildersMod

import typings.astTypes.anon.ArgumentComments
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.namedTypesMod.namedTypes.ThrowStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThrowStatementBuilder extends StObject {
  
  def apply(argument: ExpressionKind): ThrowStatement = js.native
  
  def from(params: ArgumentComments): ThrowStatement = js.native
}
