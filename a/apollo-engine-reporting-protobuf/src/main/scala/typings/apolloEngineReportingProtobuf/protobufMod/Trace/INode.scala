package typings.apolloEngineReportingProtobuf.protobufMod.Trace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Node. */
@js.native
trait INode extends js.Object {
  /** Node cachePolicy */
  var cachePolicy: js.UndefOr[ICachePolicy | Null] = js.native
  /** Node child */
  var child: js.UndefOr[js.Array[INode] | Null] = js.native
  /** Node endTime */
  var endTime: js.UndefOr[Double | Null] = js.native
  /** Node error */
  var error: js.UndefOr[js.Array[IError] | Null] = js.native
  /** Node index */
  var index: js.UndefOr[Double | Null] = js.native
  /** Node originalFieldName */
  var originalFieldName: js.UndefOr[String | Null] = js.native
  /** Node parentType */
  var parentType: js.UndefOr[String | Null] = js.native
  /** Node responseName */
  var responseName: js.UndefOr[String | Null] = js.native
  /** Node startTime */
  var startTime: js.UndefOr[Double | Null] = js.native
  /** Node type */
  var `type`: js.UndefOr[String | Null] = js.native
}

object INode {
  @scala.inline
  def apply(): INode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INode]
  }
  @scala.inline
  implicit class INodeOps[Self <: INode] (val x: Self) extends AnyVal {
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
    def setCachePolicy(value: ICachePolicy): Self = this.set("cachePolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCachePolicy: Self = this.set("cachePolicy", js.undefined)
    @scala.inline
    def setCachePolicyNull: Self = this.set("cachePolicy", null)
    @scala.inline
    def setChildVarargs(value: INode*): Self = this.set("child", js.Array(value :_*))
    @scala.inline
    def setChild(value: js.Array[INode]): Self = this.set("child", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChild: Self = this.set("child", js.undefined)
    @scala.inline
    def setChildNull: Self = this.set("child", null)
    @scala.inline
    def setEndTime(value: Double): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setEndTimeNull: Self = this.set("endTime", null)
    @scala.inline
    def setErrorVarargs(value: IError*): Self = this.set("error", js.Array(value :_*))
    @scala.inline
    def setError(value: js.Array[IError]): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setErrorNull: Self = this.set("error", null)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setIndexNull: Self = this.set("index", null)
    @scala.inline
    def setOriginalFieldName(value: String): Self = this.set("originalFieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalFieldName: Self = this.set("originalFieldName", js.undefined)
    @scala.inline
    def setOriginalFieldNameNull: Self = this.set("originalFieldName", null)
    @scala.inline
    def setParentType(value: String): Self = this.set("parentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentType: Self = this.set("parentType", js.undefined)
    @scala.inline
    def setParentTypeNull: Self = this.set("parentType", null)
    @scala.inline
    def setResponseName(value: String): Self = this.set("responseName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseName: Self = this.set("responseName", js.undefined)
    @scala.inline
    def setResponseNameNull: Self = this.set("responseName", null)
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    @scala.inline
    def setStartTimeNull: Self = this.set("startTime", null)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
  }
  
}

