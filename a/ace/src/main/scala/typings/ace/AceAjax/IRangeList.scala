package typings.ace.AceAjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRangeList extends StObject {
  
  def add(ranges: Range): Unit = js.native
  
  def addList(ranges: js.Array[Range]): Unit = js.native
  
  def merge(): js.Array[Range] = js.native
  
  def pointIndex(pos: Position): Unit = js.native
  def pointIndex(pos: Position, startIndex: Double): Unit = js.native
  
  var ranges: js.Array[Range] = js.native
  
  def substractPoint(pos: Position): Unit = js.native
}
