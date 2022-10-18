package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeIndexRequest extends StObject {
  
  /**
    * The index name.
    */
  var indexName: IndexName
}
object DescribeIndexRequest {
  
  inline def apply(indexName: IndexName): DescribeIndexRequest = {
    val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeIndexRequest]
  }
  
  extension [Self <: DescribeIndexRequest](x: Self) {
    
    inline def setIndexName(value: IndexName): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
  }
}
