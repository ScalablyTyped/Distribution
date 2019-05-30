package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugElement extends DebugNode {
  val attributes: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Null]
  val childNodes: js.Array[DebugNode]
  val children: js.Array[DebugElement]
  val classes: org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  val name: java.lang.String
  val nativeElement: js.Any
  val properties: org.scalablytyped.runtime.StringDictionary[js.Any]
  val styles: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Null]
  def query(predicate: Predicate[DebugElement]): DebugElement
  def queryAll(predicate: Predicate[DebugElement]): js.Array[DebugElement]
  def queryAllNodes(predicate: Predicate[DebugNode]): js.Array[DebugNode]
  def triggerEventHandler(eventName: java.lang.String, eventObj: js.Any): scala.Unit
}

@JSImport("@angular/core", "DebugElement")
@js.native
class DebugElementCls protected () extends DebugElement {
  def this(args: js.Any*) = this()
  /* CompleteClass */
  override val attributes: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Null] = js.native
  /* CompleteClass */
  override val childNodes: js.Array[DebugNode] = js.native
  /* CompleteClass */
  override val children: js.Array[DebugElement] = js.native
  /* CompleteClass */
  override val classes: org.scalablytyped.runtime.StringDictionary[scala.Boolean] = js.native
  /* CompleteClass */
  override val componentInstance: js.Any = js.native
  /* CompleteClass */
  override val context: js.Any = js.native
  /* CompleteClass */
  override val injector: Injector = js.native
  /* CompleteClass */
  override val listeners: js.Array[DebugEventListener] = js.native
  /* CompleteClass */
  override val name: java.lang.String = js.native
  /* CompleteClass */
  override val nativeElement: js.Any = js.native
  /* CompleteClass */
  override val nativeNode: js.Any = js.native
  /* CompleteClass */
  override val parent: DebugElement | scala.Null = js.native
  /* CompleteClass */
  override val properties: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /* CompleteClass */
  override val providerTokens: js.Array[_] = js.native
  /* CompleteClass */
  override val references: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /* CompleteClass */
  override val styles: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Null] = js.native
  /* CompleteClass */
  override def query(predicate: Predicate[DebugElement]): DebugElement = js.native
  /* CompleteClass */
  override def queryAll(predicate: Predicate[DebugElement]): js.Array[DebugElement] = js.native
  /* CompleteClass */
  override def queryAllNodes(predicate: Predicate[DebugNode]): js.Array[DebugNode] = js.native
  /* CompleteClass */
  override def triggerEventHandler(eventName: java.lang.String, eventObj: js.Any): scala.Unit = js.native
}

@JSImport("@angular/core", "DebugElement")
@js.native
object DebugElement
  extends org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, DebugElement]

