package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportExportSpecification extends js.Object {
  @JSName("Access.ImportExportSpecification_typekey")
  var AccessDotImportExportSpecification_typekey: ImportExportSpecification = js.native
  val Application: typings.activexAccess.Access.Application = js.native
  var Description: String = js.native
  var Name: String = js.native
  val Parent: js.Any = js.native
  var XML: String = js.native
  def Delete(): Unit = js.native
  def Execute(): Unit = js.native
  def Execute(Prompt: Boolean): Unit = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
}

