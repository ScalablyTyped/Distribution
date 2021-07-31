package typings.astTypes.buildersMod

import typings.astTypes.anon.IdKey
import typings.astTypes.kindsMod.FlowTypeKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.namedTypesMod.namedTypes.ObjectTypeIndexer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectTypeIndexerBuilder extends StObject {
  
  def apply(id: IdentifierKind, key: FlowTypeKind, value: FlowTypeKind): ObjectTypeIndexer = js.native
  
  def from(params: IdKey): ObjectTypeIndexer = js.native
}
