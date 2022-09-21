package typings.angularQExtras

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.TopLevel
import typings.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("angular-q-extras", JSImport.Namespace)
  @js.native
  val ^ : String = js.native
  
  type _To = String
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: String = ^
  
  /* augmented module */
  object angularAugmentingMod {
    
    // tslint:disable-next-line interface-name
    @js.native
    trait IQService extends StObject {
      
      def allSettled[T](
        promises: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ K in keyof T ]: T[K] | angular.angular.IPromise<T[K]>}
        */ typings.angularQExtras.angularQExtrasStrings.IQService & TopLevel[Any]
      ): IPromise[
            /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ K in keyof T ]: angular-q-extras.angular-q-extras.angular.PromiseValue<T[K]>}
        */ typings.angularQExtras.angularQExtrasStrings.IQService & TopLevel[T]
          ] = js.native
      // tslint:enable:max-line-length
      def allSettled[TAll](promises: js.Array[TAll | IPromise[TAll]]): IPromise[js.Array[PromiseValue[TAll]]] = js.native
      def allSettled[T1, T2](values: js.Tuple2[T1 | IPromise[T1], T2 | IPromise[T2]]): IPromise[js.Tuple2[PromiseValue[T1], PromiseValue[T2]]] = js.native
      def allSettled[T1, T2, T3](values: js.Tuple3[T1 | IPromise[T1], T2 | IPromise[T2], T3 | IPromise[T3]]): IPromise[js.Tuple3[PromiseValue[T1], PromiseValue[T2], PromiseValue[T3]]] = js.native
      def allSettled[T1, T2, T3, T4](values: js.Tuple4[T1 | IPromise[T1], T2 | IPromise[T2], T3 | IPromise[T3], T4 | IPromise[T4]]): IPromise[
            js.Tuple4[PromiseValue[T1], PromiseValue[T2], PromiseValue[T3], PromiseValue[T4]]
          ] = js.native
      def allSettled[T1, T2, T3, T4, T5](
        values: js.Tuple5[
              T1 | IPromise[T1], 
              T2 | IPromise[T2], 
              T3 | IPromise[T3], 
              T4 | IPromise[T4], 
              T5 | IPromise[T5]
            ]
      ): IPromise[
            js.Tuple5[PromiseValue[T1], PromiseValue[T2], PromiseValue[T3], PromiseValue[T4], PromiseValue[T5]]
          ] = js.native
      def allSettled[T1, T2, T3, T4, T5, T6](
        values: js.Tuple6[
              T1 | IPromise[T1], 
              T2 | IPromise[T2], 
              T3 | IPromise[T3], 
              T4 | IPromise[T4], 
              T5 | IPromise[T5], 
              T6 | IPromise[T6]
            ]
      ): IPromise[
            js.Tuple6[
              PromiseValue[T1], 
              PromiseValue[T2], 
              PromiseValue[T3], 
              PromiseValue[T4], 
              PromiseValue[T5], 
              PromiseValue[T6]
            ]
          ] = js.native
      def allSettled[T1, T2, T3, T4, T5, T6, T7](
        values: js.Tuple7[
              T1 | IPromise[T1], 
              T2 | IPromise[T2], 
              T3 | IPromise[T3], 
              T4 | IPromise[T4], 
              T5 | IPromise[T5], 
              T6 | IPromise[T6], 
              T7 | IPromise[T7]
            ]
      ): IPromise[
            js.Tuple7[
              PromiseValue[T1], 
              PromiseValue[T2], 
              PromiseValue[T3], 
              PromiseValue[T4], 
              PromiseValue[T5], 
              PromiseValue[T6], 
              PromiseValue[T7]
            ]
          ] = js.native
      def allSettled[T1, T2, T3, T4, T5, T6, T7, T8](
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
      ): IPromise[
            js.Tuple8[
              PromiseValue[T1], 
              PromiseValue[T2], 
              PromiseValue[T3], 
              PromiseValue[T4], 
              PromiseValue[T5], 
              PromiseValue[T6], 
              PromiseValue[T7], 
              PromiseValue[T8]
            ]
          ] = js.native
      def allSettled[T1, T2, T3, T4, T5, T6, T7, T8, T9](
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
      ): IPromise[
            js.Tuple9[
              PromiseValue[T1], 
              PromiseValue[T2], 
              PromiseValue[T3], 
              PromiseValue[T4], 
              PromiseValue[T5], 
              PromiseValue[T6], 
              PromiseValue[T7], 
              PromiseValue[T8], 
              PromiseValue[T9]
            ]
          ] = js.native
      // tslint:disable:max-line-length
      def allSettled[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
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
      ): IPromise[
            js.Tuple10[
              PromiseValue[T1], 
              PromiseValue[T2], 
              PromiseValue[T3], 
              PromiseValue[T4], 
              PromiseValue[T5], 
              PromiseValue[T6], 
              PromiseValue[T7], 
              PromiseValue[T8], 
              PromiseValue[T9], 
              PromiseValue[T10]
            ]
          ] = js.native
      
      def isFulfilledState(promise: PromiseValue[Any]): Boolean = js.native
      
      def isRejectedState(promise: PromiseValue[Any]): Boolean = js.native
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.angularQExtras.angularQExtrasStrings.fulfilled
      - typings.angularQExtras.angularQExtrasStrings.rejected
    */
    trait PromiseState extends StObject
    object PromiseState {
      
      inline def fulfilled: typings.angularQExtras.angularQExtrasStrings.fulfilled = "fulfilled".asInstanceOf[typings.angularQExtras.angularQExtrasStrings.fulfilled]
      
      inline def rejected: typings.angularQExtras.angularQExtrasStrings.rejected = "rejected".asInstanceOf[typings.angularQExtras.angularQExtrasStrings.rejected]
    }
    
    trait PromiseValue[T] extends StObject {
      
      var reason: js.UndefOr[Any] = js.undefined
      
      var state: PromiseState
      
      var value: js.UndefOr[T] = js.undefined
    }
    object PromiseValue {
      
      inline def apply[T](state: PromiseState): PromiseValue[T] = {
        val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
        __obj.asInstanceOf[PromiseValue[T]]
      }
      
      extension [Self <: PromiseValue[?], T](x: Self & PromiseValue[T]) {
        
        inline def setReason(value: Any): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
        
        inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
        
        inline def setState(value: PromiseState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
        
        inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
  }
}
