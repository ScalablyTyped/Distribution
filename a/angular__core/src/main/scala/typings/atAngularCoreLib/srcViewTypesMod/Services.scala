package typings
package atAngularCoreLib.srcViewTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Services extends js.Object {
  @JSName("handleEvent")
  var handleEvent_Original: ViewHandleEventFn = js.native
  def checkAndUpdateView(view: ViewData): scala.Unit = js.native
  def checkNoChangesView(view: ViewData): scala.Unit = js.native
  def clearOverrides(): scala.Unit = js.native
  def createComponentView(parentView: ViewData, nodeDef: NodeDef, viewDef: ViewDefinition, hostElement: js.Any): ViewData = js.native
  def createDebugContext(view: ViewData, nodeIndex: scala.Double): DebugContext = js.native
  def createEmbeddedView(parent: ViewData, anchorDef: NodeDef, viewDef: ViewDefinition): ViewData = js.native
  def createEmbeddedView(parent: ViewData, anchorDef: NodeDef, viewDef: ViewDefinition, context: js.Any): ViewData = js.native
  def createNgModuleRef(
    moduleType: atAngularCoreLib.srcTypeMod.Type[_],
    parent: atAngularCoreLib.srcDiMod.Injector,
    bootstrapComponents: js.Array[atAngularCoreLib.srcTypeMod.Type[_]],
    `def`: NgModuleDefinition
  ): atAngularCoreLib.srcLinkerNgUnderscoreModuleUnderscoreFactoryMod.NgModuleRef[_] = js.native
  def createRootView(
    injector: atAngularCoreLib.srcDiMod.Injector,
    projectableNodes: js.Array[js.Array[_]],
    rootSelectorOrNode: java.lang.String,
    `def`: ViewDefinition,
    ngModule: atAngularCoreLib.srcLinkerNgUnderscoreModuleUnderscoreFactoryMod.NgModuleRef[_]
  ): ViewData = js.native
  def createRootView(
    injector: atAngularCoreLib.srcDiMod.Injector,
    projectableNodes: js.Array[js.Array[_]],
    rootSelectorOrNode: java.lang.String,
    `def`: ViewDefinition,
    ngModule: atAngularCoreLib.srcLinkerNgUnderscoreModuleUnderscoreFactoryMod.NgModuleRef[_],
    context: js.Any
  ): ViewData = js.native
  def createRootView(
    injector: atAngularCoreLib.srcDiMod.Injector,
    projectableNodes: js.Array[js.Array[_]],
    rootSelectorOrNode: js.Any,
    `def`: ViewDefinition,
    ngModule: atAngularCoreLib.srcLinkerNgUnderscoreModuleUnderscoreFactoryMod.NgModuleRef[_]
  ): ViewData = js.native
  def createRootView(
    injector: atAngularCoreLib.srcDiMod.Injector,
    projectableNodes: js.Array[js.Array[_]],
    rootSelectorOrNode: js.Any,
    `def`: ViewDefinition,
    ngModule: atAngularCoreLib.srcLinkerNgUnderscoreModuleUnderscoreFactoryMod.NgModuleRef[_],
    context: js.Any
  ): ViewData = js.native
  def destroyView(view: ViewData): scala.Unit = js.native
  def dirtyParentQueries(view: ViewData): scala.Unit = js.native
  def handleEvent(view: ViewData, nodeIndex: scala.Double, eventName: java.lang.String, event: js.Any): scala.Boolean = js.native
  def overrideComponentView(
    compType: atAngularCoreLib.srcTypeMod.Type[_],
    compFactory: atAngularCoreLib.srcLinkerComponentUnderscoreFactoryMod.ComponentFactory[_]
  ): scala.Unit = js.native
  def overrideProvider(`override`: ProviderOverride): scala.Unit = js.native
  def resolveDep(view: ViewData, elDef: NodeDef, allowPrivateServices: scala.Boolean, depDef: DepDef): js.Any = js.native
  def resolveDep(
    view: ViewData,
    elDef: NodeDef,
    allowPrivateServices: scala.Boolean,
    depDef: DepDef,
    notFoundValue: js.Any
  ): js.Any = js.native
  def resolveDep(view: ViewData, elDef: scala.Null, allowPrivateServices: scala.Boolean, depDef: DepDef): js.Any = js.native
  def resolveDep(
    view: ViewData,
    elDef: scala.Null,
    allowPrivateServices: scala.Boolean,
    depDef: DepDef,
    notFoundValue: js.Any
  ): js.Any = js.native
  def setCurrentNode(view: ViewData, nodeIndex: scala.Double): scala.Unit = js.native
  def updateDirectives(view: ViewData, checkType: CheckType): scala.Unit = js.native
  def updateRenderer(view: ViewData, checkType: CheckType): scala.Unit = js.native
}

