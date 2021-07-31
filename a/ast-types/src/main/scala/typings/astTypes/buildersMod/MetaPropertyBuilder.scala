package typings.astTypes.buildersMod

import typings.astTypes.anon.Meta
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.namedTypesMod.namedTypes.MetaProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetaPropertyBuilder extends StObject {
  
  def apply(meta: IdentifierKind, property: IdentifierKind): MetaProperty = js.native
  
  def from(params: Meta): MetaProperty = js.native
}
