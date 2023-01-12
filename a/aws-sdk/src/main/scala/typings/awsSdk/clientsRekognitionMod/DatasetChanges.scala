package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetChanges extends StObject {
  
  /**
    * A Base64-encoded binary data object containing one or JSON lines that either update the dataset or are additions to the dataset. You change a dataset by calling UpdateDatasetEntries. If you are using an AWS SDK to call UpdateDatasetEntries, you don't need to encode Changes as the SDK encodes the data for you.  For example JSON lines, see Image-Level labels in manifest files and and Object localization in manifest files in the Amazon Rekognition Custom Labels Developer Guide. 
    */
  var GroundTruth: GroundTruthBlob
}
object DatasetChanges {
  
  inline def apply(GroundTruth: GroundTruthBlob): DatasetChanges = {
    val __obj = js.Dynamic.literal(GroundTruth = GroundTruth.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetChanges]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatasetChanges] (val x: Self) extends AnyVal {
    
    inline def setGroundTruth(value: GroundTruthBlob): Self = StObject.set(x, "GroundTruth", value.asInstanceOf[js.Any])
  }
}
