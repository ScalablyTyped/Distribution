package typings.atAngularCore.atAngularCoreMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugElement extends DebugNode {
  val attributes: StringDictionary[String | Null]
  val childNodes: js.Array[DebugNode]
  val children: js.Array[DebugElement]
  val classes: StringDictionary[Boolean]
  val name: String
  val nativeElement: js.Any
  val properties: StringDictionary[js.Any]
  val styles: StringDictionary[String | Null]
  def query(predicate: Predicate[DebugElement]): DebugElement
  def queryAll(predicate: Predicate[DebugElement]): js.Array[DebugElement]
  def queryAllNodes(predicate: Predicate[DebugNode]): js.Array[DebugNode]
  def triggerEventHandler(eventName: String, eventObj: js.Any): Unit
}

@JSImport("@angular/core", "DebugElement")
@js.native
class DebugElementCls protected () extends DebugElement {
  def this(args: js.Any*) = this()
  /* CompleteClass */
  override val attributes: StringDictionary[String | Null] = js.native
  /* CompleteClass */
  override val childNodes: js.Array[DebugNode] = js.native
  /* CompleteClass */
  override val children: js.Array[DebugElement] = js.native
  /* CompleteClass */
  override val classes: StringDictionary[Boolean] = js.native
  /* CompleteClass */
  override val componentInstance: js.Any = js.native
  /* CompleteClass */
  override val context: js.Any = js.native
  /* CompleteClass */
  override val injector: Injector = js.native
  /* CompleteClass */
  override val listeners: js.Array[DebugEventListener] = js.native
  /* CompleteClass */
  override val name: String = js.native
  /* CompleteClass */
  override val nativeElement: js.Any = js.native
  /* CompleteClass */
  override val nativeNode: js.Any = js.native
  /* CompleteClass */
  override val parent: DebugElement | Null = js.native
  /* CompleteClass */
  override val properties: StringDictionary[js.Any] = js.native
  /* CompleteClass */
  override val providerTokens: js.Array[_] = js.native
  /* CompleteClass */
  override val references: StringDictionary[js.Any] = js.native
  /* CompleteClass */
  override val styles: StringDictionary[String | Null] = js.native
  /* CompleteClass */
  override def query(predicate: Predicate[DebugElement]): DebugElement = js.native
  /* CompleteClass */
  override def queryAll(predicate: Predicate[DebugElement]): js.Array[DebugElement] = js.native
  /* CompleteClass */
  override def queryAllNodes(predicate: Predicate[DebugNode]): js.Array[DebugNode] = js.native
  /* CompleteClass */
  override def triggerEventHandler(eventName: String, eventObj: js.Any): Unit = js.native
}

@JSImport("@angular/core", "DebugElement")
@js.native
object DebugElement
  extends Instantiable1[/* args (repeated) */ js.Any, DebugElement]

