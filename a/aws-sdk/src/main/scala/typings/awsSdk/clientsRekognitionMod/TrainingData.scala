package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrainingData extends StObject {
  
  /**
    * A Sagemaker GroundTruth manifest file that contains the training images (assets).
    */
  var Assets: js.UndefOr[typings.awsSdk.clientsRekognitionMod.Assets] = js.undefined
}
object TrainingData {
  
  inline def apply(): TrainingData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrainingData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrainingData] (val x: Self) extends AnyVal {
    
    inline def setAssets(value: Assets): Self = StObject.set(x, "Assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsUndefined: Self = StObject.set(x, "Assets", js.undefined)
    
    inline def setAssetsVarargs(value: Asset*): Self = StObject.set(x, "Assets", js.Array(value*))
  }
}
