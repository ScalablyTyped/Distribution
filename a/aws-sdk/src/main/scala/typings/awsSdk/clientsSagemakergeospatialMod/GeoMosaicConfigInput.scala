package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoMosaicConfigInput extends StObject {
  
  /**
    * The name of the algorithm being used for geomosaic.
    */
  var AlgorithmName: js.UndefOr[AlgorithmNameGeoMosaic] = js.undefined
  
  /**
    * The target bands for geomosaic.
    */
  var TargetBands: js.UndefOr[StringListInput] = js.undefined
}
object GeoMosaicConfigInput {
  
  inline def apply(): GeoMosaicConfigInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoMosaicConfigInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeoMosaicConfigInput] (val x: Self) extends AnyVal {
    
    inline def setAlgorithmName(value: AlgorithmNameGeoMosaic): Self = StObject.set(x, "AlgorithmName", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmNameUndefined: Self = StObject.set(x, "AlgorithmName", js.undefined)
    
    inline def setTargetBands(value: StringListInput): Self = StObject.set(x, "TargetBands", value.asInstanceOf[js.Any])
    
    inline def setTargetBandsUndefined: Self = StObject.set(x, "TargetBands", js.undefined)
    
    inline def setTargetBandsVarargs(value: String*): Self = StObject.set(x, "TargetBands", js.Array(value*))
  }
}
