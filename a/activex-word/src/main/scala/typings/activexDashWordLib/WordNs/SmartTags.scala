package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.SmartTags")
@js.native
class SmartTags protected () extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val Parent: js.Any = js.native
  var `Word.SmartTags_typekey`: SmartTags = js.native
  def Add(Name: java.lang.String): SmartTag = js.native
  def Add(Name: java.lang.String, Range: js.Any): SmartTag = js.native
  def Add(Name: java.lang.String, Range: js.Any, Properties: js.Any): SmartTag = js.native
  def Item(Index: js.Any): SmartTag = js.native
  def SmartTagsByType(Name: java.lang.String): SmartTags = js.native
}

