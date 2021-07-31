package typings.astTypes.buildersMod

import typings.astTypes.anon.CommentsExtends
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.InterfaceExtendsKind
import typings.astTypes.kindsMod.ObjectTypeAnnotationKind
import typings.astTypes.namedTypesMod.namedTypes.DeclareInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeclareInterfaceBuilder extends StObject {
  
  def apply(id: IdentifierKind, body: ObjectTypeAnnotationKind, extendsParam: js.Array[InterfaceExtendsKind]): DeclareInterface = js.native
  
  def from(params: CommentsExtends): DeclareInterface = js.native
}
