package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandardsManagedBy extends StObject {
  
  /**
    * An identifier for the company that manages a specific security standard. For existing standards, the value is equal to Amazon Web Services.
    */
  var Company: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * An identifier for the product that manages a specific security standard. For existing standards, the value is equal to the Amazon Web Services service that manages the standard.
    */
  var Product: js.UndefOr[NonEmptyString] = js.undefined
}
object StandardsManagedBy {
  
  inline def apply(): StandardsManagedBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardsManagedBy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StandardsManagedBy] (val x: Self) extends AnyVal {
    
    inline def setCompany(value: NonEmptyString): Self = StObject.set(x, "Company", value.asInstanceOf[js.Any])
    
    inline def setCompanyUndefined: Self = StObject.set(x, "Company", js.undefined)
    
    inline def setProduct(value: NonEmptyString): Self = StObject.set(x, "Product", value.asInstanceOf[js.Any])
    
    inline def setProductUndefined: Self = StObject.set(x, "Product", js.undefined)
  }
}
