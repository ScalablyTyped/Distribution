package typings.agGrid.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Autowired(): js.Function = typings.agGrid.mod.^.asInstanceOf[js.Dynamic].applyDynamic("Autowired")().asInstanceOf[js.Function]
inline def Autowired(name: java.lang.String): js.Function = typings.agGrid.mod.^.asInstanceOf[js.Dynamic].applyDynamic("Autowired")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function]

inline def Bean(beanName: java.lang.String): js.Function = typings.agGrid.mod.^.asInstanceOf[js.Dynamic].applyDynamic("Bean")(beanName.asInstanceOf[js.Any]).asInstanceOf[js.Function]

inline def Listener(): js.Function = typings.agGrid.mod.^.asInstanceOf[js.Dynamic].applyDynamic("Listener")().asInstanceOf[js.Function]
inline def Listener(eventName: java.lang.String): js.Function = typings.agGrid.mod.^.asInstanceOf[js.Dynamic].applyDynamic("Listener")(eventName.asInstanceOf[js.Any]).asInstanceOf[js.Function]

inline def Optional(): js.Function = typings.agGrid.mod.^.asInstanceOf[js.Dynamic].applyDynamic("Optional")().asInstanceOf[js.Function]
inline def Optional(name: java.lang.String): js.Function = typings.agGrid.mod.^.asInstanceOf[js.Dynamic].applyDynamic("Optional")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function]

inline def PostConstruct(
  target: js.Object,
  methodName: java.lang.String,
  descriptor: typings.std.TypedPropertyDescriptor[js.Any]
): scala.Unit = (typings.agGrid.mod.^.asInstanceOf[js.Dynamic].applyDynamic("PostConstruct")(target.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def PreConstruct(
  target: js.Object,
  methodName: java.lang.String,
  descriptor: typings.std.TypedPropertyDescriptor[js.Any]
): scala.Unit = (typings.agGrid.mod.^.asInstanceOf[js.Dynamic].applyDynamic("PreConstruct")(target.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def PreDestroy(
  target: js.Object,
  methodName: java.lang.String,
  descriptor: typings.std.TypedPropertyDescriptor[js.Any]
): scala.Unit = (typings.agGrid.mod.^.asInstanceOf[js.Dynamic].applyDynamic("PreDestroy")(target.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def Qualifier(name: java.lang.String): js.Function = typings.agGrid.mod.^.asInstanceOf[js.Dynamic].applyDynamic("Qualifier")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function]

inline def QuerySelector(): js.Function = typings.agGrid.mod.^.asInstanceOf[js.Dynamic].applyDynamic("QuerySelector")().asInstanceOf[js.Function]
inline def QuerySelector(selector: java.lang.String): js.Function = typings.agGrid.mod.^.asInstanceOf[js.Dynamic].applyDynamic("QuerySelector")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Function]

inline def RefSelector(): js.Function = typings.agGrid.mod.^.asInstanceOf[js.Dynamic].applyDynamic("RefSelector")().asInstanceOf[js.Function]
inline def RefSelector(ref: java.lang.String): js.Function = typings.agGrid.mod.^.asInstanceOf[js.Dynamic].applyDynamic("RefSelector")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Function]

inline def defaultGroupComparator(
  valueA: js.Any,
  valueB: js.Any,
  nodeA: typings.agGrid.rowNodeMod.RowNode,
  nodeB: typings.agGrid.rowNodeMod.RowNode
): scala.Double = (typings.agGrid.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defaultGroupComparator")(valueA.asInstanceOf[js.Any], valueB.asInstanceOf[js.Any], nodeA.asInstanceOf[js.Any], nodeB.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
inline def defaultGroupComparator(
  valueA: js.Any,
  valueB: js.Any,
  nodeA: typings.agGrid.rowNodeMod.RowNode,
  nodeB: typings.agGrid.rowNodeMod.RowNode,
  accentedCompare: scala.Boolean
): scala.Double = (typings.agGrid.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defaultGroupComparator")(valueA.asInstanceOf[js.Any], valueB.asInstanceOf[js.Any], nodeA.asInstanceOf[js.Any], nodeB.asInstanceOf[js.Any], accentedCompare.asInstanceOf[js.Any])).asInstanceOf[scala.Double]

inline def initialiseAgGridWithAngular1(angular: js.Any): scala.Unit = typings.agGrid.mod.^.asInstanceOf[js.Dynamic].applyDynamic("initialiseAgGridWithAngular1")(angular.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

inline def initialiseAgGridWithWebComponents(): scala.Unit = typings.agGrid.mod.^.asInstanceOf[js.Dynamic].applyDynamic("initialiseAgGridWithWebComponents")().asInstanceOf[scala.Unit]

inline def simpleHttpRequest(params: typings.agGrid.simpleHttpRequestMod.SimpleHttpRequestParams): typings.agGrid.utilsMod.Promise[js.Any] = typings.agGrid.mod.^.asInstanceOf[js.Dynamic].applyDynamic("simpleHttpRequest")(params.asInstanceOf[js.Any]).asInstanceOf[typings.agGrid.utilsMod.Promise[js.Any]]
