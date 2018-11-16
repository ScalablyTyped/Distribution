package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetaProperties extends js.Object {
  val Application: js.Any = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val Parent: js.Any = js.native
  val SchemaXml: java.lang.String = js.native
  val ValidationError: java.lang.String = js.native
  def apply(Index: java.lang.String): MetaProperty = js.native
  def apply(Index: scala.Double): MetaProperty = js.native
  def GetItemByInternalName(InternalName: java.lang.String): MetaProperty = js.native
  def Item(Index: java.lang.String): MetaProperty = js.native
  def Item(Index: scala.Double): MetaProperty = js.native
  def Validate(): java.lang.String = js.native
}

