package typings.awsLambda.mskMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.awsLambdaStrings.awsColonkafka
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MSKEvent extends js.Object {
  
  var eventSource: awsColonkafka = js.native
  
  var eventSourceArn: String = js.native
  
  var records: StringDictionary[js.Array[MSKRecord]] = js.native
}
object MSKEvent {
  
  @scala.inline
  def apply(eventSource: awsColonkafka, eventSourceArn: String, records: StringDictionary[js.Array[MSKRecord]]): MSKEvent = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], eventSourceArn = eventSourceArn.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSKEvent]
  }
  
  @scala.inline
  implicit class MSKEventOps[Self <: MSKEvent] (val x: Self) extends AnyVal {
    
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
    def setEventSource(value: awsColonkafka): Self = this.set("eventSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventSourceArn(value: String): Self = this.set("eventSourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecords(value: StringDictionary[js.Array[MSKRecord]]): Self = this.set("records", value.asInstanceOf[js.Any])
  }
}
