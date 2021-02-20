package typings.arangodb.anon

import typings.arangodb.ArangoDB.KeyGeneratorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowUserKeys extends StObject {
  
  var allowUserKeys: js.UndefOr[Boolean] = js.native
  
  var increment: js.UndefOr[Double] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[KeyGeneratorType] = js.native
}
object AllowUserKeys {
  
  @scala.inline
  def apply(): AllowUserKeys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowUserKeys]
  }
  
  @scala.inline
  implicit class AllowUserKeysMutableBuilder[Self <: AllowUserKeys] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowUserKeys(value: Boolean): Self = StObject.set(x, "allowUserKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowUserKeysUndefined: Self = StObject.set(x, "allowUserKeys", js.undefined)
    
    @scala.inline
    def setIncrement(value: Double): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncrementUndefined: Self = StObject.set(x, "increment", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setType(value: KeyGeneratorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
