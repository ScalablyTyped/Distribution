package typings.astTypes.buildersMod

import typings.astTypes.anon.Loc
import typings.astTypes.namedTypesMod.namedTypes.Identifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentifierBuilder extends StObject {
  
  def apply(name: String): Identifier = js.native
  
  def from(params: Loc): Identifier = js.native
}
