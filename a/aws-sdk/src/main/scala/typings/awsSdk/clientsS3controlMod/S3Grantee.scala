package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Grantee extends StObject {
  
  /**
    * 
    */
  var DisplayName: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined
  
  /**
    * 
    */
  var Identifier: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined
  
  /**
    * 
    */
  var TypeIdentifier: js.UndefOr[S3GranteeTypeIdentifier] = js.undefined
}
object S3Grantee {
  
  inline def apply(): S3Grantee = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Grantee]
  }
  
  extension [Self <: S3Grantee](x: Self) {
    
    inline def setDisplayName(value: NonEmptyMaxLength1024String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setIdentifier(value: NonEmptyMaxLength1024String): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "Identifier", js.undefined)
    
    inline def setTypeIdentifier(value: S3GranteeTypeIdentifier): Self = StObject.set(x, "TypeIdentifier", value.asInstanceOf[js.Any])
    
    inline def setTypeIdentifierUndefined: Self = StObject.set(x, "TypeIdentifier", js.undefined)
  }
}
