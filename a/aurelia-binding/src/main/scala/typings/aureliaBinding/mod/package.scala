package typings.aureliaBinding.mod

import typings.aureliaBinding.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def bindingBehavior(name: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("bindingBehavior")(name.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def camelCase(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelCase")(name.asInstanceOf[js.Any]).asInstanceOf[String]

inline def computedFrom(propertyNames: String*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("computedFrom")(propertyNames.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]

inline def connectBindingToSignal(binding: Binding, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectBindingToSignal")(binding.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def connectable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("connectable")().asInstanceOf[Unit]

inline def createOverrideContext(bindingContext: Any): OverrideContext = ^.asInstanceOf[js.Dynamic].applyDynamic("createOverrideContext")(bindingContext.asInstanceOf[js.Any]).asInstanceOf[OverrideContext]
inline def createOverrideContext(bindingContext: Any, parentOverrideContext: OverrideContext): OverrideContext = (^.asInstanceOf[js.Dynamic].applyDynamic("createOverrideContext")(bindingContext.asInstanceOf[js.Any], parentOverrideContext.asInstanceOf[js.Any])).asInstanceOf[OverrideContext]

inline def createScopeForTest(bindingContext: Any): Scope = ^.asInstanceOf[js.Dynamic].applyDynamic("createScopeForTest")(bindingContext.asInstanceOf[js.Any]).asInstanceOf[Scope]
inline def createScopeForTest(bindingContext: Any, parentBindingContext: Any): Scope = (^.asInstanceOf[js.Dynamic].applyDynamic("createScopeForTest")(bindingContext.asInstanceOf[js.Any], parentBindingContext.asInstanceOf[js.Any])).asInstanceOf[Scope]

inline def declarePropertyDependencies(ctor: Any, propertyName: String, dependencies: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("declarePropertyDependencies")(ctor.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def disableConnectQueue(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableConnectQueue")().asInstanceOf[Unit]

inline def enableConnectQueue(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableConnectQueue")().asInstanceOf[Unit]

inline def enqueueBindingConnect(binding: Binding): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enqueueBindingConnect")(binding.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def getChangeRecords(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getChangeRecords")().asInstanceOf[Any]

inline def getContextFor(name: String, scope: Scope): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getContextFor")(name.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def getContextFor(name: String, scope: Scope, ancestor: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getContextFor")(name.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], ancestor.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def hasDeclaredDependencies(descriptor: js.PropertyDescriptor): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasDeclaredDependencies")(descriptor.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def mergeSplice(splices: Any, index: Double, removed: Any, addedCount: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeSplice")(splices.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removed.asInstanceOf[js.Any], addedCount.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def observable(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("observable")().asInstanceOf[Any]
inline def observable(targetOrConfig: js.Object): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("observable")(targetOrConfig.asInstanceOf[js.Any]).asInstanceOf[Any]
inline def observable(targetOrConfig: js.Object, key: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("observable")(targetOrConfig.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def observable(targetOrConfig: js.Object, key: Any, descriptor: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("observable")(targetOrConfig.asInstanceOf[js.Any], key.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def observable(targetOrConfig: js.Object, key: Unit, descriptor: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("observable")(targetOrConfig.asInstanceOf[js.Any], key.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def observable(targetOrConfig: Unit, key: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("observable")(targetOrConfig.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def observable(targetOrConfig: Unit, key: Any, descriptor: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("observable")(targetOrConfig.asInstanceOf[js.Any], key.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def observable(targetOrConfig: Unit, key: Unit, descriptor: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("observable")(targetOrConfig.asInstanceOf[js.Any], key.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def setConnectQueueThreshold(value: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setConnectQueueThreshold")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def signalBindings(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("signalBindings")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def sourceContext: String = ^.asInstanceOf[js.Dynamic].selectDynamic("sourceContext").asInstanceOf[String]

inline def subscriberCollection(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("subscriberCollection")().asInstanceOf[Any]

inline def targetContext: String = ^.asInstanceOf[js.Dynamic].selectDynamic("targetContext").asInstanceOf[String]

inline def valueConverter(name: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("valueConverter")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
