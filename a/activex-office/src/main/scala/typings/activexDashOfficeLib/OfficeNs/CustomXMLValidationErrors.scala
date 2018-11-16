package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomXMLValidationErrors extends js.Object {
  val Application: js.Any = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val Parent: js.Any = js.native
  def apply(Index: scala.Double): CustomXMLValidationError = js.native
  /**
           * @param ErrorText [ErrorText='']
           * @param ClearedOnUpdate [ClearedOnUpdate=true]
           */
  def Add(Node: CustomXMLNode, ErrorName: java.lang.String): scala.Unit = js.native
  /**
           * @param ErrorText [ErrorText='']
           * @param ClearedOnUpdate [ClearedOnUpdate=true]
           */
  def Add(Node: CustomXMLNode, ErrorName: java.lang.String, ErrorText: java.lang.String): scala.Unit = js.native
  /**
           * @param ErrorText [ErrorText='']
           * @param ClearedOnUpdate [ClearedOnUpdate=true]
           */
  def Add(
    Node: CustomXMLNode,
    ErrorName: java.lang.String,
    ErrorText: java.lang.String,
    ClearedOnUpdate: scala.Boolean
  ): scala.Unit = js.native
  def Item(Index: scala.Double): CustomXMLValidationError = js.native
}

