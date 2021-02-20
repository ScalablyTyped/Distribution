package typings.ava.mod

import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThrowsExpectation extends StObject {
  
  /** The thrown error must have a code that equals the given string or number. */
  var code: js.UndefOr[String | Double] = js.native
  
  /** The thrown error must be an instance of this constructor. */
  var instanceOf: js.UndefOr[Constructor] = js.native
  
  /** The thrown error must be strictly equal to this value. */
  var is: js.UndefOr[Error] = js.native
  
  /** The thrown error must have a message that equals the given string, or matches the regular expression. */
  var message: js.UndefOr[String | RegExp] = js.native
  
  /** The thrown error must have a name that equals the given string. */
  var name: js.UndefOr[String] = js.native
}
object ThrowsExpectation {
  
  @scala.inline
  def apply(): ThrowsExpectation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThrowsExpectation]
  }
  
  @scala.inline
  implicit class ThrowsExpectationMutableBuilder[Self <: ThrowsExpectation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String | Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setInstanceOf(value: Constructor): Self = StObject.set(x, "instanceOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceOfUndefined: Self = StObject.set(x, "instanceOf", js.undefined)
    
    @scala.inline
    def setIs(value: Error): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
    
    @scala.inline
    def setMessage(value: String | RegExp): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
