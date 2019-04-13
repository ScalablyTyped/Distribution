package typings
package angularLib.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * $q - service in module ng
  * A promise/deferred implementation inspired by Kris Kowal's Q.
  * See http://docs.angularjs.org/api/ng/service/$q
  */
@js.native
trait IQService
  extends org.scalablytyped.runtime.Instantiable1[
      /* resolver */ js.Function2[
        /* resolve */ IQResolveReject[js.Object], 
        /* reject */ IQResolveReject[js.Any], 
        js.Any
      ], 
      IPromise[js.Object]
    ] {
  def apply[T](resolver: js.Function2[/* resolve */ IQResolveReject[T], /* reject */ IQResolveReject[_], _]): IPromise[T] = js.native
  /**
    * Combines multiple promises into a single promise that is resolved when all of the input promises are resolved.
    *
    * Returns a single promise that will be resolved with a hash of values, each value corresponding to the promise at the same key in the promises hash. If any of the promises is resolved with a rejection, this resulting promise will be rejected with the same rejection value.
    *
    * @param promises A hash of promises.
    */
  def all[T](
    promises: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: angular.angular.IPromise<T[K]> | T[K]}
    */ angularLib.angularLibStrings.IQService with js.Any
  ): IPromise[T] = js.native
  def all[TAll](promises: js.Array[TAll | IPromise[TAll]]): IPromise[js.Array[TAll]] = js.native
  def all[T1, T2](values: js.Tuple2[T1 | IPromise[T1], T2 | IPromise[T2]]): IPromise[js.Tuple2[T1, T2]] = js.native
  def all[T1, T2, T3](values: js.Tuple3[T1 | IPromise[T1], T2 | IPromise[T2], T3 | IPromise[T3]]): IPromise[js.Tuple3[T1, T2, T3]] = js.native
  def all[T1, T2, T3, T4](values: js.Tuple4[T1 | IPromise[T1], T2 | IPromise[T2], T3 | IPromise[T3], T4 | IPromise[T4]]): IPromise[js.Tuple4[T1, T2, T3, T4]] = js.native
  def all[T1, T2, T3, T4, T5](
    values: js.Tuple5[
      T1 | IPromise[T1], 
      T2 | IPromise[T2], 
      T3 | IPromise[T3], 
      T4 | IPromise[T4], 
      T5 | IPromise[T5]
    ]
  ): IPromise[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
  def all[T1, T2, T3, T4, T5, T6](
    values: js.Tuple6[
      T1 | IPromise[T1], 
      T2 | IPromise[T2], 
      T3 | IPromise[T3], 
      T4 | IPromise[T4], 
      T5 | IPromise[T5], 
      T6 | IPromise[T6]
    ]
  ): IPromise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
  def all[T1, T2, T3, T4, T5, T6, T7](
    values: js.Tuple7[
      T1 | IPromise[T1], 
      T2 | IPromise[T2], 
      T3 | IPromise[T3], 
      T4 | IPromise[T4], 
      T5 | IPromise[T5], 
      T6 | IPromise[T6], 
      T7 | IPromise[T7]
    ]
  ): IPromise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
  def all[T1, T2, T3, T4, T5, T6, T7, T8](
    values: js.Tuple8[
      T1 | IPromise[T1], 
      T2 | IPromise[T2], 
      T3 | IPromise[T3], 
      T4 | IPromise[T4], 
      T5 | IPromise[T5], 
      T6 | IPromise[T6], 
      T7 | IPromise[T7], 
      T8 | IPromise[T8]
    ]
  ): IPromise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
  def all[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    values: js.Tuple9[
      T1 | IPromise[T1], 
      T2 | IPromise[T2], 
      T3 | IPromise[T3], 
      T4 | IPromise[T4], 
      T5 | IPromise[T5], 
      T6 | IPromise[T6], 
      T7 | IPromise[T7], 
      T8 | IPromise[T8], 
      T9 | IPromise[T9]
    ]
  ): IPromise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
  /**
    * Combines multiple promises into a single promise that is resolved when all of the input promises are resolved.
    *
    * Returns a single promise that will be resolved with an array of values, each value corresponding to the promise at the same index in the promises array. If any of the promises is resolved with a rejection, this resulting promise will be rejected with the same rejection value.
    *
    * @param promises An array of promises.
    */
  def all[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    values: js.Tuple10[
      T1 | IPromise[T1], 
      T2 | IPromise[T2], 
      T3 | IPromise[T3], 
      T4 | IPromise[T4], 
      T5 | IPromise[T5], 
      T6 | IPromise[T6], 
      T7 | IPromise[T7], 
      T8 | IPromise[T8], 
      T9 | IPromise[T9], 
      T10 | IPromise[T10]
    ]
  ): IPromise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
  /**
    * Creates a Deferred object which represents a task which will finish in the future.
    */
  def defer[T](): IDeferred[T] = js.native
  /**
    * Returns a promise that resolves or rejects as soon as one of those promises resolves or rejects, with the value or reason from that promise.
    *
    * @param promises A list or hash of promises.
    */
  def race[T](promises: js.Array[IPromise[T]]): IPromise[T] = js.native
  def race[T](promises: org.scalablytyped.runtime.StringDictionary[IPromise[T]]): IPromise[T] = js.native
  /**
    * Creates a promise that is resolved as rejected with the specified reason. This api should be used to forward rejection in a chain of promises. If you are dealing with the last promise in a promise chain, you don't need to worry about it.
    *
    * When comparing deferreds/promises to the familiar behavior of try/catch/throw, think of reject as the throw keyword in JavaScript. This also means that if you "catch" an error via a promise error callback and you want to forward the error to the promise derived from the current promise, you have to "rethrow" the error by returning a rejection constructed via reject.
    *
    * @param reason Constant, message, exception or an object representing the rejection reason.
    */
  def reject(): IPromise[scala.Nothing] = js.native
  def reject(reason: js.Any): IPromise[scala.Nothing] = js.native
  /**
    * Wraps an object that might be a value or a (3rd party) then-able promise into a $q promise. This is useful when you are dealing with an object that might or might not be a promise, or if the promise comes from a source that can't be trusted.
    */
  def resolve(): IPromise[scala.Unit] = js.native
  def resolve[T](value: T): IPromise[T] = js.native
  /**
    * Wraps an object that might be a value or a (3rd party) then-able promise into a $q promise. This is useful when you are dealing with an object that might or might not be a promise, or if the promise comes from a source that can't be trusted.
    *
    * @param value Value or a promise
    */
  def resolve[T](value: js.Thenable[T]): IPromise[T] = js.native
  @JSName("resolve")
  def resolve_T1T2[T1, T2](value: T2): IPromise[T1 | T2] = js.native
  /**
    * @deprecated Since TS 2.4, inference is stricter and no longer produces the desired type when T1 !== T2.
    * To use resolve with two different types, pass a union type to the single-type-argument overload.
    */
  @JSName("resolve")
  def resolve_T1T2[T1, T2](value: js.Thenable[T1]): IPromise[T1 | T2] = js.native
  /**
    * Wraps an object that might be a value or a (3rd party) then-able promise into a $q promise. This is useful when you are dealing with an object that might or might not be a promise, or if the promise comes from a source that can't be trusted.
    */
  def when(): IPromise[scala.Unit] = js.native
  def when[T](value: T): IPromise[T] = js.native
  /**
    * Wraps an object that might be a value or a (3rd party) then-able promise into a $q promise. This is useful when you are dealing with an object that might or might not be a promise, or if the promise comes from a source that can't be trusted.
    *
    * @param value Value or a promise
    */
  def when[T](value: js.Thenable[T]): IPromise[T] = js.native
  def when[TResult, T](value: T, successCallback: js.Function1[/* promiseValue */ T, js.Thenable[TResult] | TResult]): IPromise[TResult] = js.native
  def when[TResult, T](
    value: T,
    successCallback: js.Function1[/* promiseValue */ T, js.Thenable[TResult] | TResult],
    errorCallback: js.Function1[/* reason */ js.Any, _]
  ): IPromise[TResult] = js.native
  def when[TResult, T](
    value: T,
    successCallback: js.Function1[/* promiseValue */ T, js.Thenable[TResult] | TResult],
    errorCallback: js.Function1[/* reason */ js.Any, _],
    notifyCallback: js.Function1[/* state */ js.Any, _]
  ): IPromise[TResult] = js.native
  def when[TResult, T](
    value: T,
    successCallback: js.Function1[/* promiseValue */ T, js.Thenable[TResult] | TResult],
    errorCallback: js.UndefOr[scala.Nothing],
    notifyCallback: js.Function1[/* state */ js.Any, _]
  ): IPromise[TResult] = js.native
  def when[TResult, T](
    value: T,
    successCallback: js.Function1[/* promiseValue */ T, js.Thenable[TResult] | TResult],
    errorCallback: scala.Null,
    notifyCallback: js.Function1[/* state */ js.Any, _]
  ): IPromise[TResult] = js.native
  def when[TResult, T](
    value: js.Thenable[T],
    successCallback: js.Function1[/* promiseValue */ T, js.Thenable[TResult] | TResult]
  ): IPromise[TResult] = js.native
  def when[TResult, TResult2, T](
    value: js.Thenable[T],
    successCallback: js.Function1[/* promiseValue */ T, js.Thenable[TResult] | TResult],
    errorCallback: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
  ): IPromise[TResult | TResult2] = js.native
  def when[TResult, TResult2, T](
    value: js.Thenable[T],
    successCallback: js.Function1[/* promiseValue */ T, js.Thenable[TResult] | TResult],
    errorCallback: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]],
    notifyCallback: js.Function1[/* state */ js.Any, _]
  ): IPromise[TResult | TResult2] = js.native
  @JSName("when")
  def when_T1T2[T1, T2](value: T2): IPromise[T1 | T2] = js.native
  @JSName("when")
  def when_T1T2[T1, T2](value: js.Thenable[T1]): IPromise[T1 | T2] = js.native
}

