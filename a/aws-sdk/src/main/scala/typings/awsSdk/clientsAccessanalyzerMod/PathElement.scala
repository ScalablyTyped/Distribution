package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathElement extends StObject {
  
  /**
    * Refers to an index in a JSON array.
    */
  var index: js.UndefOr[Integer] = js.undefined
  
  /**
    * Refers to a key in a JSON object.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * Refers to a substring of a literal string in a JSON object.
    */
  var substring: js.UndefOr[Substring] = js.undefined
  
  /**
    * Refers to the value associated with a given key in a JSON object.
    */
  var value: js.UndefOr[String] = js.undefined
}
object PathElement {
  
  inline def apply(): PathElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathElement]
  }
  
  extension [Self <: PathElement](x: Self) {
    
    inline def setIndex(value: Integer): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setSubstring(value: Substring): Self = StObject.set(x, "substring", value.asInstanceOf[js.Any])
    
    inline def setSubstringUndefined: Self = StObject.set(x, "substring", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
