package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedTargets extends StObject {
  
  /**
    * A list of parameter values sent to targets that resolved during the Automation execution.
    */
  var ParameterValues: js.UndefOr[TargetParameterList] = js.undefined
  
  /**
    * A boolean value indicating whether the resolved target list is truncated.
    */
  var Truncated: js.UndefOr[Boolean] = js.undefined
}
object ResolvedTargets {
  
  inline def apply(): ResolvedTargets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolvedTargets]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolvedTargets] (val x: Self) extends AnyVal {
    
    inline def setParameterValues(value: TargetParameterList): Self = StObject.set(x, "ParameterValues", value.asInstanceOf[js.Any])
    
    inline def setParameterValuesUndefined: Self = StObject.set(x, "ParameterValues", js.undefined)
    
    inline def setParameterValuesVarargs(value: ParameterValue*): Self = StObject.set(x, "ParameterValues", js.Array(value*))
    
    inline def setTruncated(value: Boolean): Self = StObject.set(x, "Truncated", value.asInstanceOf[js.Any])
    
    inline def setTruncatedUndefined: Self = StObject.set(x, "Truncated", js.undefined)
  }
}
