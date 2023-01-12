package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameterResult extends StObject {
  
  /**
    * Information about a parameter.
    */
  var Parameter: js.UndefOr[typings.awsSdk.clientsSsmMod.Parameter] = js.undefined
}
object GetParameterResult {
  
  inline def apply(): GetParameterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetParameterResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameterResult] (val x: Self) extends AnyVal {
    
    inline def setParameter(value: Parameter): Self = StObject.set(x, "Parameter", value.asInstanceOf[js.Any])
    
    inline def setParameterUndefined: Self = StObject.set(x, "Parameter", js.undefined)
  }
}
