package typings.applicationinsightsJs.Microsoft.ApplicationInsights.Context

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOperation extends js.Object {
  /**
    * Operation id
    */
  var id: String = js.native
  /**
    * Operation name
    */
  var name: String = js.native
  /**
    * Parent operation id
    */
  var parentId: String = js.native
  /**
    * Root operation id
    */
  var rootId: String = js.native
  /**
    * Synthetic source of the operation
    */
  var syntheticSource: String = js.native
}

object IOperation {
  @scala.inline
  def apply(id: String, name: String, parentId: String, rootId: String, syntheticSource: String): IOperation = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any], rootId = rootId.asInstanceOf[js.Any], syntheticSource = syntheticSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOperation]
  }
  @scala.inline
  implicit class IOperationOps[Self <: IOperation] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentId(value: String): Self = this.set("parentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootId(value: String): Self = this.set("rootId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSyntheticSource(value: String): Self = this.set("syntheticSource", value.asInstanceOf[js.Any])
  }
  
}

