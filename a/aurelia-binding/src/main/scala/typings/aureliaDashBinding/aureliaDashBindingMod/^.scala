package typings.aureliaDashBinding.aureliaDashBindingMod

import typings.std.PropertyDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-binding", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val sourceContext: String = js.native
  val targetContext: String = js.native
  def bindingBehavior(name: String): js.Any = js.native
  def camelCase(name: String): String = js.native
  def computedFrom(propertyNames: String*): js.Any = js.native
  def connectBindingToSignal(binding: Binding, name: String): Unit = js.native
  def connectable(): Unit = js.native
  def createOverrideContext(bindingContext: js.Any): OverrideContext = js.native
  def createOverrideContext(bindingContext: js.Any, parentOverrideContext: OverrideContext): OverrideContext = js.native
  def createScopeForTest(bindingContext: js.Any): Scope = js.native
  def createScopeForTest(bindingContext: js.Any, parentBindingContext: js.Any): Scope = js.native
  def declarePropertyDependencies(ctor: js.Any, propertyName: String, dependencies: js.Array[String]): Unit = js.native
  def disableConnectQueue(): Unit = js.native
  def enableConnectQueue(): Unit = js.native
  def enqueueBindingConnect(binding: Binding): Unit = js.native
  def getChangeRecords(): js.Any = js.native
  def getContextFor(name: String, scope: Scope): js.Any = js.native
  def getContextFor(name: String, scope: Scope, ancestor: Double): js.Any = js.native
  def hasDeclaredDependencies(descriptor: PropertyDescriptor): Boolean = js.native
  def mergeSplice(splices: js.Any, index: Double, removed: js.Any, addedCount: Double): js.Any = js.native
  def observable(): js.Any = js.native
  def observable(targetOrConfig: js.Object): js.Any = js.native
  def observable(targetOrConfig: js.Object, key: js.Any): js.Any = js.native
  def observable(targetOrConfig: js.Object, key: js.Any, descriptor: js.Any): js.Any = js.native
  def setConnectQueueThreshold(value: Double): Unit = js.native
  def signalBindings(name: String): Unit = js.native
  def subscriberCollection(): js.Any = js.native
  def valueConverter(name: String): js.Any = js.native
}

