package typings.asyncblock

import typings.asyncblock.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ab {
  
  object ab {
    
    @js.native
    trait Flow extends StObject {
      
      def add(): Any = js.native
      def add(key: Any): Any = js.native
      def add(options: TaskOptions): Any = js.native
      
      def callback(): Any = js.native
      def callback(key: Any): Any = js.native
      def callback(options: TaskOptions): Any = js.native
      
      def del(key: Any): Any = js.native
      
      def doneAdding(): Unit = js.native
      
      var errorCallback: js.Function = js.native
      
      def forceWait(): Any = js.native
      
      def get(key: Any): Any = js.native
      
      var maxParallel: Double = js.native
      
      //task timeout (event = taskTimeout)
      def on(event: String, handler: js.Function1[/* info */ Key, Unit]): Unit = js.native
      
      def queue(exec: js.Function): Unit = js.native
      def queue(key: Any, exec: js.Function): Unit = js.native
      def queue(options: TaskOptions, exec: js.Function): Unit = js.native
      
      def set(): js.Function = js.native
      def set(key: Any): js.Function = js.native
      def set(key: Any, responseFormat: js.Array[String]): js.Function = js.native
      def set(options: TaskOptions): js.Function = js.native
      
      def sync(func: Any): Any = js.native
      
      var taskTimeout: Double = js.native
      
      var timeoutIsError: Boolean = js.native
      
      def wait(key: Any): Any = js.native
    }
    
    @js.native
    trait Result[T] extends StObject {
      
      def defer(): T = js.native
      def defer(options: TaskOptions): T = js.native
      
      def sync(): T = js.native
      def sync(options: TaskOptions): T = js.native
    }
    
    trait TaskOptions extends StObject {
      
      var dontWait: js.UndefOr[Boolean] = js.undefined
      
      var firstArgIsError: js.UndefOr[Boolean] = js.undefined
      
      var ignoreError: js.UndefOr[Boolean] = js.undefined
      
      var key: js.UndefOr[Any] = js.undefined
      
      var responseFormat: js.UndefOr[js.Array[String]] = js.undefined
      
      var timeout: js.UndefOr[Double] = js.undefined
      
      var timeoutIsError: js.UndefOr[Boolean] = js.undefined
    }
    object TaskOptions {
      
      inline def apply(): TaskOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TaskOptions]
      }
      
      extension [Self <: TaskOptions](x: Self) {
        
        inline def setDontWait(value: Boolean): Self = StObject.set(x, "dontWait", value.asInstanceOf[js.Any])
        
        inline def setDontWaitUndefined: Self = StObject.set(x, "dontWait", js.undefined)
        
        inline def setFirstArgIsError(value: Boolean): Self = StObject.set(x, "firstArgIsError", value.asInstanceOf[js.Any])
        
        inline def setFirstArgIsErrorUndefined: Self = StObject.set(x, "firstArgIsError", js.undefined)
        
        inline def setIgnoreError(value: Boolean): Self = StObject.set(x, "ignoreError", value.asInstanceOf[js.Any])
        
        inline def setIgnoreErrorUndefined: Self = StObject.set(x, "ignoreError", js.undefined)
        
        inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        inline def setResponseFormat(value: js.Array[String]): Self = StObject.set(x, "responseFormat", value.asInstanceOf[js.Any])
        
        inline def setResponseFormatUndefined: Self = StObject.set(x, "responseFormat", js.undefined)
        
        inline def setResponseFormatVarargs(value: String*): Self = StObject.set(x, "responseFormat", js.Array(value*))
        
        inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
        
        inline def setTimeoutIsError(value: Boolean): Self = StObject.set(x, "timeoutIsError", value.asInstanceOf[js.Any])
        
        inline def setTimeoutIsErrorUndefined: Self = StObject.set(x, "timeoutIsError", js.undefined)
        
        inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      }
    }
  }
}
