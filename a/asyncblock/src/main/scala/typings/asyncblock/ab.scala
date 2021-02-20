package typings.asyncblock

import typings.asyncblock.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ab {
  
  object ab {
    
    @js.native
    trait Flow extends StObject {
      
      def add(): js.Any = js.native
      def add(key: js.Any): js.Any = js.native
      def add(options: TaskOptions): js.Any = js.native
      
      def callback(): js.Any = js.native
      def callback(key: js.Any): js.Any = js.native
      def callback(options: TaskOptions): js.Any = js.native
      
      def del(key: js.Any): js.Any = js.native
      
      def doneAdding(): Unit = js.native
      
      var errorCallback: js.Function = js.native
      
      def forceWait(): js.Any = js.native
      
      def get(key: js.Any): js.Any = js.native
      
      var maxParallel: Double = js.native
      
      //task timeout (event = taskTimeout)
      def on(event: String, handler: js.Function1[/* info */ Key, Unit]): Unit = js.native
      
      def queue(exec: js.Function): Unit = js.native
      def queue(key: js.Any, exec: js.Function): Unit = js.native
      def queue(options: TaskOptions, exec: js.Function): Unit = js.native
      
      def set(): js.Function = js.native
      def set(key: js.Any): js.Function = js.native
      def set(key: js.Any, responseFormat: js.Array[String]): js.Function = js.native
      def set(options: TaskOptions): js.Function = js.native
      
      def sync(func: js.Any): js.Any = js.native
      
      var taskTimeout: Double = js.native
      
      var timeoutIsError: Boolean = js.native
      
      def wait(key: js.Any): js.Any = js.native
    }
    
    @js.native
    trait Result[T] extends StObject {
      
      def defer(): T = js.native
      def defer(options: TaskOptions): T = js.native
      
      def sync(): T = js.native
      def sync(options: TaskOptions): T = js.native
    }
    
    @js.native
    trait TaskOptions extends StObject {
      
      var dontWait: js.UndefOr[Boolean] = js.native
      
      var firstArgIsError: js.UndefOr[Boolean] = js.native
      
      var ignoreError: js.UndefOr[Boolean] = js.native
      
      var key: js.UndefOr[js.Any] = js.native
      
      var responseFormat: js.UndefOr[js.Array[String]] = js.native
      
      var timeout: js.UndefOr[Double] = js.native
      
      var timeoutIsError: js.UndefOr[Boolean] = js.native
    }
    object TaskOptions {
      
      @scala.inline
      def apply(): TaskOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TaskOptions]
      }
      
      @scala.inline
      implicit class TaskOptionsMutableBuilder[Self <: TaskOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDontWait(value: Boolean): Self = StObject.set(x, "dontWait", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDontWaitUndefined: Self = StObject.set(x, "dontWait", js.undefined)
        
        @scala.inline
        def setFirstArgIsError(value: Boolean): Self = StObject.set(x, "firstArgIsError", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFirstArgIsErrorUndefined: Self = StObject.set(x, "firstArgIsError", js.undefined)
        
        @scala.inline
        def setIgnoreError(value: Boolean): Self = StObject.set(x, "ignoreError", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIgnoreErrorUndefined: Self = StObject.set(x, "ignoreError", js.undefined)
        
        @scala.inline
        def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        @scala.inline
        def setResponseFormat(value: js.Array[String]): Self = StObject.set(x, "responseFormat", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResponseFormatUndefined: Self = StObject.set(x, "responseFormat", js.undefined)
        
        @scala.inline
        def setResponseFormatVarargs(value: String*): Self = StObject.set(x, "responseFormat", js.Array(value :_*))
        
        @scala.inline
        def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimeoutIsError(value: Boolean): Self = StObject.set(x, "timeoutIsError", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimeoutIsErrorUndefined: Self = StObject.set(x, "timeoutIsError", js.undefined)
        
        @scala.inline
        def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      }
    }
  }
}
