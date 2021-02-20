package typings.apolloReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloReportingProtobuf.protobufMod.google.protobuf.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IReport extends StObject {
  
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
  implicit class IReportMutableBuilder[Self <: IReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: ITimestamp): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setHeader(value: IReportHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderNull: Self = StObject.set(x, "header", null)
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setTracesPerQuery(value: StringDictionary[ITracesAndStats]): Self = StObject.set(x, "tracesPerQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracesPerQueryNull: Self = StObject.set(x, "tracesPerQuery", null)
    
    @scala.inline
    def setTracesPerQueryUndefined: Self = StObject.set(x, "tracesPerQuery", js.undefined)
  }
}
