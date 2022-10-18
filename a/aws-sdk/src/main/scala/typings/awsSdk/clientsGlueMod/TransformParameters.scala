package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformParameters extends StObject {
  
  /**
    * The parameters for the find matches algorithm.
    */
  var FindMatchesParameters: js.UndefOr[typings.awsSdk.clientsGlueMod.FindMatchesParameters] = js.undefined
  
  /**
    * The type of machine learning transform. For information about the types of machine learning transforms, see Creating Machine Learning Transforms.
    */
  var TransformType: typings.awsSdk.clientsGlueMod.TransformType
}
object TransformParameters {
  
  inline def apply(TransformType: TransformType): TransformParameters = {
    val __obj = js.Dynamic.literal(TransformType = TransformType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformParameters]
  }
  
  extension [Self <: TransformParameters](x: Self) {
    
    inline def setFindMatchesParameters(value: FindMatchesParameters): Self = StObject.set(x, "FindMatchesParameters", value.asInstanceOf[js.Any])
    
    inline def setFindMatchesParametersUndefined: Self = StObject.set(x, "FindMatchesParameters", js.undefined)
    
    inline def setTransformType(value: TransformType): Self = StObject.set(x, "TransformType", value.asInstanceOf[js.Any])
  }
}
