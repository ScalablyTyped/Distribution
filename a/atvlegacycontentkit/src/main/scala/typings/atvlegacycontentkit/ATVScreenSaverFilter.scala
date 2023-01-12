package typings.atvlegacycontentkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The filters supplied for the screensaver.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait ATVScreenSaverFilter extends StObject {
  
  /**
    * The operation to check the two strings. Seems to always be '=='.
    */
  var operation: String
  
  /**
    * The property to check. Is is either ID, with value being the ID of the collection you supplied, or type, with the value always being 'photo'.
    */
  var property: String
  
  /**
    * The value to match.
    */
  var value: String
}
object ATVScreenSaverFilter {
  
  inline def apply(operation: String, property: String, value: String): ATVScreenSaverFilter = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ATVScreenSaverFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ATVScreenSaverFilter] (val x: Self) extends AnyVal {
    
    inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
