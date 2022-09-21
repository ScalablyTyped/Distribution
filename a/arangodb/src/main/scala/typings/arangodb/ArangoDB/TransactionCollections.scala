package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Global
trait TransactionCollections extends StObject {
  
  var allowImplicit: js.UndefOr[Boolean] = js.undefined
  
  var read: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var write: js.UndefOr[String | js.Array[String]] = js.undefined
}
object TransactionCollections {
  
  inline def apply(): TransactionCollections = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactionCollections]
  }
  
  extension [Self <: TransactionCollections](x: Self) {
    
    inline def setAllowImplicit(value: Boolean): Self = StObject.set(x, "allowImplicit", value.asInstanceOf[js.Any])
    
    inline def setAllowImplicitUndefined: Self = StObject.set(x, "allowImplicit", js.undefined)
    
    inline def setRead(value: String | js.Array[String]): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    inline def setReadVarargs(value: String*): Self = StObject.set(x, "read", js.Array(value*))
    
    inline def setWrite(value: String | js.Array[String]): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
    
    inline def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
    
    inline def setWriteVarargs(value: String*): Self = StObject.set(x, "write", js.Array(value*))
  }
}
