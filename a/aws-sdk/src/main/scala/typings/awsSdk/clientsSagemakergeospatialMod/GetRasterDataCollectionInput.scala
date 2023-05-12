package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRasterDataCollectionInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the raster data collection.
    */
  var Arn: DataCollectionArn
}
object GetRasterDataCollectionInput {
  
  inline def apply(Arn: DataCollectionArn): GetRasterDataCollectionInput = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRasterDataCollectionInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRasterDataCollectionInput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: DataCollectionArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}
