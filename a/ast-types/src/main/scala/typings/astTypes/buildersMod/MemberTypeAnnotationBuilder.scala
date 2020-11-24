package typings.astTypes.buildersMod

import typings.astTypes.anon.LocObject
import typings.astTypes.kindsMod.GenericTypeAnnotationKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.MemberTypeAnnotationKind
import typings.astTypes.namedTypesMod.namedTypes.MemberTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemberTypeAnnotationBuilder extends js.Object {
  
  def apply(`object`: IdentifierKind, property: GenericTypeAnnotationKind): MemberTypeAnnotation = js.native
  def apply(`object`: IdentifierKind, property: MemberTypeAnnotationKind): MemberTypeAnnotation = js.native
  
  def from(params: LocObject): MemberTypeAnnotation = js.native
}
