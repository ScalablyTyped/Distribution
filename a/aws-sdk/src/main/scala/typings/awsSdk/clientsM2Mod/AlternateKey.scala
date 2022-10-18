package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlternateKey extends StObject {
  
  /**
    * Indicates whether the alternate key values are supposed to be unique for the given data set.
    */
  var allowDuplicates: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A strictly positive integer value representing the length of the alternate key.
    */
  var length: Integer
  
  /**
    * The name of the alternate key.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A positive integer value representing the offset to mark the start of the alternate key part in the record byte array.
    */
  var offset: Integer
}
object AlternateKey {
  
  inline def apply(length: Integer, offset: Integer): AlternateKey = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlternateKey]
  }
  
  extension [Self <: AlternateKey](x: Self) {
    
    inline def setAllowDuplicates(value: Boolean): Self = StObject.set(x, "allowDuplicates", value.asInstanceOf[js.Any])
    
    inline def setAllowDuplicatesUndefined: Self = StObject.set(x, "allowDuplicates", js.undefined)
    
    inline def setLength(value: Integer): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOffset(value: Integer): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
