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
    
    @scala.inline
    def apply(): AutoDelete = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoDelete]
    }
    
    @scala.inline
    implicit class AutoDeleteMutableBuilder[Self <: AutoDelete] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoDelete(value: Boolean): Self = StObject.set(x, "autoDelete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoDeleteUndefined: Self = StObject.set(x, "autoDelete", js.undefined)
      
      @scala.inline
      def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
    }
  }
  
  trait DefaultExchangeName extends StObject {
    
    var defaultExchangeName: js.UndefOr[String] = js.undefined
  }
  object DefaultExchangeName {
    
    @scala.inline
    def apply(): DefaultExchangeName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultExchangeName]
    }
    
    @scala.inline
    implicit class DefaultExchangeNameMutableBuilder[Self <: DefaultExchangeName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultExchangeName(value: String): Self = StObject.set(x, "defaultExchangeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultExchangeNameUndefined: Self = StObject.set(x, "defaultExchangeName", js.undefined)
    }
  }
}
