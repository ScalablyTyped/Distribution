package typings.ajv.distTypesMod

import typings.ajv.ajvBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaObject
  extends StObject
     with _SchemaObject
     with AnySchemaObject {
  
  @JSName("$async")
  var $async: js.UndefOr[`false`] = js.undefined
}
object SchemaObject {
  
  inline def apply(): SchemaObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SchemaObject] (val x: Self) extends AnyVal {
    
    inline def set$async(value: `false`): Self = StObject.set(x, "$async", value.asInstanceOf[js.Any])
    
    inline def set$asyncUndefined: Self = StObject.set(x, "$async", js.undefined)
  }
}
