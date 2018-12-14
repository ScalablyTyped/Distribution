package typings
package atAngularCoreLib.srcDebugDebugUnderscoreNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/debug/debug_node", "DebugElement")
@js.native
class DebugElement protected () extends DebugNode {
  def this(nativeNode: js.Any, parent: js.Any, _debugContext: atAngularCoreLib.srcViewMod.DebugContext) = this()
  var attributes: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Null] = js.native
  var childNodes: js.Array[DebugNode] = js.native
  val children: js.Array[DebugElement] = js.native
  var classes: org.scalablytyped.runtime.StringDictionary[scala.Boolean] = js.native
  var name: java.lang.String = js.native
  var nativeElement: js.Any = js.native
  var properties: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  var styles: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Null] = js.native
  def addChild(child: DebugNode): scala.Unit = js.native
  def insertBefore(refChild: DebugNode, newChild: DebugNode): scala.Unit = js.native
  def insertChildrenAfter(child: DebugNode, newChildren: js.Array[DebugNode]): scala.Unit = js.native
  def query(predicate: Predicate[DebugElement]): DebugElement = js.native
  def queryAll(predicate: Predicate[DebugElement]): js.Array[DebugElement] = js.native
  def queryAllNodes(predicate: Predicate[DebugNode]): js.Array[DebugNode] = js.native
  def removeChild(child: DebugNode): scala.Unit = js.native
  def triggerEventHandler(eventName: java.lang.String, eventObj: js.Any): scala.Unit = js.native
}

