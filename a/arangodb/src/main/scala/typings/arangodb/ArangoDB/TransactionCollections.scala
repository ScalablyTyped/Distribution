package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Global
@js.native
trait TransactionCollections extends StObject {
  
  var allowImplicit: js.UndefOr[Boolean] = js.native
  
  var read: js.UndefOr[String | js.Array[String]] = js.native
  
  var write: js.UndefOr[String | js.Array[String]] = js.native
}
object TransactionCollections {
  
  @scala.inline
  def apply(): TransactionCollections = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactionCollections]
  }
  
  @scala.inline
  implicit class TransactionCollectionsMutableBuilder[Self <: TransactionCollections] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowImplicit(value: Boolean): Self = StObject.set(x, "allowImplicit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowImplicitUndefined: Self = StObject.set(x, "allowImplicit", js.undefined)
    
    @scala.inline
    def setRead(value: String | js.Array[String]): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    @scala.inline
    def setReadVarargs(value: String*): Self = StObject.set(x, "read", js.Array(value :_*))
    
    @scala.inline
    def setWrite(value: String | js.Array[String]): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
    
    @scala.inline
    def setWriteVarargs(value: String*): Self = StObject.set(x, "write", js.Array(value :_*))
  }
}
