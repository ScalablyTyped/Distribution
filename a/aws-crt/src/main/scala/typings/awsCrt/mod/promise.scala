package typings.awsCrt.mod

import typings.awsCrt.distCommonPromiseMod.LiftedPromise
import typings.awsCrt.distCommonPromiseMod.LiftedRejecter
import typings.awsCrt.distCommonPromiseMod.LiftedResolver
import typings.awsCrt.distCommonPromiseMod.PromiseCleanupFunctor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promise {
  
  @JSImport("aws-crt", "promise")
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeSelfCleaningPromise[ResultType](promise: js.Promise[ResultType]): js.Promise[ResultType] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeSelfCleaningPromise")(promise.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultType]]
  inline def makeSelfCleaningPromise[ResultType](promise: js.Promise[ResultType], cleaner: PromiseCleanupFunctor): js.Promise[ResultType] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSelfCleaningPromise")(promise.asInstanceOf[js.Any], cleaner.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResultType]]
  
  inline def newLiftedPromise[ResultType](): LiftedPromise[ResultType] = ^.asInstanceOf[js.Dynamic].applyDynamic("newLiftedPromise")().asInstanceOf[LiftedPromise[ResultType]]
  inline def newLiftedPromise[ResultType](
    promiseBody: js.Function2[/* resolve */ LiftedResolver[ResultType], /* reject */ LiftedRejecter, Unit]
  ): LiftedPromise[ResultType] = ^.asInstanceOf[js.Dynamic].applyDynamic("newLiftedPromise")(promiseBody.asInstanceOf[js.Any]).asInstanceOf[LiftedPromise[ResultType]]
}
