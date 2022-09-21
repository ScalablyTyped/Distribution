package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayPropertiesSummary extends StObject {
  
  /**
    * The job index within the array that's associated with this job. This parameter is returned for children of array jobs.
    */
  var index: js.UndefOr[Integer] = js.undefined
  
  /**
    * The size of the array job. This parameter is returned for parent array jobs.
    */
  var size: js.UndefOr[Integer] = js.undefined
}
object ArrayPropertiesSummary {
  
  inline def apply(): ArrayPropertiesSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayPropertiesSummary]
  }
  
  extension [Self <: ArrayPropertiesSummary](x: Self) {
    
    inline def setIndex(value: Integer): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setSize(value: Integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
