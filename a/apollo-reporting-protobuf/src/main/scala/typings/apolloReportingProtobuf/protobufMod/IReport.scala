package typings.apolloReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloReportingProtobuf.protobufMod.google.protobuf.ITimestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IReport extends js.Object {
  
  /** Report endTime */
  var endTime: js.UndefOr[ITimestamp | Null] = js.native
  
  /** Report header */
  var header: js.UndefOr[IReportHeader | Null] = js.native
  
  /** Report tracesPerQuery */
  var tracesPerQuery: js.UndefOr[StringDictionary[ITracesAndStats] | Null] = js.native
}
object IReport {
  
  @scala.inline
  def apply(): IReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IReport]
  }
  
  @scala.inline
  implicit class IReportOps[Self <: IReport] (val x: Self) extends AnyVal {
    
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
    def setEndTime(value: ITimestamp): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setEndTimeNull: Self = this.set("endTime", null)
    
    @scala.inline
    def setHeader(value: IReportHeader): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setHeaderNull: Self = this.set("header", null)
    
    @scala.inline
    def setTracesPerQuery(value: StringDictionary[ITracesAndStats]): Self = this.set("tracesPerQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTracesPerQuery: Self = this.set("tracesPerQuery", js.undefined)
    
    @scala.inline
    def setTracesPerQueryNull: Self = this.set("tracesPerQuery", null)
  }
}
