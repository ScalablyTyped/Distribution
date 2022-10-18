package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureParameter extends StObject {
  
  /**
    * A key that must contain a value to describe the feature.
    */
  var Key: js.UndefOr[FeatureParameterKey] = js.undefined
  
  /**
    * The value that belongs to a key.
    */
  var Value: js.UndefOr[FeatureParameterValue] = js.undefined
}
object FeatureParameter {
  
  inline def apply(): FeatureParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureParameter]
  }
  
  extension [Self <: FeatureParameter](x: Self) {
    
    inline def setKey(value: FeatureParameterKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setValue(value: FeatureParameterValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
