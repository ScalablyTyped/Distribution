package typings.aggregateError

import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("aggregate-error", JSImport.Default)
  @js.native
  open class default[T /* <: js.Error */] protected ()
    extends StObject
       with AggregateError[T] {
    /**
    	@param errors - If a string, a new `Error` is created with the string as the error message. If a non-Error object, a new `Error` is created with all properties from the object copied over.
    	@example
    	```
    	import AggregateError from 'aggregate-error';
    	const error = new AggregateError([new Error('foo'), 'bar', {message: 'baz'}]);
    	throw error;
    	// AggregateError:
    	//	Error: foo
    	//		at Object.<anonymous> (/Users/sindresorhus/dev/aggregate-error/example.js:3:33)
    	//	Error: bar
    	//		at Object.<anonymous> (/Users/sindresorhus/dev/aggregate-error/example.js:3:13)
    	//	Error: baz
    	//		at Object.<anonymous> (/Users/sindresorhus/dev/aggregate-error/example.js:3:13)
    	//	at AggregateError (/Users/sindresorhus/dev/aggregate-error/index.js:19:3)
    	//	at Object.<anonymous> (/Users/sindresorhus/dev/aggregate-error/example.js:3:13)
    	//	at Module._compile (module.js:556:32)
    	//	at Object.Module._extensions..js (module.js:565:10)
    	//	at Module.load (module.js:473:32)
    	//	at tryModuleLoad (module.js:432:12)
    	//	at Function.Module._load (module.js:424:3)
    	//	at Module.runMain (module.js:590:10)
    	//	at run (bootstrap_node.js:394:7)
    	//	at startup (bootstrap_node.js:149:9)
    	for (const individualError of error.errors) {
    		console.log(individualError);
    	}
    	//=> [Error: foo]
    	//=> [Error: bar]
    	//=> [Error: baz]
    	```
    	*/
    def this(errors: js.Array[T | (Record[String, Any]) | String]) = this()
    
    /* CompleteClass */
    override val errors: js.Array[T] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    override val name_AggregateError: typings.aggregateError.aggregateErrorStrings.AggregateError = js.native
  }
  
  trait AggregateError[T /* <: js.Error */]
    extends StObject
       with Error {
    
    val errors: js.Array[T]
    
    @JSName("name")
    val name_AggregateError: typings.aggregateError.aggregateErrorStrings.AggregateError
  }
  object AggregateError {
    
    inline def apply[T /* <: js.Error */](errors: js.Array[T], message: String): AggregateError[T] = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = "AggregateError")
      __obj.asInstanceOf[AggregateError[T]]
    }
    
    extension [Self <: AggregateError[?], T /* <: js.Error */](x: Self & AggregateError[T]) {
      
      inline def setErrors(value: js.Array[T]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: T*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setName(value: typings.aggregateError.aggregateErrorStrings.AggregateError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
