package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentInspector extends js.Object {
  val Application: js.Any
  val Creator: Double
  val Description: String
  val Name: String
  @JSName("Office.DocumentInspector_typekey")
  var OfficeDotDocumentInspector_typekey: DocumentInspector
  val Parent: js.Any
  def Fix(Status: MsoDocInspectorStatus, Results: String): Unit
  def Inspect(Status: MsoDocInspectorStatus, Results: String): Unit
}

object DocumentInspector {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    Description: String,
    Fix: (MsoDocInspectorStatus, String) => Unit,
    Inspect: (MsoDocInspectorStatus, String) => Unit,
    Name: String,
    OfficeDotDocumentInspector_typekey: DocumentInspector,
    Parent: js.Any
  ): DocumentInspector = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Fix = js.Any.fromFunction2(Fix), Inspect = js.Any.fromFunction2(Inspect), Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.DocumentInspector_typekey")(OfficeDotDocumentInspector_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentInspector]
  }
}

