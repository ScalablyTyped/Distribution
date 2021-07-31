package typings.astTypes.buildersMod

import typings.astTypes.anon.Variance
import typings.astTypes.kindsMod.FlowTypeKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.LiteralKind
import typings.astTypes.namedTypesMod.namedTypes.ObjectTypeProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectTypePropertyBuilder extends StObject {
  
  def apply(key: IdentifierKind, value: FlowTypeKind, optional: Boolean): ObjectTypeProperty = js.native
  def apply(key: LiteralKind, value: FlowTypeKind, optional: Boolean): ObjectTypeProperty = js.native
  
  def from(params: Variance): ObjectTypeProperty = js.native
}
