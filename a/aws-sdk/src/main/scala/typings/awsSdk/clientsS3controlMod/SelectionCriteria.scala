package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectionCriteria extends StObject {
  
  /**
    * A container for the delimiter of the selection criteria being used.
    */
  var Delimiter: js.UndefOr[StorageLensPrefixLevelDelimiter] = js.undefined
  
  /**
    * The max depth of the selection criteria
    */
  var MaxDepth: js.UndefOr[StorageLensPrefixLevelMaxDepth] = js.undefined
  
  /**
    * The minimum number of storage bytes percentage whose metrics will be selected.  You must choose a value greater than or equal to 1.0. 
    */
  var MinStorageBytesPercentage: js.UndefOr[typings.awsSdk.clientsS3controlMod.MinStorageBytesPercentage] = js.undefined
}
object SelectionCriteria {
  
  inline def apply(): SelectionCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectionCriteria]
  }
  
  extension [Self <: SelectionCriteria](x: Self) {
    
    inline def setDelimiter(value: StorageLensPrefixLevelDelimiter): Self = StObject.set(x, "Delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "Delimiter", js.undefined)
    
    inline def setMaxDepth(value: StorageLensPrefixLevelMaxDepth): Self = StObject.set(x, "MaxDepth", value.asInstanceOf[js.Any])
    
    inline def setMaxDepthUndefined: Self = StObject.set(x, "MaxDepth", js.undefined)
    
    inline def setMinStorageBytesPercentage(value: MinStorageBytesPercentage): Self = StObject.set(x, "MinStorageBytesPercentage", value.asInstanceOf[js.Any])
    
    inline def setMinStorageBytesPercentageUndefined: Self = StObject.set(x, "MinStorageBytesPercentage", js.undefined)
  }
}
