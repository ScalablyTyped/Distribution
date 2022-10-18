package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSetUsageConfiguration extends StObject {
  
  /**
    * An option that controls whether a child dataset of a direct query can use this dataset as a source.
    */
  var DisableUseAsDirectQuerySource: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An option that controls whether a child dataset that's stored in QuickSight can use this dataset as a source.
    */
  var DisableUseAsImportedSource: js.UndefOr[Boolean] = js.undefined
}
object DataSetUsageConfiguration {
  
  inline def apply(): DataSetUsageConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSetUsageConfiguration]
  }
  
  extension [Self <: DataSetUsageConfiguration](x: Self) {
    
    inline def setDisableUseAsDirectQuerySource(value: Boolean): Self = StObject.set(x, "DisableUseAsDirectQuerySource", value.asInstanceOf[js.Any])
    
    inline def setDisableUseAsDirectQuerySourceUndefined: Self = StObject.set(x, "DisableUseAsDirectQuerySource", js.undefined)
    
    inline def setDisableUseAsImportedSource(value: Boolean): Self = StObject.set(x, "DisableUseAsImportedSource", value.asInstanceOf[js.Any])
    
    inline def setDisableUseAsImportedSourceUndefined: Self = StObject.set(x, "DisableUseAsImportedSource", js.undefined)
  }
}
