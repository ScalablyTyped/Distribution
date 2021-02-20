package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.TSTypeAnnotationKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSHasOptionalTypeAnnotation extends StObject {
  
  var typeAnnotation: js.UndefOr[TSTypeAnnotationKind | Null] = js.native
}
object TSHasOptionalTypeAnnotation {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.TSHasOptionalTypeAnnotation")
  @js.native
  val ^ : Type[TSHasOptionalTypeAnnotation] = js.native
  
  @scala.inline
  implicit class TSHasOptionalTypeAnnotationMutableBuilder[Self <: TSHasOptionalTypeAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTypeAnnotation(value: TSTypeAnnotationKind): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
    
    @scala.inline
    def setTypeAnnotationUndefined: Self = StObject.set(x, "typeAnnotation", js.undefined)
  }
}
