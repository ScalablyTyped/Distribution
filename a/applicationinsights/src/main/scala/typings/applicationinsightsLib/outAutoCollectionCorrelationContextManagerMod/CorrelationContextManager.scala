package typings
package applicationinsightsLib.outAutoCollectionCorrelationContextManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights/out/AutoCollection/CorrelationContextManager", "CorrelationContextManager")
@js.native
class CorrelationContextManager () extends js.Object

@JSImport("applicationinsights/out/AutoCollection/CorrelationContextManager", "CorrelationContextManager")
@js.native
object CorrelationContextManager extends js.Object {
  var enabled: js.Any = js.native
  var hasEverEnabled: js.Any = js.native
  /**
       *  Disables the CorrelationContextManager.
       */
  def disable(): scala.Unit = js.native
  /**
       *  Enables the CorrelationContextManager.
       */
  def enable(): scala.Unit = js.native
  /**
       *  A helper to generate objects conforming to the CorrelationContext interface
       */
  def generateContextObject(operationId: java.lang.String): applicationinsightsLib.outAutoCollectionCorrelationContextManagerMod.CorrelationContext = js.native
  /**
       *  A helper to generate objects conforming to the CorrelationContext interface
       */
  def generateContextObject(operationId: java.lang.String, parentId: java.lang.String): applicationinsightsLib.outAutoCollectionCorrelationContextManagerMod.CorrelationContext = js.native
  /**
       *  A helper to generate objects conforming to the CorrelationContext interface
       */
  def generateContextObject(operationId: java.lang.String, parentId: java.lang.String, operationName: java.lang.String): applicationinsightsLib.outAutoCollectionCorrelationContextManagerMod.CorrelationContext = js.native
  /**
       *  A helper to generate objects conforming to the CorrelationContext interface
       */
  def generateContextObject(
    operationId: java.lang.String,
    parentId: java.lang.String,
    operationName: java.lang.String,
    correlationContextHeader: java.lang.String
  ): applicationinsightsLib.outAutoCollectionCorrelationContextManagerMod.CorrelationContext = js.native
  /**
       *  Provides the current Context.
       *  The context is the most recent one entered into for the current
       *  logical chain of execution, including across asynchronous calls.
       */
  def getCurrentContext(): applicationinsightsLib.outAutoCollectionCorrelationContextManagerMod.CorrelationContext = js.native
  /**
       *  Reports if the CorrelationContextManager is able to run in this environment
       */
  def isNodeVersionCompatible(): scala.Boolean = js.native
  /* private */ def patchError(): js.Any = js.native
  /* private */ def patchTimers(methodNames: js.Any): js.Any = js.native
  /**
       *  Runs a function inside a given Context.
       *  All logical children of the execution path that entered this Context
       *  will receive this Context object on calls to GetCurrentContext.
       */
  def runWithContext(
    context: applicationinsightsLib.outAutoCollectionCorrelationContextManagerMod.CorrelationContext,
    fn: js.Function0[_]
  ): scala.Unit = js.native
  /**
       *  Patches a callback to restore the correct Context when getCurrentContext
       *  is run within it. This is necessary if automatic correlation fails to work
       *  with user-included libraries.
       *
       *  The supplied callback will be given the same context that was present for
       *  the call to wrapCallback.  */
  def wrapCallback[T /* <: js.Function */](fn: T): T = js.native
}

