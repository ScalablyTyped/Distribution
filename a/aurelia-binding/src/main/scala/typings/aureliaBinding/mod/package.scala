package typings.aureliaBinding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def bindingBehavior(name: java.lang.String): js.Any = typings.aureliaBinding.mod.^.asInstanceOf[js.Dynamic].applyDynamic("bindingBehavior")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def camelCase(name: java.lang.String): java.lang.String = typings.aureliaBinding.mod.^.asInstanceOf[js.Dynamic].applyDynamic("camelCase")(name.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def computedFrom(propertyNames: java.lang.String*): js.Any = typings.aureliaBinding.mod.^.asInstanceOf[js.Dynamic].applyDynamic("computedFrom")(propertyNames.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def connectBindingToSignal(binding: typings.aureliaBinding.mod.Binding, name: java.lang.String): scala.Unit = (typings.aureliaBinding.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectBindingToSignal")(binding.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def connectable(): scala.Unit = typings.aureliaBinding.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectable")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def createOverrideContext(bindingContext: js.Any): typings.aureliaBinding.mod.OverrideContext = typings.aureliaBinding.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createOverrideContext")(bindingContext.asInstanceOf[js.Any]).asInstanceOf[typings.aureliaBinding.mod.OverrideContext]
  @scala.inline
  def createOverrideContext(bindingContext: js.Any, parentOverrideContext: typings.aureliaBinding.mod.OverrideContext): typings.aureliaBinding.mod.OverrideContext = (typings.aureliaBinding.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createOverrideContext")(bindingContext.asInstanceOf[js.Any], parentOverrideContext.asInstanceOf[js.Any])).asInstanceOf[typings.aureliaBinding.mod.OverrideContext]
  
  @scala.inline
  def createScopeForTest(bindingContext: js.Any): typings.aureliaBinding.mod.Scope = typings.aureliaBinding.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createScopeForTest")(bindingContext.asInstanceOf[js.Any]).asInstanceOf[typings.aureliaBinding.mod.Scope]
  @scala.inline
  def createScopeForTest(bindingContext: js.Any, parentBindingContext: js.Any): typings.aureliaBinding.mod.Scope = (typings.aureliaBinding.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createScopeForTest")(bindingContext.asInstanceOf[js.Any], parentBindingContext.asInstanceOf[js.Any])).asInstanceOf[typings.aureliaBinding.mod.Scope]
  
  @scala.inline
  def declarePropertyDependencies(ctor: js.Any, propertyName: java.lang.String, dependencies: js.Array[java.lang.String]): scala.Unit = (typings.aureliaBinding.mod.^.asInstanceOf[js.Dynamic].applyDynamic("declarePropertyDependencies")(ctor.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def disableConnectQueue(): scala.Unit = typings.aureliaBinding.mod.^.asInstanceOf[js.Dynamic].applyDynamic("disableConnectQueue")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def enableConnectQueue(): scala.Unit = typings.aureliaBinding.mod.^.asInstanceOf[js.Dynamic].applyDynamic("enableConnectQueue")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def enqueueBindingConnect(binding: typings.aureliaBinding.mod.Binding): scala.Unit = typings.aureliaBinding.mod.^.asInstanceOf[js.Dynamic].applyDynamic("enqueueBindingConnect")(binding.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def getChangeRecords(): js.Any = typings.aureliaBinding.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getChangeRecords")().asInstanceOf[js.Any]
  
  @scala.inline
  def getContextFor(name: java.lang.String, scope: typings.aureliaBinding.mod.Scope): js.Any = (typings.aureliaBinding.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getContextFor")(name.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def getContextFor(name: java.lang.String, scope: typings.aureliaBinding.mod.Scope, ancestor: scala.Double): js.Any = (typings.aureliaBinding.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getContextFor")(name.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], ancestor.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def hasDeclaredDependencies(descriptor: typings.std.PropertyDescriptor): scala.Boolean = typings.aureliaBinding.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasDeclaredDependencies")(descriptor.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def mergeSplice(splices: js.Any, index: scala.Double, removed: js.Any, addedCount: scala.Double): js.Any = (typings.aureliaBinding.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mergeSplice")(splices.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removed.asInstanceOf[js.Any], addedCount.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def observable(): js.Any = typings.aureliaBinding.mod.^.asInstanceOf[js.Dynamic].applyDynamic("observable")().asInstanceOf[js.Any]
  @scala.inline
  def observable(targetOrConfig: js.UndefOr[scala.Nothing], key: js.UndefOr[scala.Nothing], descriptor: js.Any): js.Any = (typings.aureliaBinding.mod.^.asInstanceOf[js.Dynamic].applyDynamic("observable")(targetOrConfig.asInstanceOf[js.Any], key.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def observable(targetOrConfig: js.UndefOr[scala.Nothing], key: js.Any): js.Any = (typings.aureliaBinding.mod.^.asInstanceOf[js.Dynamic].applyDynamic("observable")(targetOrConfig.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def observable(targetOrConfig: js.UndefOr[scala.Nothing], key: js.Any, descriptor: js.Any): js.Any = (typings.aureliaBinding.mod.^.asInstanceOf[js.Dynamic].applyDynamic("observable")(targetOrConfig.asInstanceOf[js.Any], key.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def observable(targetOrConfig: js.Object): js.Any = typings.aureliaBinding.mod.^.asInstanceOf[js.Dynamic].applyDynamic("observable")(targetOrConfig.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def observable(targetOrConfig: js.Object, key: js.UndefOr[scala.Nothing], descriptor: js.Any): js.Any = (typings.aureliaBinding.mod.^.asInstanceOf[js.Dynamic].applyDynamic("observable")(targetOrConfig.asInstanceOf[js.Any], key.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def observable(targetOrConfig: js.Object, key: js.Any): js.Any = (typings.aureliaBinding.mod.^.asInstanceOf[js.Dynamic].applyDynamic("observable")(targetOrConfig.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def observable(targetOrConfig: js.Object, key: js.Any, descriptor: js.Any): js.Any = (typings.aureliaBinding.mod.^.asInstanceOf[js.Dynamic].applyDynamic("observable")(targetOrConfig.asInstanceOf[js.Any], key.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def setConnectQueueThreshold(value: scala.Double): scala.Unit = typings.aureliaBinding.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setConnectQueueThreshold")(value.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def signalBindings(name: java.lang.String): scala.Unit = typings.aureliaBinding.mod.^.asInstanceOf[js.Dynamic].applyDynamic("signalBindings")(name.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def sourceContext: java.lang.String = typings.aureliaBinding.mod.^.asInstanceOf[js.Dynamic].selectDynamic("sourceContext").asInstanceOf[java.lang.String]
  
  @scala.inline
  def subscriberCollection(): js.Any = typings.aureliaBinding.mod.^.asInstanceOf[js.Dynamic].applyDynamic("subscriberCollection")().asInstanceOf[js.Any]
  
  @scala.inline
  def targetContext: java.lang.String = typings.aureliaBinding.mod.^.asInstanceOf[js.Dynamic].selectDynamic("targetContext").asInstanceOf[java.lang.String]
  
  @scala.inline
  def valueConverter(name: java.lang.String): js.Any = typings.aureliaBinding.mod.^.asInstanceOf[js.Dynamic].applyDynamic("valueConverter")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
