package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.TSTypeAnnotationKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSHasOptionalTypeAnnotation extends StObject {
  
  var typeAnnotation: js.UndefOr[TSTypeAnnotationKind | Null] = js.undefined
}
object TSHasOptionalTypeAnnotation {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.TSHasOptionalTypeAnnotation")
  @js.native
  val ^ : Type[TSHasOptionalTypeAnnotation] = js.native
  
  extension [Self <: TSHasOptionalTypeAnnotation](x: Self) {
    
    inline def setTypeAnnotation(value: TSTypeAnnotationKind): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
    
    inline def setTypeAnnotationUndefined: Self = StObject.set(x, "typeAnnotation", js.undefined)
  }
}
