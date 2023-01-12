package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportFailureListItem extends StObject {
  
  /**
    *  Provides the reason the import failed. 
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
  
  /**
    *  The type of import error. 
    */
  var ErrorType: js.UndefOr[String] = js.undefined
  
  /**
    *  When the import was last updated. 
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The location of the failure in the S3 bucket. 
    */
  var Location: js.UndefOr[String] = js.undefined
  
  /**
    *  The status of the import. 
    */
  var Status: js.UndefOr[ImportFailureStatus] = js.undefined
}
object ImportFailureListItem {
  
  inline def apply(): ImportFailureListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportFailureListItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportFailureListItem] (val x: Self) extends AnyVal {
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setErrorType(value: String): Self = StObject.set(x, "ErrorType", value.asInstanceOf[js.Any])
    
    inline def setErrorTypeUndefined: Self = StObject.set(x, "ErrorType", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
    
    inline def setStatus(value: ImportFailureStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
