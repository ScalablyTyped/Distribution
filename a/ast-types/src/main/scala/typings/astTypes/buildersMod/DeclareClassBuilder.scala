package typings.astTypes.buildersMod

import typings.astTypes.anon.CommentsExtends
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.namedTypesMod.namedTypes.DeclareClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeclareClassBuilder extends js.Object {
  
  def apply(id: IdentifierKind): DeclareClass = js.native
  
  def from(params: CommentsExtends): DeclareClass = js.native
}
