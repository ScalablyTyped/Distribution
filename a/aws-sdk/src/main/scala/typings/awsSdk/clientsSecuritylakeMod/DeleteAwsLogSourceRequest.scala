package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAwsLogSourceRequest extends StObject {
  
  /**
    * Removes the specific Amazon Web Services sources from specific accounts and specific Regions.
    */
  var disableAllDimensions: js.UndefOr[AllDimensionsMap] = js.undefined
  
  /**
    * Removes all Amazon Web Services sources from specific accounts or Regions.
    */
  var disableSingleDimension: js.UndefOr[InputSet] = js.undefined
  
  /**
    * Remove a specific Amazon Web Services source from specific accounts or Regions.
    */
  var disableTwoDimensions: js.UndefOr[TwoDimensionsMap] = js.undefined
  
  /**
    * This is a mandatory input. Specify the input order to disable dimensions in Security Lake, namely Region (Amazon Web Services Region code, source type, and member (account ID of a specific Amazon Web Services account). 
    */
  var inputOrder: DimensionSet
}
object DeleteAwsLogSourceRequest {
  
  inline def apply(inputOrder: DimensionSet): DeleteAwsLogSourceRequest = {
    val __obj = js.Dynamic.literal(inputOrder = inputOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAwsLogSourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteAwsLogSourceRequest] (val x: Self) extends AnyVal {
    
    inline def setDisableAllDimensions(value: AllDimensionsMap): Self = StObject.set(x, "disableAllDimensions", value.asInstanceOf[js.Any])
    
    inline def setDisableAllDimensionsUndefined: Self = StObject.set(x, "disableAllDimensions", js.undefined)
    
    inline def setDisableSingleDimension(value: InputSet): Self = StObject.set(x, "disableSingleDimension", value.asInstanceOf[js.Any])
    
    inline def setDisableSingleDimensionUndefined: Self = StObject.set(x, "disableSingleDimension", js.undefined)
    
    inline def setDisableSingleDimensionVarargs(value: SafeString*): Self = StObject.set(x, "disableSingleDimension", js.Array(value*))
    
    inline def setDisableTwoDimensions(value: TwoDimensionsMap): Self = StObject.set(x, "disableTwoDimensions", value.asInstanceOf[js.Any])
    
    inline def setDisableTwoDimensionsUndefined: Self = StObject.set(x, "disableTwoDimensions", js.undefined)
    
    inline def setInputOrder(value: DimensionSet): Self = StObject.set(x, "inputOrder", value.asInstanceOf[js.Any])
    
    inline def setInputOrderVarargs(value: Dimension*): Self = StObject.set(x, "inputOrder", js.Array(value*))
  }
}
