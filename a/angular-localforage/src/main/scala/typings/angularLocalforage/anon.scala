package typings.angularLocalforage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DefaultValue extends StObject {
    
    var defaultValue: js.UndefOr[js.Any] = js.undefined
    
    var key: String
    
    var name: js.UndefOr[String] = js.undefined
    
    var scopeKey: js.UndefOr[String] = js.undefined
  }
  object DefaultValue {
    
    @scala.inline
    def apply(key: String): DefaultValue = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultValue]
    }
    
    @scala.inline
    implicit class DefaultValueMutableBuilder[Self <: DefaultValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setScopeKey(value: String): Self = StObject.set(x, "scopeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeKeyUndefined: Self = StObject.set(x, "scopeKey", js.undefined)
    }
  }
}
