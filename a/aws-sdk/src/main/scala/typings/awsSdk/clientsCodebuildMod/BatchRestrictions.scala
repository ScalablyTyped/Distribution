package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchRestrictions extends StObject {
  
  /**
    * An array of strings that specify the compute types that are allowed for the batch build. See Build environment compute types in the CodeBuild User Guide for these values. 
    */
  var computeTypesAllowed: js.UndefOr[ComputeTypesAllowed] = js.undefined
  
  /**
    * Specifies the maximum number of builds allowed.
    */
  var maximumBuildsAllowed: js.UndefOr[WrapperInt] = js.undefined
}
object BatchRestrictions {
  
  inline def apply(): BatchRestrictions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchRestrictions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchRestrictions] (val x: Self) extends AnyVal {
    
    inline def setComputeTypesAllowed(value: ComputeTypesAllowed): Self = StObject.set(x, "computeTypesAllowed", value.asInstanceOf[js.Any])
    
    inline def setComputeTypesAllowedUndefined: Self = StObject.set(x, "computeTypesAllowed", js.undefined)
    
    inline def setComputeTypesAllowedVarargs(value: NonEmptyString*): Self = StObject.set(x, "computeTypesAllowed", js.Array(value*))
    
    inline def setMaximumBuildsAllowed(value: WrapperInt): Self = StObject.set(x, "maximumBuildsAllowed", value.asInstanceOf[js.Any])
    
    inline def setMaximumBuildsAllowedUndefined: Self = StObject.set(x, "maximumBuildsAllowed", js.undefined)
  }
}
