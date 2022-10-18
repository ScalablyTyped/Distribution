package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSignalCatalogResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the deleted signal catalog.
    */
  var arn: typings.awsSdk.clientsIotfleetwiseMod.arn
  
  /**
    * The name of the deleted signal catalog.
    */
  var name: resourceName
}
object DeleteSignalCatalogResponse {
  
  inline def apply(arn: arn, name: resourceName): DeleteSignalCatalogResponse = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSignalCatalogResponse]
  }
  
  extension [Self <: DeleteSignalCatalogResponse](x: Self) {
    
    inline def setArn(value: arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setName(value: resourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
