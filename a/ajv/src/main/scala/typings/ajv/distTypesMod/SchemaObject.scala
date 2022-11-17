package typings.ajv.distTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaObject
  extends StObject
     with _SchemaObject {
  
  @JSName("$async")
  var $async: js.UndefOr[false] = js.undefined
}
object SchemaObject {
  
  inline def apply(): SchemaObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObject]
  }
  
  extension [Self <: SchemaObject](x: Self) {
    
    inline def set$async(value: false): Self = StObject.set(x, "$async", value.asInstanceOf[js.Any])
    
    inline def set$asyncUndefined: Self = StObject.set(x, "$async", js.undefined)
  }
}
