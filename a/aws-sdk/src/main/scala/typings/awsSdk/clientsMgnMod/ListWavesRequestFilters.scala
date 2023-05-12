package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWavesRequestFilters extends StObject {
  
  /**
    * Filter waves list by archival status.
    */
  var isArchived: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Filter waves list by wave ID.
    */
  var waveIDs: js.UndefOr[WaveIDsFilter] = js.undefined
}
object ListWavesRequestFilters {
  
  inline def apply(): ListWavesRequestFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWavesRequestFilters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListWavesRequestFilters] (val x: Self) extends AnyVal {
    
    inline def setIsArchived(value: Boolean): Self = StObject.set(x, "isArchived", value.asInstanceOf[js.Any])
    
    inline def setIsArchivedUndefined: Self = StObject.set(x, "isArchived", js.undefined)
    
    inline def setWaveIDs(value: WaveIDsFilter): Self = StObject.set(x, "waveIDs", value.asInstanceOf[js.Any])
    
    inline def setWaveIDsUndefined: Self = StObject.set(x, "waveIDs", js.undefined)
    
    inline def setWaveIDsVarargs(value: WaveID*): Self = StObject.set(x, "waveIDs", js.Array(value*))
  }
}
