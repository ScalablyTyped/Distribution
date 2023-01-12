package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetSource extends StObject {
  
  /**
    *  The ARN of an Amazon Rekognition Custom Labels dataset that you want to copy. 
    */
  var DatasetArn: js.UndefOr[typings.awsSdk.clientsRekognitionMod.DatasetArn] = js.undefined
  
  var GroundTruthManifest: js.UndefOr[typings.awsSdk.clientsRekognitionMod.GroundTruthManifest] = js.undefined
}
object DatasetSource {
  
  inline def apply(): DatasetSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatasetSource] (val x: Self) extends AnyVal {
    
    inline def setDatasetArn(value: DatasetArn): Self = StObject.set(x, "DatasetArn", value.asInstanceOf[js.Any])
    
    inline def setDatasetArnUndefined: Self = StObject.set(x, "DatasetArn", js.undefined)
    
    inline def setGroundTruthManifest(value: GroundTruthManifest): Self = StObject.set(x, "GroundTruthManifest", value.asInstanceOf[js.Any])
    
    inline def setGroundTruthManifestUndefined: Self = StObject.set(x, "GroundTruthManifest", js.undefined)
  }
}
