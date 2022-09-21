package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.PaymentScheduleType")
@js.native
open class PaymentScheduleType () extends StObject {
  def this(obj: typings.authorizenet.anon.Interval) = this()
  
  def getInterval(): typings.authorizenet.mod.APIContracts.PaymentScheduleType.Interval = js.native
  
  def getStartDate(): String = js.native
  
  def getTotalOccurrences(): String | Double = js.native
  
  def getTrialOccurrences(): String | Double = js.native
  
  var interval: typings.authorizenet.mod.APIContracts.PaymentScheduleType.Interval = js.native
  
  def setInterval(p_interval: typings.authorizenet.mod.APIContracts.PaymentScheduleType.Interval): Unit = js.native
  
  def setStartDate(p_startDate: String): Unit = js.native
  
  def setTotalOccurrences(p_totalOccurrences: String): Unit = js.native
  def setTotalOccurrences(p_totalOccurrences: Double): Unit = js.native
  
  def setTrialOccurrences(p_trialOccurrences: String): Unit = js.native
  def setTrialOccurrences(p_trialOccurrences: Double): Unit = js.native
  
  var startDate: String = js.native
  
  var totalOccurrences: String | Double = js.native
  
  var trialOccurrences: String | Double = js.native
}
object PaymentScheduleType {
  
  @JSImport("authorizenet", "APIContracts.PaymentScheduleType.Interval")
  @js.native
  open class Interval () extends StObject {
    def this(obj: typings.authorizenet.anon.Unit) = this()
    
    def getLength(): String = js.native
    
    def getUnit(): String = js.native
    
    var length: String = js.native
    
    def setLength(p_length: String): Unit = js.native
    def setLength(p_length: Double): Unit = js.native
    
    def setUnit(p_unit: String): Unit = js.native
    
    var unit: String = js.native
  }
}
