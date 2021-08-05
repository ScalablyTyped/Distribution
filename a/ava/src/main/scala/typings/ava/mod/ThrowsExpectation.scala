package typings.ava.mod

import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThrowsExpectation extends StObject {
  
  /** The thrown error must have a code that equals the given string or number. */
  var code: js.UndefOr[String | Double] = js.undefined
  
  /** The thrown error must be an instance of this constructor. */
  var instanceOf: js.UndefOr[Constructor] = js.undefined
  
  /** The thrown error must be strictly equal to this value. */
  var is: js.UndefOr[Error] = js.undefined
  
  /** The thrown error must have a message that equals the given string, or matches the regular expression. */
  var message: js.UndefOr[String | RegExp] = js.undefined
  
  /** The thrown error must have a name that equals the given string. */
  var name: js.UndefOr[String] = js.undefined
}
object ThrowsExpectation {
  
  inline def apply(): ThrowsExpectation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThrowsExpectation]
  }
  
  extension [Self <: ThrowsExpectation](x: Self) {
    
    inline def setCode(value: String | Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setInstanceOf(value: Constructor): Self = StObject.set(x, "instanceOf", value.asInstanceOf[js.Any])
    
    inline def setInstanceOfUndefined: Self = StObject.set(x, "instanceOf", js.undefined)
    
    inline def setIs(value: Error): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
    
    inline def setMessage(value: String | RegExp): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
