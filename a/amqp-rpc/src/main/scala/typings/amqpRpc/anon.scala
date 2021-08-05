package typings.amqpRpc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AutoDelete extends StObject {
    
    var autoDelete: js.UndefOr[Boolean] = js.undefined
    
    var exclusive: js.UndefOr[Boolean] = js.undefined
  }
  object AutoDelete {
    
    inline def apply(): AutoDelete = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoDelete]
    }
    
    extension [Self <: AutoDelete](x: Self) {
      
      inline def setAutoDelete(value: Boolean): Self = StObject.set(x, "autoDelete", value.asInstanceOf[js.Any])
      
      inline def setAutoDeleteUndefined: Self = StObject.set(x, "autoDelete", js.undefined)
      
      inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      inline def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
    }
  }
  
  trait DefaultExchangeName extends StObject {
    
    var defaultExchangeName: js.UndefOr[String] = js.undefined
  }
  object DefaultExchangeName {
    
    inline def apply(): DefaultExchangeName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultExchangeName]
    }
    
    extension [Self <: DefaultExchangeName](x: Self) {
      
      inline def setDefaultExchangeName(value: String): Self = StObject.set(x, "defaultExchangeName", value.asInstanceOf[js.Any])
      
      inline def setDefaultExchangeNameUndefined: Self = StObject.set(x, "defaultExchangeName", js.undefined)
    }
  }
}
