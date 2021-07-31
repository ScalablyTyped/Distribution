package typings.arangodb.anon

import typings.arangodb.ArangoDB.KeyGeneratorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Increment extends StObject {
  
  var allowUserKeys: Boolean
  
  var increment: js.UndefOr[Double] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var `type`: KeyGeneratorType
}
object Increment {
  
  @scala.inline
  def apply(allowUserKeys: Boolean, `type`: KeyGeneratorType): Increment = {
    val __obj = js.Dynamic.literal(allowUserKeys = allowUserKeys.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Increment]
  }
  
  @scala.inline
  implicit class IncrementMutableBuilder[Self <: Increment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowUserKeys(value: Boolean): Self = StObject.set(x, "allowUserKeys", value.asInstanceOf[js.Any])
    
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
  }
}
