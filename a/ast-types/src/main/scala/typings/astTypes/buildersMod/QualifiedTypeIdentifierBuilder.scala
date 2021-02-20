package typings.astTypes.buildersMod

import typings.astTypes.anon.Qualification
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.QualifiedTypeIdentifierKind
import typings.astTypes.namedTypesMod.namedTypes.QualifiedTypeIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QualifiedTypeIdentifierBuilder extends StObject {
  
  def apply(qualification: IdentifierKind, id: IdentifierKind): QualifiedTypeIdentifier = js.native
  def apply(qualification: QualifiedTypeIdentifierKind, id: IdentifierKind): QualifiedTypeIdentifier = js.native
  
  def from(params: Qualification): QualifiedTypeIdentifier = js.native
}
