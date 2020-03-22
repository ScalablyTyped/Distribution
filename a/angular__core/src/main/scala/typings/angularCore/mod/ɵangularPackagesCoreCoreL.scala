package typings.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.angularCore.mod.DebugNode because var conflicts: componentInstance, context, injector, providerTokens, references. Inlined 
- typings.angularCore.mod.DebugElement because var conflicts: componentInstance, context, injector, providerTokens, references. Inlined name, properties, attributes, classes, styles, childNodes, nativeElement, children, query, queryAll, queryAllNodes, triggerEventHandler */ @JSImport("@angular/core", "\u0275angular_packages_core_core_l")
@js.native
class ɵangularPackagesCoreCoreL protected () extends ɵangularPackagesCoreCoreK {
  def this(nativeNode: js.Any, parent: js.Any, _debugContext: ɵangularPackagesCoreCoreW) = this()
  val attributes: StringDictionary[Null | String] = js.native
  val childNodes: js.Array[DebugNode] = js.native
  @JSName("children")
  val children_FɵangularPackagesCoreCoreL: js.Array[DebugElement] = js.native
  val classes: StringDictionary[Boolean] = js.native
  val name: String = js.native
  val nativeElement: js.Any = js.native
  val properties: StringDictionary[js.Any] = js.native
  val styles: StringDictionary[Null | String] = js.native
  def addChild(child: DebugNode): Unit = js.native
  def children(): js.Array[DebugElement] = js.native
  def insertBefore(refChild: DebugNode, newChild: DebugNode): Unit = js.native
  def insertChildrenAfter(child: DebugNode, newChildren: js.Array[DebugNode]): Unit = js.native
  def query(predicate: Predicate[DebugElement]): DebugElement = js.native
  def queryAll(predicate: Predicate[DebugElement]): js.Array[DebugElement] = js.native
  def queryAllNodes(predicate: Predicate[DebugNode]): js.Array[DebugNode] = js.native
  def removeChild(child: DebugNode): Unit = js.native
  def triggerEventHandler(eventName: String, eventObj: js.Any): Unit = js.native
}

