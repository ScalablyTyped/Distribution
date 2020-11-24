package typings.astTypes.buildersMod

import typings.astTypes.anon.TypeParameters
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.namedTypesMod.namedTypes.ClassImplements
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassImplementsBuilder extends js.Object {
  
  def apply(id: IdentifierKind): ClassImplements = js.native
  
  def from(params: TypeParameters): ClassImplements = js.native
}
