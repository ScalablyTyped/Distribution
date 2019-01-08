package typings
package atAngularCoreLib.srcDebugDebugUnderscoreNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/debug/debug_node", "DebugElement__PRE_R3__")
@js.native
class `DebugElement__PRE_R3__` protected ()
  extends `DebugNode__PRE_R3__`
     with DebugElement {
  def this(nativeNode: js.Any, parent: js.Any, _debugContext: atAngularCoreLib.srcViewMod.DebugContext) = this()
  /* CompleteClass */
  override val attributes: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Null] = js.native
  /* CompleteClass */
  override val childNodes: js.Array[DebugNode] = js.native
  /* CompleteClass */
  override val children: js.Array[DebugElement] = js.native
  /* CompleteClass */
  override val classes: org.scalablytyped.runtime.StringDictionary[scala.Boolean] = js.native
  /* InferMemberOverrides */
  override val componentInstance: js.Any = js.native
  /* InferMemberOverrides */
  override val context: js.Any = js.native
  /* InferMemberOverrides */
  override val injector: atAngularCoreLib.srcDiMod.Injector = js.native
  /* InferMemberOverrides */
  override val listeners: js.Array[EventListener] = js.native
  /* CompleteClass */
  override val name: java.lang.String = js.native
  /* CompleteClass */
  override val nativeElement: js.Any = js.native
  /* InferMemberOverrides */
  override val nativeNode: js.Any = js.native
  /* InferMemberOverrides */
  override val parent: DebugElement | scala.Null = js.native
  /* CompleteClass */
  override val properties: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /* InferMemberOverrides */
  override val providerTokens: js.Array[_] = js.native
  /* InferMemberOverrides */
  override val references: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /* CompleteClass */
  override val styles: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Null] = js.native
  def addChild(child: DebugNode): scala.Unit = js.native
  def insertBefore(refChild: DebugNode, newChild: DebugNode): scala.Unit = js.native
  def insertChildrenAfter(child: DebugNode, newChildren: js.Array[DebugNode]): scala.Unit = js.native
  /* CompleteClass */
  override def query(predicate: Predicate[DebugElement]): DebugElement = js.native
  /* CompleteClass */
  override def queryAll(predicate: Predicate[DebugElement]): js.Array[DebugElement] = js.native
  /* CompleteClass */
  override def queryAllNodes(predicate: Predicate[DebugNode]): js.Array[DebugNode] = js.native
  def removeChild(child: DebugNode): scala.Unit = js.native
  /* CompleteClass */
  override def triggerEventHandler(eventName: java.lang.String, eventObj: js.Any): scala.Unit = js.native
}

