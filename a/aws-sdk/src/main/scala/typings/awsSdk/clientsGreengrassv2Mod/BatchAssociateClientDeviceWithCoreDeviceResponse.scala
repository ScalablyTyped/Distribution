package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchAssociateClientDeviceWithCoreDeviceResponse extends StObject {
  
  /**
    * The list of any errors for the entries in the request. Each error entry contains the name of the IoT thing that failed to associate.
    */
  var errorEntries: js.UndefOr[AssociateClientDeviceWithCoreDeviceErrorList] = js.undefined
}
object BatchAssociateClientDeviceWithCoreDeviceResponse {
  
  inline def apply(): BatchAssociateClientDeviceWithCoreDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchAssociateClientDeviceWithCoreDeviceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchAssociateClientDeviceWithCoreDeviceResponse] (val x: Self) extends AnyVal {
    
    inline def setErrorEntries(value: AssociateClientDeviceWithCoreDeviceErrorList): Self = StObject.set(x, "errorEntries", value.asInstanceOf[js.Any])
    
    inline def setErrorEntriesUndefined: Self = StObject.set(x, "errorEntries", js.undefined)
    
    inline def setErrorEntriesVarargs(value: AssociateClientDeviceWithCoreDeviceErrorEntry*): Self = StObject.set(x, "errorEntries", js.Array(value*))
  }
}
