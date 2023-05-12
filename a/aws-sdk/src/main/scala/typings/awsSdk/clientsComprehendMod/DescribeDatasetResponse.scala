package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDatasetResponse extends StObject {
  
  /**
    * The dataset properties.
    */
  var DatasetProperties: js.UndefOr[typings.awsSdk.clientsComprehendMod.DatasetProperties] = js.undefined
}
object DescribeDatasetResponse {
  
  inline def apply(): DescribeDatasetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDatasetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDatasetResponse] (val x: Self) extends AnyVal {
    
    inline def setDatasetProperties(value: DatasetProperties): Self = StObject.set(x, "DatasetProperties", value.asInstanceOf[js.Any])
    
    inline def setDatasetPropertiesUndefined: Self = StObject.set(x, "DatasetProperties", js.undefined)
  }
}
