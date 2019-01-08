package typings
package atAngularCoreLib.srcDebugDebugUnderscoreNodeMod

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

