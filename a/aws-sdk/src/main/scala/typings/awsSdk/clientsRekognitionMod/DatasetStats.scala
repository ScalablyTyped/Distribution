package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetStats extends StObject {
  
  /**
    *  The total number of entries that contain at least one error. 
    */
  var ErrorEntries: js.UndefOr[UInteger] = js.undefined
  
  /**
    *  The total number of images in the dataset that have labels. 
    */
  var LabeledEntries: js.UndefOr[UInteger] = js.undefined
  
  /**
    *  The total number of images in the dataset. 
    */
  var TotalEntries: js.UndefOr[UInteger] = js.undefined
  
  /**
    *  The total number of labels declared in the dataset. 
    */
  var TotalLabels: js.UndefOr[UInteger] = js.undefined
}
object DatasetStats {
  
  inline def apply(): DatasetStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetStats]
  }
  
  extension [Self <: DatasetStats](x: Self) {
    
    inline def setErrorEntries(value: UInteger): Self = StObject.set(x, "ErrorEntries", value.asInstanceOf[js.Any])
    
    inline def setErrorEntriesUndefined: Self = StObject.set(x, "ErrorEntries", js.undefined)
    
    inline def setLabeledEntries(value: UInteger): Self = StObject.set(x, "LabeledEntries", value.asInstanceOf[js.Any])
    
    inline def setLabeledEntriesUndefined: Self = StObject.set(x, "LabeledEntries", js.undefined)
    
    inline def setTotalEntries(value: UInteger): Self = StObject.set(x, "TotalEntries", value.asInstanceOf[js.Any])
    
    inline def setTotalEntriesUndefined: Self = StObject.set(x, "TotalEntries", js.undefined)
    
    inline def setTotalLabels(value: UInteger): Self = StObject.set(x, "TotalLabels", value.asInstanceOf[js.Any])
    
    inline def setTotalLabelsUndefined: Self = StObject.set(x, "TotalLabels", js.undefined)
  }
}
