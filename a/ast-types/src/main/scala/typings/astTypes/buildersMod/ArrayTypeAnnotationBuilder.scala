package typings.astTypes.buildersMod

import typings.astTypes.anon.ElementType
import typings.astTypes.kindsMod.FlowTypeKind
import typings.astTypes.namedTypesMod.namedTypes.ArrayTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayTypeAnnotationBuilder extends StObject {
  
  def apply(elementType: FlowTypeKind): ArrayTypeAnnotation = js.native
  
  def from(params: ElementType): ArrayTypeAnnotation = js.native
}
