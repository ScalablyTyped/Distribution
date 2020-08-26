package typings.angularCore.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebugElement extends DebugNode {
  val attributes: StringDictionary[String | Null] = js.native
  val childNodes: js.Array[DebugNode] = js.native
  val children: js.Array[DebugElement] = js.native
  val classes: StringDictionary[Boolean] = js.native
  val name: String = js.native
  val nativeElement: js.Any = js.native
  val properties: StringDictionary[js.Any] = js.native
  val styles: StringDictionary[String | Null] = js.native
  def query(predicate: Predicate[DebugElement]): DebugElement = js.native
  def queryAll(predicate: Predicate[DebugElement]): js.Array[DebugElement] = js.native
  def queryAllNodes(predicate: Predicate[DebugNode]): js.Array[DebugNode] = js.native
  def triggerEventHandler(eventName: String, eventObj: js.Any): Unit = js.native
}

@JSImport("@angular/core", "DebugElement")
@js.native
object DebugElement
  extends Instantiable1[/* args (repeated) */ js.Any, DebugElement]

