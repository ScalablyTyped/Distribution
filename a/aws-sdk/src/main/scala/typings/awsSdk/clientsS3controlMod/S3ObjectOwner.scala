package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ObjectOwner extends StObject {
  
  /**
    * 
    */
  var DisplayName: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined
  
  /**
    * 
    */
  var ID: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined
}
object S3ObjectOwner {
  
  inline def apply(): S3ObjectOwner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3ObjectOwner]
  }
  
  extension [Self <: S3ObjectOwner](x: Self) {
    
    inline def setDisplayName(value: NonEmptyMaxLength1024String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setID(value: NonEmptyMaxLength1024String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setIDUndefined: Self = StObject.set(x, "ID", js.undefined)
  }
}
