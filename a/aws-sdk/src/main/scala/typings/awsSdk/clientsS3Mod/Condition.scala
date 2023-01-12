package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Condition extends StObject {
  
  /**
    * The HTTP error code when the redirect is applied. In the event of an error, if the error code equals this value, then the specified redirect is applied. Required when parent element Condition is specified and sibling KeyPrefixEquals is not specified. If both are specified, then both must be true for the redirect to be applied.
    */
  var HttpErrorCodeReturnedEquals: js.UndefOr[typings.awsSdk.clientsS3Mod.HttpErrorCodeReturnedEquals] = js.undefined
  
  /**
    * The object key name prefix when the redirect is applied. For example, to redirect requests for ExamplePage.html, the key prefix will be ExamplePage.html. To redirect request for all pages with the prefix docs/, the key prefix will be /docs, which identifies all objects in the docs/ folder. Required when the parent element Condition is specified and sibling HttpErrorCodeReturnedEquals is not specified. If both conditions are specified, both must be true for the redirect to be applied.  Replacement must be made for object keys containing special characters (such as carriage returns) when using XML requests. For more information, see  XML related object key constraints. 
    */
  var KeyPrefixEquals: js.UndefOr[typings.awsSdk.clientsS3Mod.KeyPrefixEquals] = js.undefined
}
object Condition {
  
  inline def apply(): Condition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Condition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Condition] (val x: Self) extends AnyVal {
    
    inline def setHttpErrorCodeReturnedEquals(value: HttpErrorCodeReturnedEquals): Self = StObject.set(x, "HttpErrorCodeReturnedEquals", value.asInstanceOf[js.Any])
    
    inline def setHttpErrorCodeReturnedEqualsUndefined: Self = StObject.set(x, "HttpErrorCodeReturnedEquals", js.undefined)
    
    inline def setKeyPrefixEquals(value: KeyPrefixEquals): Self = StObject.set(x, "KeyPrefixEquals", value.asInstanceOf[js.Any])
    
    inline def setKeyPrefixEqualsUndefined: Self = StObject.set(x, "KeyPrefixEquals", js.undefined)
  }
}
