package typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Node. */
trait INode extends js.Object {
  /** Node cachePolicy */
  var cachePolicy: js.UndefOr[ICachePolicy | Null] = js.undefined
  /** Node child */
  var child: js.UndefOr[js.Array[INode] | Null] = js.undefined
  /** Node endTime */
  var endTime: js.UndefOr[Double | Null] = js.undefined
  /** Node error */
  var error: js.UndefOr[js.Array[IError] | Null] = js.undefined
  /** Node index */
  var index: js.UndefOr[Double | Null] = js.undefined
  /** Node originalFieldName */
  var originalFieldName: js.UndefOr[String | Null] = js.undefined
  /** Node parentType */
  var parentType: js.UndefOr[String | Null] = js.undefined
  /** Node responseName */
  var responseName: js.UndefOr[String | Null] = js.undefined
  /** Node startTime */
  var startTime: js.UndefOr[Double | Null] = js.undefined
  /** Node type */
  var `type`: js.UndefOr[String | Null] = js.undefined
}

object INode {
  @scala.inline
  def apply(
    cachePolicy: ICachePolicy = null,
    child: js.Array[INode] = null,
    endTime: Int | Double = null,
    error: js.Array[IError] = null,
    index: Int | Double = null,
    originalFieldName: String = null,
    parentType: String = null,
    responseName: String = null,
    startTime: Int | Double = null,
    `type`: String = null
  ): INode = {
    val __obj = js.Dynamic.literal()
    if (cachePolicy != null) __obj.updateDynamic("cachePolicy")(cachePolicy.asInstanceOf[js.Any])
    if (child != null) __obj.updateDynamic("child")(child.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (originalFieldName != null) __obj.updateDynamic("originalFieldName")(originalFieldName.asInstanceOf[js.Any])
    if (parentType != null) __obj.updateDynamic("parentType")(parentType.asInstanceOf[js.Any])
    if (responseName != null) __obj.updateDynamic("responseName")(responseName.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[INode]
  }
}

