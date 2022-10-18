package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDatasetResponse extends StObject {
  
  /**
    * The name of the dataset that you updated.
    */
  var Name: DatasetName
}
object UpdateDatasetResponse {
  
  inline def apply(Name: DatasetName): UpdateDatasetResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDatasetResponse]
  }
  
  extension [Self <: UpdateDatasetResponse](x: Self) {
    
    inline def setName(value: DatasetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
