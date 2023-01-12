package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationData extends StObject {
  
  /**
    * The assets that comprise the validation data. 
    */
  var Assets: js.UndefOr[typings.awsSdk.clientsRekognitionMod.Assets] = js.undefined
}
object ValidationData {
  
  inline def apply(): ValidationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidationData] (val x: Self) extends AnyVal {
    
    inline def setAssets(value: Assets): Self = StObject.set(x, "Assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsUndefined: Self = StObject.set(x, "Assets", js.undefined)
    
    inline def setAssetsVarargs(value: Asset*): Self = StObject.set(x, "Assets", js.Array(value*))
  }
}
