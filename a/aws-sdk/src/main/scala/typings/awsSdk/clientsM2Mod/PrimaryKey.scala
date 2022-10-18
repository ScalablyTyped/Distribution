package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrimaryKey extends StObject {
  
  /**
    * A strictly positive integer value representing the length of the primary key. 
    */
  var length: Integer
  
  /**
    * A name for the Primary Key.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A positive integer value representing the offset to mark the start of the primary key in the record byte array.
    */
  var offset: Integer
}
object PrimaryKey {
  
  inline def apply(length: Integer, offset: Integer): PrimaryKey = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryKey]
  }
  
  extension [Self <: PrimaryKey](x: Self) {
    
    inline def setLength(value: Integer): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOffset(value: Integer): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
