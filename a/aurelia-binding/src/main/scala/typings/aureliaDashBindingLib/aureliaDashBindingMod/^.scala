package typings
package aureliaDashBindingLib.aureliaDashBindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-binding", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val sourceContext: java.lang.String = js.native
  val targetContext: java.lang.String = js.native
  def bindingBehavior(name: java.lang.String): js.Any = js.native
  def camelCase(name: java.lang.String): java.lang.String = js.native
  def computedFrom(propertyNames: java.lang.String*): js.Any = js.native
  def connectBindingToSignal(binding: Binding, name: java.lang.String): scala.Unit = js.native
  def connectable(): scala.Unit = js.native
  def createOverrideContext(bindingContext: js.Any): OverrideContext = js.native
  def createOverrideContext(bindingContext: js.Any, parentOverrideContext: OverrideContext): OverrideContext = js.native
  def createScopeForTest(bindingContext: js.Any): Scope = js.native
  def createScopeForTest(bindingContext: js.Any, parentBindingContext: js.Any): Scope = js.native
  def declarePropertyDependencies(ctor: js.Any, propertyName: java.lang.String, dependencies: js.Array[java.lang.String]): scala.Unit = js.native
  def enqueueBindingConnect(binding: Binding): scala.Unit = js.native
  def getChangeRecords(): js.Any = js.native
  def getContextFor(name: java.lang.String, scope: Scope): js.Any = js.native
  def getContextFor(name: java.lang.String, scope: Scope, ancestor: scala.Double): js.Any = js.native
  def hasDeclaredDependencies(descriptor: stdLib.PropertyDescriptor): scala.Boolean = js.native
  def mergeSplice(splices: js.Any, index: scala.Double, removed: js.Any, addedCount: scala.Double): js.Any = js.native
  def observable(): js.Any = js.native
  def observable(targetOrConfig: js.Object): js.Any = js.native
  def observable(targetOrConfig: js.Object, key: js.Any): js.Any = js.native
  def observable(targetOrConfig: js.Object, key: js.Any, descriptor: js.Any): js.Any = js.native
  def signalBindings(name: java.lang.String): scala.Unit = js.native
  def subscriberCollection(): js.Any = js.native
  def valueConverter(name: java.lang.String): js.Any = js.native
}

