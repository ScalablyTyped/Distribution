package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceCountsSummary extends StObject {
  
  /**
    * The number of resources of this type in the Amazon Web Services account that need a major template version update.
    */
  var behindMajor: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of resources of this type in the Amazon Web Services account that need a minor template version update.
    */
  var behindMinor: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of resources of this type in the Amazon Web Services account that failed to deploy.
    */
  var failed: js.UndefOr[Integer] = js.undefined
  
  /**
    * The total number of resources of this type in the Amazon Web Services account.
    */
  var total: Integer
  
  /**
    * The number of resources of this type in the Amazon Web Services account that are up-to-date with their template.
    */
  var upToDate: js.UndefOr[Integer] = js.undefined
}
object ResourceCountsSummary {
  
  inline def apply(total: Integer): ResourceCountsSummary = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceCountsSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceCountsSummary] (val x: Self) extends AnyVal {
    
    inline def setBehindMajor(value: Integer): Self = StObject.set(x, "behindMajor", value.asInstanceOf[js.Any])
    
    inline def setBehindMajorUndefined: Self = StObject.set(x, "behindMajor", js.undefined)
    
    inline def setBehindMinor(value: Integer): Self = StObject.set(x, "behindMinor", value.asInstanceOf[js.Any])
    
    inline def setBehindMinorUndefined: Self = StObject.set(x, "behindMinor", js.undefined)
    
    inline def setFailed(value: Integer): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setFailedUndefined: Self = StObject.set(x, "failed", js.undefined)
    
    inline def setTotal(value: Integer): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setUpToDate(value: Integer): Self = StObject.set(x, "upToDate", value.asInstanceOf[js.Any])
    
    inline def setUpToDateUndefined: Self = StObject.set(x, "upToDate", js.undefined)
  }
}
