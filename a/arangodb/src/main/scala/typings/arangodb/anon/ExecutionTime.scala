package typings.arangodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecutionTime extends js.Object {
  
  var executionTime: Double = js.native
  
  var filtered: Double = js.native
  
  var fullCount: Double = js.native
  
  var httpRequests: Double = js.native
  
  var scannedFull: Double = js.native
  
  var scannedIndex: Double = js.native
  
  var writesExecuted: Double = js.native
  
  var writesIgnored: Double = js.native
}
object ExecutionTime {
  
  @scala.inline
  def apply(
    executionTime: Double,
    filtered: Double,
    fullCount: Double,
    httpRequests: Double,
    scannedFull: Double,
    scannedIndex: Double,
    writesExecuted: Double,
    writesIgnored: Double
  ): ExecutionTime = {
    val __obj = js.Dynamic.literal(executionTime = executionTime.asInstanceOf[js.Any], filtered = filtered.asInstanceOf[js.Any], fullCount = fullCount.asInstanceOf[js.Any], httpRequests = httpRequests.asInstanceOf[js.Any], scannedFull = scannedFull.asInstanceOf[js.Any], scannedIndex = scannedIndex.asInstanceOf[js.Any], writesExecuted = writesExecuted.asInstanceOf[js.Any], writesIgnored = writesIgnored.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionTime]
  }
  
  @scala.inline
  implicit class ExecutionTimeOps[Self <: ExecutionTime] (val x: Self) extends AnyVal {
    
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
    def setExecutionTime(value: Double): Self = this.set("executionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltered(value: Double): Self = this.set("filtered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullCount(value: Double): Self = this.set("fullCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpRequests(value: Double): Self = this.set("httpRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScannedFull(value: Double): Self = this.set("scannedFull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScannedIndex(value: Double): Self = this.set("scannedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritesExecuted(value: Double): Self = this.set("writesExecuted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritesIgnored(value: Double): Self = this.set("writesIgnored", value.asInstanceOf[js.Any])
  }
}
