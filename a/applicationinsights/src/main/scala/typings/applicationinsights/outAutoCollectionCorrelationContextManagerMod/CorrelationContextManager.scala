package typings.applicationinsights.outAutoCollectionCorrelationContextManagerMod

import typings.applicationinsights.outLibraryTraceparentMod.^
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights/out/AutoCollection/CorrelationContextManager", "CorrelationContextManager")
@js.native
class CorrelationContextManager () extends js.Object

/* static members */
@JSImport("applicationinsights/out/AutoCollection/CorrelationContextManager", "CorrelationContextManager")
@js.native
object CorrelationContextManager extends js.Object {
  var CONTEXT_NAME: js.Any = js.native
  var cls: js.Any = js.native
  var enabled: js.Any = js.native
  var forceClsHooked: js.Any = js.native
  var hasEverEnabled: js.Any = js.native
  var session: js.Any = js.native
  /**
    * A TypeError is triggered by cls-hooked for node [8.0, 8.2)
    * @internal Used in tests only
    */
  def canUseClsHooked(): Boolean = js.native
  /**
    *  Disables the CorrelationContextManager.
    */
  def disable(): Unit = js.native
  /**
    *  Enables the CorrelationContextManager.
    */
  def enable(): Unit = js.native
  def enable(forceClsHooked: Boolean): Unit = js.native
  /**
    *  A helper to generate objects conforming to the CorrelationContext interface
    */
  def generateContextObject(operationId: String): CorrelationContext = js.native
  def generateContextObject(operationId: String, parentId: String): CorrelationContext = js.native
  def generateContextObject(operationId: String, parentId: String, operationName: String): CorrelationContext = js.native
  def generateContextObject(operationId: String, parentId: String, operationName: String, correlationContextHeader: String): CorrelationContext = js.native
  def generateContextObject(
    operationId: String,
    parentId: String,
    operationName: String,
    correlationContextHeader: String,
    traceparent: ^
  ): CorrelationContext = js.native
  def generateContextObject(
    operationId: String,
    parentId: String,
    operationName: String,
    correlationContextHeader: String,
    traceparent: ^,
    tracestate: typings.applicationinsights.outLibraryTracestateMod.^
  ): CorrelationContext = js.native
  /**
    *  Provides the current Context.
    *  The context is the most recent one entered into for the current
    *  logical chain of execution, including across asynchronous calls.
    */
  def getCurrentContext(): CorrelationContext = js.native
  /**
    *  Reports if CorrelationContextManager is able to run in this environment
    */
  def isNodeVersionCompatible(): Boolean = js.native
  /**
    * Reset the namespace
    */
  def reset(): Unit = js.native
  /**
    *  Runs a function inside a given Context.
    *  All logical children of the execution path that entered this Context
    *  will receive this Context object on calls to GetCurrentContext.
    */
  def runWithContext(context: CorrelationContext, fn: js.Function0[_]): js.Any = js.native
  /**
    * We only want to use cls-hooked when it uses async_hooks api (8.2+), else
    * use async-listener (plain -cls)
    */
  def shouldUseClsHooked(): Boolean = js.native
  /**
    *  Patches a callback to restore the correct Context when getCurrentContext
    *  is run within it. This is necessary if automatic correlation fails to work
    *  with user-included libraries.
    *
    *  The supplied callback will be given the same context that was present for
    *  the call to wrapCallback.  */
  def wrapCallback[T /* <: js.Function */](fn: T): T = js.native
  /**
    * Wrapper for cls-hooked bindEmitter method
    */
  def wrapEmitter(emitter: EventEmitter): Unit = js.native
}

