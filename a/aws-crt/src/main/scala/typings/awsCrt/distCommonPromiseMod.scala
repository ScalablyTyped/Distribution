package typings.awsCrt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonPromiseMod {
  
  @JSImport("aws-crt/dist/common/promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeSelfCleaningPromise[ResultType](promise: js.Promise[ResultType]): js.Promise[ResultType] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeSelfCleaningPromise")(promise.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultType]]
  inline def makeSelfCleaningPromise[ResultType](promise: js.Promise[ResultType], cleaner: PromiseCleanupFunctor): js.Promise[ResultType] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSelfCleaningPromise")(promise.asInstanceOf[js.Any], cleaner.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResultType]]
  
  inline def newLiftedPromise[ResultType](): LiftedPromise[ResultType] = ^.asInstanceOf[js.Dynamic].applyDynamic("newLiftedPromise")().asInstanceOf[LiftedPromise[ResultType]]
  inline def newLiftedPromise[ResultType](
    promiseBody: js.Function2[/* resolve */ LiftedResolver[ResultType], /* reject */ LiftedRejecter, Unit]
  ): LiftedPromise[ResultType] = ^.asInstanceOf[js.Dynamic].applyDynamic("newLiftedPromise")(promiseBody.asInstanceOf[js.Any]).asInstanceOf[LiftedPromise[ResultType]]
  
  trait LiftedPromise[ResultType] extends StObject {
    
    /**
      * The actual promise whose resolve and reject methods have been exposed.
      */
    var promise: js.Promise[ResultType]
    
    /**
      * Reject function for the associated promise
      */
    def reject(): Unit
    def reject(error: Any): Unit
    /**
      * Reject function for the associated promise
      */
    @JSName("reject")
    var reject_Original: LiftedRejecter
    
    /**
      * Resolve function for the associated promise
      */
    def resolve(value: ResultType): Unit
    /**
      * Resolve function for the associated promise
      */
    @JSName("resolve")
    var resolve_Original: LiftedResolver[ResultType]
  }
  object LiftedPromise {
    
    inline def apply[ResultType](
      promise: js.Promise[ResultType],
      reject: /* error */ js.UndefOr[Any] => Unit,
      resolve: ResultType => Unit
    ): LiftedPromise[ResultType] = {
      val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve))
      __obj.asInstanceOf[LiftedPromise[ResultType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LiftedPromise[?], ResultType] (val x: Self & LiftedPromise[ResultType]) extends AnyVal {
      
      inline def setPromise(value: js.Promise[ResultType]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      inline def setReject(value: /* error */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "reject", js.Any.fromFunction1(value))
      
      inline def setResolve(value: ResultType => Unit): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    }
  }
  
  type LiftedRejecter = js.Function1[/* error */ js.UndefOr[Any], Unit]
  
  type LiftedResolver[ResultType] = js.Function1[/* value */ ResultType, Unit]
  
  type PromiseCleanupFunctor = js.Function0[Unit]
}
