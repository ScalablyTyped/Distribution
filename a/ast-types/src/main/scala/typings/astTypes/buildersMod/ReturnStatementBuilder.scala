package typings.astTypes.buildersMod

import typings.astTypes.anon.Argument
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.namedTypesMod.namedTypes.ReturnStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnStatementBuilder extends StObject {
  
  def apply(): ReturnStatement = js.native
  def apply(argument: ExpressionKind): ReturnStatement = js.native
  
  def from(params: Argument): ReturnStatement = js.native
}
