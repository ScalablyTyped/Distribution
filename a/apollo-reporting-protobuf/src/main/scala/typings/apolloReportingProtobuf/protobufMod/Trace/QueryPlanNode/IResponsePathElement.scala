package typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ResponsePathElement. */
@js.native
trait IResponsePathElement extends js.Object {
  
  /** ResponsePathElement fieldName */
  var fieldName: js.UndefOr[String | Null] = js.native
  
  /** ResponsePathElement index */
  var index: js.UndefOr[Double | Null] = js.native
}
object IResponsePathElement {
  
  @scala.inline
  def apply(): IResponsePathElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResponsePathElement]
  }
  
  @scala.inline
  implicit class IResponsePathElementOps[Self <: IResponsePathElement] (val x: Self) extends AnyVal {
    
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
    def setFieldName(value: String): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldName: Self = this.set("fieldName", js.undefined)
    
    @scala.inline
    def setFieldNameNull: Self = this.set("fieldName", null)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setIndexNull: Self = this.set("index", null)
  }
}
