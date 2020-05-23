package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BDCAdapterObject extends js.Object {
  val EntityName: String
  val EntityNamespace: String
  @JSName("InfoPath.BDCAdapterObject_typekey")
  var InfoPathDotBDCAdapterObject_typekey: BDCAdapterObject
  val LOBSystemInstance: String
  val Name: String
  val QueryAllowed: Boolean
  val SpecificFinder: String
  val SubmitAdapterName: String
  val SubmitAllowed: Boolean
  def Query(): Unit
  def Submit(): Unit
}

object BDCAdapterObject {
  @scala.inline
  def apply(
    EntityName: String,
    EntityNamespace: String,
    InfoPathDotBDCAdapterObject_typekey: BDCAdapterObject,
    LOBSystemInstance: String,
    Name: String,
    Query: () => Unit,
    QueryAllowed: Boolean,
    SpecificFinder: String,
    Submit: () => Unit,
    SubmitAdapterName: String,
    SubmitAllowed: Boolean
  ): BDCAdapterObject = {
    val __obj = js.Dynamic.literal(EntityName = EntityName.asInstanceOf[js.Any], EntityNamespace = EntityNamespace.asInstanceOf[js.Any], LOBSystemInstance = LOBSystemInstance.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Query = js.Any.fromFunction0(Query), QueryAllowed = QueryAllowed.asInstanceOf[js.Any], SpecificFinder = SpecificFinder.asInstanceOf[js.Any], Submit = js.Any.fromFunction0(Submit), SubmitAdapterName = SubmitAdapterName.asInstanceOf[js.Any], SubmitAllowed = SubmitAllowed.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.BDCAdapterObject_typekey")(InfoPathDotBDCAdapterObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BDCAdapterObject]
  }
}

