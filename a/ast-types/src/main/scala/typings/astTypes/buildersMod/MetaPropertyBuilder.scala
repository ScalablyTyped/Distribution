package typings.astTypes.buildersMod

import typings.astTypes.anon.Meta
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.namedTypesMod.namedTypes.MetaProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetaPropertyBuilder extends js.Object {
  
  def apply(meta: IdentifierKind, property: IdentifierKind): MetaProperty = js.native
  
  def from(params: Meta): MetaProperty = js.native
}
