package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalReferenceResolver extends StObject {
  
  def resolveExternalReference(ref: ExternalReference): Any
}
object ExternalReferenceResolver {
  
  inline def apply(resolveExternalReference: ExternalReference => Any): ExternalReferenceResolver = {
    val __obj = js.Dynamic.literal(resolveExternalReference = js.Any.fromFunction1(resolveExternalReference))
    __obj.asInstanceOf[ExternalReferenceResolver]
  }
  
  extension [Self <: ExternalReferenceResolver](x: Self) {
    
    inline def setResolveExternalReference(value: ExternalReference => Any): Self = StObject.set(x, "resolveExternalReference", js.Any.fromFunction1(value))
  }
}
