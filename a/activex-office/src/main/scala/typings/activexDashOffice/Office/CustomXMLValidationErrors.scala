package typings.activexDashOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomXMLValidationErrors extends js.Object {
  val Application: js.Any = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  def apply(Index: Double): CustomXMLValidationError = js.native
  /**
    * @param ErrorText [ErrorText='']
    * @param ClearedOnUpdate [ClearedOnUpdate=true]
    */
  def Add(Node: CustomXMLNode, ErrorName: String): Unit = js.native
  def Add(Node: CustomXMLNode, ErrorName: String, ErrorText: String): Unit = js.native
  def Add(Node: CustomXMLNode, ErrorName: String, ErrorText: String, ClearedOnUpdate: Boolean): Unit = js.native
  def Item(Index: Double): CustomXMLValidationError = js.native
}

