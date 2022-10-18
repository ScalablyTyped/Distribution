package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfusionMatrix extends StObject {
  
  /**
    * The number of matches in the data that the transform didn't find, in the confusion matrix for your transform.
    */
  var NumFalseNegatives: js.UndefOr[RecordsCount] = js.undefined
  
  /**
    * The number of nonmatches in the data that the transform incorrectly classified as a match, in the confusion matrix for your transform.
    */
  var NumFalsePositives: js.UndefOr[RecordsCount] = js.undefined
  
  /**
    * The number of nonmatches in the data that the transform correctly rejected, in the confusion matrix for your transform.
    */
  var NumTrueNegatives: js.UndefOr[RecordsCount] = js.undefined
  
  /**
    * The number of matches in the data that the transform correctly found, in the confusion matrix for your transform.
    */
  var NumTruePositives: js.UndefOr[RecordsCount] = js.undefined
}
object ConfusionMatrix {
  
  inline def apply(): ConfusionMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfusionMatrix]
  }
  
  extension [Self <: ConfusionMatrix](x: Self) {
    
    inline def setNumFalseNegatives(value: RecordsCount): Self = StObject.set(x, "NumFalseNegatives", value.asInstanceOf[js.Any])
    
    inline def setNumFalseNegativesUndefined: Self = StObject.set(x, "NumFalseNegatives", js.undefined)
    
    inline def setNumFalsePositives(value: RecordsCount): Self = StObject.set(x, "NumFalsePositives", value.asInstanceOf[js.Any])
    
    inline def setNumFalsePositivesUndefined: Self = StObject.set(x, "NumFalsePositives", js.undefined)
    
    inline def setNumTrueNegatives(value: RecordsCount): Self = StObject.set(x, "NumTrueNegatives", value.asInstanceOf[js.Any])
    
    inline def setNumTrueNegativesUndefined: Self = StObject.set(x, "NumTrueNegatives", js.undefined)
    
    inline def setNumTruePositives(value: RecordsCount): Self = StObject.set(x, "NumTruePositives", value.asInstanceOf[js.Any])
    
    inline def setNumTruePositivesUndefined: Self = StObject.set(x, "NumTruePositives", js.undefined)
  }
}
