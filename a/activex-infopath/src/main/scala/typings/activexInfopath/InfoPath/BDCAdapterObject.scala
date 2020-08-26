package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BDCAdapterObject extends js.Object {
  val EntityName: String = js.native
  val EntityNamespace: String = js.native
  @JSName("InfoPath.BDCAdapterObject_typekey")
  var InfoPathDotBDCAdapterObject_typekey: BDCAdapterObject = js.native
  val LOBSystemInstance: String = js.native
  val Name: String = js.native
  val QueryAllowed: Boolean = js.native
  val SpecificFinder: String = js.native
  val SubmitAdapterName: String = js.native
  val SubmitAllowed: Boolean = js.native
  def Query(): Unit = js.native
  def Submit(): Unit = js.native
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
  @scala.inline
  implicit class BDCAdapterObjectOps[Self <: BDCAdapterObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEntityName(value: String): Self = this.set("EntityName", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntityNamespace(value: String): Self = this.set("EntityNamespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfoPathDotBDCAdapterObject_typekey(value: BDCAdapterObject): Self = this.set("InfoPath.BDCAdapterObject_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setLOBSystemInstance(value: String): Self = this.set("LOBSystemInstance", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuery(value: () => Unit): Self = this.set("Query", js.Any.fromFunction0(value))
    @scala.inline
    def setQueryAllowed(value: Boolean): Self = this.set("QueryAllowed", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpecificFinder(value: String): Self = this.set("SpecificFinder", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubmit(value: () => Unit): Self = this.set("Submit", js.Any.fromFunction0(value))
    @scala.inline
    def setSubmitAdapterName(value: String): Self = this.set("SubmitAdapterName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubmitAllowed(value: Boolean): Self = this.set("SubmitAllowed", value.asInstanceOf[js.Any])
  }
  
}

