package typings.activexDashAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:interface-name
@js.native
trait ImportExportSpecifications extends js.Object {
  val Application: typings.activexDashAccess.Access.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  def apply(Index: String): ImportExportSpecification = js.native
  def apply(Index: Double): ImportExportSpecification = js.native
  def Add(Name: String, SpecificationDefinition: String): ImportExportSpecification = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
  def Item(Index: String): ImportExportSpecification = js.native
  def Item(Index: Double): ImportExportSpecification = js.native
}

