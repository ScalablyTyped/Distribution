package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("atom", "Emitter")
@js.native
class Emitter[OptionalEmissions, RequiredEmissions] () extends DisposableLike {
  /** Clear out any existing subscribers. */
  def clear(): scala.Unit = js.native
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  // Event Emission
  /** Invoke the handlers registered via ::on for the given event name. */
  def emit[T /* <: java.lang.String */](eventName: T): scala.Unit = js.native
  // Event Emission
  /** Invoke the handlers registered via ::on for the given event name. */
  def emit[T /* <: java.lang.String */](
    eventName: T,
    value: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(OptionalEmissions))),List()),Left(TsIdentSimple(T))) */js.Any
  ): scala.Unit = js.native
  // Event Subscription
  /** Registers a handler to be invoked whenever the given event is emitted. */
  def on[T /* <: java.lang.String */](
    eventName: T,
    handler: js.Function1[
      (/* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(RequiredEmissions))),List()),Left(TsIdentSimple(T))) *//* value */ js.Any) | (/* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(OptionalEmissions))),List()),Left(TsIdentSimple(T))) *//* value */ js.UndefOr[
        /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(OptionalEmissions))),List()),Left(TsIdentSimple(T))) */js.Any
      ]), 
      scala.Unit
    ]
  ): Disposable = js.native
  /**
       *  Register the given handler function to be invoked the next time an event
       *  with the given name is emitted via ::emit.
       */
  def once[T /* <: java.lang.String */](
    eventName: T,
    handler: js.Function1[
      (/* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(RequiredEmissions))),List()),Left(TsIdentSimple(T))) *//* value */ js.Any) | (/* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(OptionalEmissions))),List()),Left(TsIdentSimple(T))) *//* value */ js.UndefOr[
        /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(OptionalEmissions))),List()),Left(TsIdentSimple(T))) */js.Any
      ]), 
      scala.Unit
    ]
  ): Disposable = js.native
  /**
       *  Register the given handler function to be invoked before all other
       *  handlers existing at the time of subscription whenever events by the
       *  given name are emitted via ::emit.
       */
  def preempt[T /* <: java.lang.String */](
    eventName: T,
    handler: js.Function1[
      (/* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(RequiredEmissions))),List()),Left(TsIdentSimple(T))) *//* value */ js.Any) | (/* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(OptionalEmissions))),List()),Left(TsIdentSimple(T))) *//* value */ js.UndefOr[
        /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(OptionalEmissions))),List()),Left(TsIdentSimple(T))) */js.Any
      ]), 
      scala.Unit
    ]
  ): Disposable = js.native
}

