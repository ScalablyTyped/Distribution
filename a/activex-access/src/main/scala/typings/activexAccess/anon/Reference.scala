package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reference extends StObject {
  
  val Reference: typings.activexAccess.Access.Reference
}
object Reference {
  
  inline def apply(Reference: typings.activexAccess.Access.Reference): Reference = {
    val __obj = js.Dynamic.literal(Reference = Reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reference]
  }
  
  extension [Self <: Reference](x: Self) {
    
    inline def setReference(value: typings.activexAccess.Access.Reference): Self = StObject.set(x, "Reference", value.asInstanceOf[js.Any])
  }
}
