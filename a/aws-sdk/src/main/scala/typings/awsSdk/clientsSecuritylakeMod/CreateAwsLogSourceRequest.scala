package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAwsLogSourceRequest extends StObject {
  
  /**
    * Enables data collection from specific Amazon Web Services sources in all specific accounts and specific Regions.
    */
  var enableAllDimensions: js.UndefOr[AllDimensionsMap] = js.undefined
  
  /**
    * Enables data collection from all Amazon Web Services sources in specific accounts or Regions.
    */
  var enableSingleDimension: js.UndefOr[InputSet] = js.undefined
  
  /**
    * Enables data collection from specific Amazon Web Services sources in specific accounts or Regions.
    */
  var enableTwoDimensions: js.UndefOr[TwoDimensionsMap] = js.undefined
  
  /**
    * Specifies the input order to enable dimensions in Security Lake, namely Region, source type, and member account.
    */
  var inputOrder: DimensionSet
}
object CreateAwsLogSourceRequest {
  
  inline def apply(inputOrder: DimensionSet): CreateAwsLogSourceRequest = {
    val __obj = js.Dynamic.literal(inputOrder = inputOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAwsLogSourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAwsLogSourceRequest] (val x: Self) extends AnyVal {
    
    inline def setEnableAllDimensions(value: AllDimensionsMap): Self = StObject.set(x, "enableAllDimensions", value.asInstanceOf[js.Any])
    
    inline def setEnableAllDimensionsUndefined: Self = StObject.set(x, "enableAllDimensions", js.undefined)
    
    inline def setEnableSingleDimension(value: InputSet): Self = StObject.set(x, "enableSingleDimension", value.asInstanceOf[js.Any])
    
    inline def setEnableSingleDimensionUndefined: Self = StObject.set(x, "enableSingleDimension", js.undefined)
    
    inline def setEnableSingleDimensionVarargs(value: SafeString*): Self = StObject.set(x, "enableSingleDimension", js.Array(value*))
    
    inline def setEnableTwoDimensions(value: TwoDimensionsMap): Self = StObject.set(x, "enableTwoDimensions", value.asInstanceOf[js.Any])
    
    inline def setEnableTwoDimensionsUndefined: Self = StObject.set(x, "enableTwoDimensions", js.undefined)
    
    inline def setInputOrder(value: DimensionSet): Self = StObject.set(x, "inputOrder", value.asInstanceOf[js.Any])
    
    inline def setInputOrderVarargs(value: Dimension*): Self = StObject.set(x, "inputOrder", js.Array(value*))
  }
}
