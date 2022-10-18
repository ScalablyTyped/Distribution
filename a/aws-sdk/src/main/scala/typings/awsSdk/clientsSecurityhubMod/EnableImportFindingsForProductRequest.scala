package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableImportFindingsForProductRequest extends StObject {
  
  /**
    * The ARN of the product to enable the integration for.
    */
  var ProductArn: NonEmptyString
}
object EnableImportFindingsForProductRequest {
  
  inline def apply(ProductArn: NonEmptyString): EnableImportFindingsForProductRequest = {
    val __obj = js.Dynamic.literal(ProductArn = ProductArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableImportFindingsForProductRequest]
  }
  
  extension [Self <: EnableImportFindingsForProductRequest](x: Self) {
    
    inline def setProductArn(value: NonEmptyString): Self = StObject.set(x, "ProductArn", value.asInstanceOf[js.Any])
  }
}
