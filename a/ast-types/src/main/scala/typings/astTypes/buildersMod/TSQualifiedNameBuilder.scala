package typings.astTypes.buildersMod

import typings.astTypes.anon.CommentsLeftLoc
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.TSQualifiedNameKind
import typings.astTypes.namedTypesMod.namedTypes.TSQualifiedName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSQualifiedNameBuilder extends StObject {
  
  def apply(left: IdentifierKind, right: IdentifierKind): TSQualifiedName = js.native
  def apply(left: IdentifierKind, right: TSQualifiedNameKind): TSQualifiedName = js.native
  def apply(left: TSQualifiedNameKind, right: IdentifierKind): TSQualifiedName = js.native
  def apply(left: TSQualifiedNameKind, right: TSQualifiedNameKind): TSQualifiedName = js.native
  
  def from(params: CommentsLeftLoc): TSQualifiedName = js.native
}
