package typings.asyncLock

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("async-lock", JSImport.Namespace)
  @js.native
  class ^ () extends AsyncLock {
    def this(options: AsyncLockOptions) = this()
  }
  
  @js.native
  trait AsyncLock extends StObject {
    
    def acquire[T](key: String, fn: js.Function0[T | js.Thenable[T]]): js.Promise[T] = js.native
    def acquire[T](key: String, fn: js.Function0[T | js.Thenable[T]], opts: AsyncLockOptions): js.Promise[T] = js.native
    def acquire[T](key: String, fn: js.Function1[/* done */ AsyncLockDoneCallback[T], _]): js.Promise[T] = js.native
    def acquire[T](
      key: String,
      fn: js.Function1[/* done */ AsyncLockDoneCallback[T], _],
      cb: AsyncLockDoneCallback[T]
    ): Unit = js.native
    def acquire[T](
      key: String,
      fn: js.Function1[/* done */ AsyncLockDoneCallback[T], _],
      cb: AsyncLockDoneCallback[T],
      opts: AsyncLockOptions
    ): Unit = js.native
    def acquire[T](key: String, fn: js.Function1[/* done */ AsyncLockDoneCallback[T], _], opts: AsyncLockOptions): js.Promise[T] = js.native
    def acquire[T](key: js.Array[String], fn: js.Function0[T | js.Thenable[T]]): js.Promise[T] = js.native
    def acquire[T](key: js.Array[String], fn: js.Function0[T | js.Thenable[T]], opts: AsyncLockOptions): js.Promise[T] = js.native
    def acquire[T](key: js.Array[String], fn: js.Function1[/* done */ AsyncLockDoneCallback[T], _]): js.Promise[T] = js.native
    def acquire[T](
      key: js.Array[String],
      fn: js.Function1[/* done */ AsyncLockDoneCallback[T], _],
      cb: AsyncLockDoneCallback[T]
    ): Unit = js.native
    def acquire[T](
      key: js.Array[String],
      fn: js.Function1[/* done */ AsyncLockDoneCallback[T], _],
      cb: AsyncLockDoneCallback[T],
      opts: AsyncLockOptions
    ): Unit = js.native
    def acquire[T](
      key: js.Array[String],
      fn: js.Function1[/* done */ AsyncLockDoneCallback[T], _],
      opts: AsyncLockOptions
    ): js.Promise[T] = js.native
    
    def isBusy(): Boolean = js.native
    def isBusy(key: String): Boolean = js.native
  }
  
  type AsyncLockDoneCallback[T] = js.Function2[/* err */ js.UndefOr[Error], /* ret */ js.UndefOr[T], Unit]
  
  @js.native
  trait AsyncLockOptions extends StObject {
    
    var Promise: js.UndefOr[js.Any] = js.native
    
    var domainReentrant: js.UndefOr[Boolean] = js.native
    
    var maxPending: js.UndefOr[Double] = js.native
    
    var skipQueue: js.UndefOr[Boolean] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object AsyncLockOptions {
    
    @scala.inline
    def apply(): AsyncLockOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsyncLockOptions]
    }
    
    @scala.inline
    implicit class AsyncLockOptionsMutableBuilder[Self <: AsyncLockOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomainReentrant(value: Boolean): Self = StObject.set(x, "domainReentrant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainReentrantUndefined: Self = StObject.set(x, "domainReentrant", js.undefined)
      
      @scala.inline
      def setMaxPending(value: Double): Self = StObject.set(x, "maxPending", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxPendingUndefined: Self = StObject.set(x, "maxPending", js.undefined)
      
      @scala.inline
      def setPromise(value: js.Any): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromiseUndefined: Self = StObject.set(x, "Promise", js.undefined)
      
      @scala.inline
      def setSkipQueue(value: Boolean): Self = StObject.set(x, "skipQueue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipQueueUndefined: Self = StObject.set(x, "skipQueue", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
