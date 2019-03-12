package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:interface-name
@js.native
trait ImportExportSpecifications extends js.Object {
  val Application: activexDashAccessLib.AccessNs.Application = js.native
  val Count: scala.Double = js.native
  val Parent: js.Any = js.native
  def apply(Index: java.lang.String): ImportExportSpecification = js.native
  def apply(Index: scala.Double): ImportExportSpecification = js.native
  def Add(Name: java.lang.String, SpecificationDefinition: java.lang.String): ImportExportSpecification = js.native
  def IsMemberSafe(dispid: scala.Double): scala.Boolean = js.native
  def Item(Index: java.lang.String): ImportExportSpecification = js.native
  def Item(Index: scala.Double): ImportExportSpecification = js.native
}

