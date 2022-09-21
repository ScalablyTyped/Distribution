package typings.atlassianConnectJs.AP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Confluence specific JavaScript module which provides functions to interact with the macro editor.
  */
object confluence {
  
  trait ContentProperty extends StObject {
    
    /**
      * the key of the property to create or update
      */
    var key: String
    
    /**
      * the value of the property - may be a String or JavaScript object.
      */
    var value: String | js.Object
    
    /**
      * a JavaScript object that defines the version of the content property
      */
    var version: js.Object
  }
  object ContentProperty {
    
    inline def apply(key: String, value: String | js.Object, version: js.Object): ContentProperty = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentProperty]
    }
    
    extension [Self <: ContentProperty](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String | js.Object): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: js.Object): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
