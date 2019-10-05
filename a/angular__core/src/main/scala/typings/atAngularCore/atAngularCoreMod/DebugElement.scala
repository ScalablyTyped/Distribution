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
object DebugElement
  extends Instantiable1[/* args (repeated) */ js.Any, DebugElement]

