package typings.assertionError

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.assertionError.mod.Result because var conflicts: name. Inlined ok, toJSON */ @JSImport("assertion-error", "AssertionError")
  @js.native
  open class AssertionError[T] ()
    extends StObject
       with Error
       with /* key */ StringDictionary[Any] {
    def this(message: String) = this()
    def this(message: String, props: T) = this()
    def this(message: Unit, props: T) = this()
    def this(message: String, props: T, ssf: js.Function) = this()
    def this(message: String, props: Unit, ssf: js.Function) = this()
    def this(message: Unit, props: T, ssf: js.Function) = this()
    def this(message: Unit, props: Unit, ssf: js.Function) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    @JSName("name")
    def name_MAssertionError: typings.assertionError.assertionErrorStrings.AssertionError = js.native
    
    def ok: Boolean = js.native
    @JSName("ok")
    var ok_FAssertionError: Boolean = js.native
    
    @JSName("stack")
    def stack_MAssertionError: Any = js.native
    
    def toJSON(args: Any*): Record[String, Any] = js.native
    def toJSON(stack: Boolean): Record[String, Any] = js.native
  }
  
  @JSImport("assertion-error", "AssertionResult")
  @js.native
  open class AssertionResult[T] ()
    extends StObject
       with Result
       with /* key */ StringDictionary[Any] {
    def this(props: T) = this()
    
    /* CompleteClass */
    var name: typings.assertionError.assertionErrorStrings.AssertionError | typings.assertionError.assertionErrorStrings.AssertionResult = js.native
    @JSName("name")
    def name_MAssertionResult: typings.assertionError.assertionErrorStrings.AssertionResult = js.native
    
    /* CompleteClass */
    var ok: Boolean = js.native
    @JSName("ok")
    def ok_MAssertionResult: Boolean = js.native
    
    def toJSON(): Record[String, Any] = js.native
    /* CompleteClass */
    override def toJSON(args: Any*): Record[String, Any] = js.native
  }
  
  trait Result extends StObject {
    
    var name: typings.assertionError.assertionErrorStrings.AssertionError | typings.assertionError.assertionErrorStrings.AssertionResult
    
    var ok: Boolean
    
    def toJSON(args: Any*): Record[String, Any]
  }
  object Result {
    
    inline def apply(
      name: typings.assertionError.assertionErrorStrings.AssertionError | typings.assertionError.assertionErrorStrings.AssertionResult,
      ok: Boolean,
      toJSON: /* repeated */ Any => Record[String, Any]
    ): Result = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], toJSON = js.Any.fromFunction1(toJSON))
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def setName(
        value: typings.assertionError.assertionErrorStrings.AssertionError | typings.assertionError.assertionErrorStrings.AssertionResult
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: /* repeated */ Any => Record[String, Any]): Self = StObject.set(x, "toJSON", js.Any.fromFunction1(value))
    }
  }
}
