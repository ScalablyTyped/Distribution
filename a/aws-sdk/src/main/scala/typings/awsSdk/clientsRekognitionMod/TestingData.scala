package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestingData extends StObject {
  
  /**
    * The assets used for testing.
    */
  var Assets: js.UndefOr[typings.awsSdk.clientsRekognitionMod.Assets] = js.undefined
  
  /**
    * If specified, Amazon Rekognition Custom Labels temporarily splits the training dataset (80%) to create a test dataset (20%) for the training job. After training completes, the test dataset is not stored and the training dataset reverts to its previous size.
    */
  var AutoCreate: js.UndefOr[Boolean] = js.undefined
}
object TestingData {
  
  inline def apply(): TestingData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestingData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestingData] (val x: Self) extends AnyVal {
    
    inline def setAssets(value: Assets): Self = StObject.set(x, "Assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsUndefined: Self = StObject.set(x, "Assets", js.undefined)
    
    inline def setAssetsVarargs(value: Asset*): Self = StObject.set(x, "Assets", js.Array(value*))
    
    inline def setAutoCreate(value: Boolean): Self = StObject.set(x, "AutoCreate", value.asInstanceOf[js.Any])
    
    inline def setAutoCreateUndefined: Self = StObject.set(x, "AutoCreate", js.undefined)
  }
}
