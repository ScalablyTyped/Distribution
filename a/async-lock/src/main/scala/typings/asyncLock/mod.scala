package typings.asyncLock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("async-lock", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with AsyncLock {
    def this(options: AsyncLockOptions) = this()
  }
  
  /* static member */
  @JSImport("async-lock", "DEFAULT_MAX_OCCUPATION_TIME")
  @js.native
  val DEFAULT_MAX_OCCUPATION_TIME: Double = js.native
  
  /* static member */
  @JSImport("async-lock", "DEFAULT_MAX_PENDING")
  @js.native
  val DEFAULT_MAX_PENDING: Double = js.native
  
  /* static member */
  @JSImport("async-lock", "DEFAULT_TIMEOUT")
  @js.native
  val DEFAULT_TIMEOUT: Double = js.native
  
  @js.native
  trait AsyncLock extends StObject {
    
    /**
      * Lock on asynchronous code.
      *
      * @param key resource key or keys to lock
      * @param fn function to execute
      * @param opts options
      *
      * @example
      * import AsyncLock = require('async-lock');
      * const lock = new AsyncLock();
      *
      * lock.acquire(
      *     key,
      *     () => {
      *         // return value or promise
      *     },
      *     opts
      * ).then(() => {
      *     // lock released
      * });
      */
    def acquire[T](key: String, fn: js.Function0[T | js.Thenable[T]]): js.Promise[T] = js.native
    def acquire[T](key: String, fn: js.Function0[T | js.Thenable[T]], opts: AsyncLockOptions): js.Promise[T] = js.native
    def acquire[T](key: String, fn: js.Function1[/* done */ AsyncLockDoneCallback[T], Any]): js.Promise[T] = js.native
    /**
      * Lock on asynchronous code.
      *
      * @param key resource key or keys to lock
      * @param fn function to execute
      * @param cb callback function
      * @param opts options
      *
      * @example
      * import AsyncLock = require('async-lock');
      * const lock = new AsyncLock();
      *
      * lock.acquire(
      *     key,
      *     (done) => {
      *         // async work
      *         done(err, ret);
      *     },
      *     (err, ret) => {
      *         // lock released
      *     },
      *     opts
      * );
      */
    def acquire[T](
      key: String,
      fn: js.Function1[/* done */ AsyncLockDoneCallback[T], Any],
      cb: AsyncLockDoneCallback[T]
    ): Unit = js.native
    def acquire[T](
      key: String,
      fn: js.Function1[/* done */ AsyncLockDoneCallback[T], Any],
      cb: AsyncLockDoneCallback[T],
      opts: AsyncLockOptions
    ): Unit = js.native
    def acquire[T](key: String, fn: js.Function1[/* done */ AsyncLockDoneCallback[T], Any], opts: AsyncLockOptions): js.Promise[T] = js.native
    def acquire[T](key: js.Array[String], fn: js.Function0[T | js.Thenable[T]]): js.Promise[T] = js.native
    def acquire[T](key: js.Array[String], fn: js.Function0[T | js.Thenable[T]], opts: AsyncLockOptions): js.Promise[T] = js.native
    def acquire[T](key: js.Array[String], fn: js.Function1[/* done */ AsyncLockDoneCallback[T], Any]): js.Promise[T] = js.native
    def acquire[T](
      key: js.Array[String],
      fn: js.Function1[/* done */ AsyncLockDoneCallback[T], Any],
      cb: AsyncLockDoneCallback[T]
    ): Unit = js.native
    def acquire[T](
      key: js.Array[String],
      fn: js.Function1[/* done */ AsyncLockDoneCallback[T], Any],
      cb: AsyncLockDoneCallback[T],
      opts: AsyncLockOptions
    ): Unit = js.native
    def acquire[T](
      key: js.Array[String],
      fn: js.Function1[/* done */ AsyncLockDoneCallback[T], Any],
      opts: AsyncLockOptions
    ): js.Promise[T] = js.native
    
    /**
      * Whether there is any running or pending async function.
      */
    def isBusy(): Boolean = js.native
    def isBusy(key: String): Boolean = js.native
  }
  
  type AsyncLockDoneCallback[T] = js.Function2[/* err */ js.UndefOr[js.Error | Null], /* ret */ js.UndefOr[T], Unit]
  
  trait AsyncLockOptions extends StObject {
    
    /**
      * Use your own promise library instead of the global `Promise` variable.
      *
      * @example
      * import AsyncLock = require('async-lock');
      * import Bluebird = require('bluebird');
      * import Q = require('q');
      *
      * new AsyncLock({ Promise: Bluebird }); // Bluebird
      * new AsyncLock({ Promise: Q });        // Q
      */
    var Promise: js.UndefOr[Any] = js.undefined
    
    /**
      * Make a lock reentrant in the same domain.
      *
      * @default false
      *
      * @example
      * import AsyncLock = require('async-lock');
      * import * as domain from 'domain';
      *
      * const lock = new AsyncLock({ domainReentrant: true });
      * const d = domain.create();
      * d.run(() => {
      *     lock.acquire('key', () => {
      *         // Enter lock
      *         return lock.acquire('key', () => {
      *             // Enter same lock twice
      *         });
      *     });
      * });
      */
    var domainReentrant: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Max amount of time allowed between entering the queue and completing execution.
      *
      * @default 0 (Never)
      */
    var maxOccupationTime: js.UndefOr[Double] = js.undefined
    
    /**
      * Max number of tasks allowed in the queue at a time.
      *
      * @default 1000
      */
    var maxPending: js.UndefOr[Double] = js.undefined
    
    /**
      * Allows to enqueue a task in the front of the queue, skipping all enqueued tasks.
      *
      * @default false
      *
      * @example
      * import AsyncLock = require('async-lock');
      *
      * const lock = new AsyncLock();
      * // Add a task to the front of the queue waiting for a given lock
      * lock.acquire(key, fn1, cb); // runs immediately
      * lock.acquire(key, fn2, cb); // added to queue
      * lock.acquire(key, priorityFn, cb, { skipQueue: true }); // jumps queue and runs before fn2
      */
    var skipQueue: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Max amount of time an item can remain in the queue before acquiring the lock.
      *
      * @default 0 (Never)
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object AsyncLockOptions {
    
    inline def apply(): AsyncLockOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsyncLockOptions]
    }
    
    extension [Self <: AsyncLockOptions](x: Self) {
      
      inline def setDomainReentrant(value: Boolean): Self = StObject.set(x, "domainReentrant", value.asInstanceOf[js.Any])
      
      inline def setDomainReentrantUndefined: Self = StObject.set(x, "domainReentrant", js.undefined)
      
      inline def setMaxOccupationTime(value: Double): Self = StObject.set(x, "maxOccupationTime", value.asInstanceOf[js.Any])
      
      inline def setMaxOccupationTimeUndefined: Self = StObject.set(x, "maxOccupationTime", js.undefined)
      
      inline def setMaxPending(value: Double): Self = StObject.set(x, "maxPending", value.asInstanceOf[js.Any])
      
      inline def setMaxPendingUndefined: Self = StObject.set(x, "maxPending", js.undefined)
      
      inline def setPromise(value: Any): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
      
      inline def setPromiseUndefined: Self = StObject.set(x, "Promise", js.undefined)
      
      inline def setSkipQueue(value: Boolean): Self = StObject.set(x, "skipQueue", value.asInstanceOf[js.Any])
      
      inline def setSkipQueueUndefined: Self = StObject.set(x, "skipQueue", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
