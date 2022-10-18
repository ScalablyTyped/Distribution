package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelatedFinding extends StObject {
  
  /**
    * The product-generated identifier for a related finding.
    */
  var Id: NonEmptyString
  
  /**
    * The ARN of the product that generated a related finding.
    */
  var ProductArn: NonEmptyString
}
object RelatedFinding {
  
  inline def apply(Id: NonEmptyString, ProductArn: NonEmptyString): RelatedFinding = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], ProductArn = ProductArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelatedFinding]
  }
  
  extension [Self <: RelatedFinding](x: Self) {
    
    inline def setId(value: NonEmptyString): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setProductArn(value: NonEmptyString): Self = StObject.set(x, "ProductArn", value.asInstanceOf[js.Any])
  }
}
