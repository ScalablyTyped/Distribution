package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApplicationsRequestFilters extends StObject {
  
  /**
    * Filter applications list by application ID.
    */
  var applicationIDs: js.UndefOr[ApplicationIDsFilter] = js.undefined
  
  /**
    * Filter applications list by archival status.
    */
  var isArchived: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Filter applications list by wave ID.
    */
  var waveIDs: js.UndefOr[WaveIDsFilter] = js.undefined
}
object ListApplicationsRequestFilters {
  
  inline def apply(): ListApplicationsRequestFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationsRequestFilters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListApplicationsRequestFilters] (val x: Self) extends AnyVal {
    
    inline def setApplicationIDs(value: ApplicationIDsFilter): Self = StObject.set(x, "applicationIDs", value.asInstanceOf[js.Any])
    
    inline def setApplicationIDsUndefined: Self = StObject.set(x, "applicationIDs", js.undefined)
    
    inline def setApplicationIDsVarargs(value: ApplicationID*): Self = StObject.set(x, "applicationIDs", js.Array(value*))
    
    inline def setIsArchived(value: Boolean): Self = StObject.set(x, "isArchived", value.asInstanceOf[js.Any])
    
    inline def setIsArchivedUndefined: Self = StObject.set(x, "isArchived", js.undefined)
    
    inline def setWaveIDs(value: WaveIDsFilter): Self = StObject.set(x, "waveIDs", value.asInstanceOf[js.Any])
    
    inline def setWaveIDsUndefined: Self = StObject.set(x, "waveIDs", js.undefined)
    
    inline def setWaveIDsVarargs(value: WaveID*): Self = StObject.set(x, "waveIDs", js.Array(value*))
  }
}
