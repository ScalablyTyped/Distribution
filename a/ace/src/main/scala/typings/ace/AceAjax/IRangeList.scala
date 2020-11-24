package typings.ace.AceAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRangeList extends js.Object {
  
  def add(ranges: Range): Unit = js.native
  
  def addList(ranges: js.Array[Range]): Unit = js.native
  
  def merge(): js.Array[Range] = js.native
  
  def pointIndex(pos: Position): Unit = js.native
  def pointIndex(pos: Position, startIndex: Double): Unit = js.native
  
  var ranges: js.Array[Range] = js.native
  
  def substractPoint(pos: Position): Unit = js.native
}
