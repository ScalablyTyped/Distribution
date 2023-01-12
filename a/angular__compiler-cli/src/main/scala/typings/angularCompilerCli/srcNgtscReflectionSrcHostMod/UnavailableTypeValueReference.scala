package typings.angularCompilerCli.srcNgtscReflectionSrcHostMod

import typings.angularCompilerCli.angularCompilerCliInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnavailableTypeValueReference
  extends StObject
     with TypeValueReference {
  
  var kind: `2`
  
  /**
    * The reason why no value reference could be determined for a type.
    */
  var reason: UnavailableValue
}
object UnavailableTypeValueReference {
  
  inline def apply(reason: UnavailableValue): UnavailableTypeValueReference = {
    val __obj = js.Dynamic.literal(kind = 2, reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnavailableTypeValueReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnavailableTypeValueReference] (val x: Self) extends AnyVal {
    
    inline def setKind(value: `2`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setReason(value: UnavailableValue): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
