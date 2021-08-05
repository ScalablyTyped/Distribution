package typings.arangodb.anon

import org.scalablytyped.runtime.StringDictionary
import typings.arangodb.queuesMod.Script
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arangodb.ArangoDB.Document<arangodb.@arangodb/foxx/queues.Job> */
trait DocumentJob
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var _from: js.UndefOr[String] = js.undefined
  
  var _id: String
  
  var _key: String
  
  var _rev: String
  
  var _to: js.UndefOr[String] = js.undefined
  
  def abort(): Unit
  @JSName("abort")
  var abort_Original: js.Function0[Unit]
  
  var created: Double
  
  var data: js.Any
  
  var delayUntil: Double
  
  var failure: js.UndefOr[String] = js.undefined
  
  var failures: js.Array[js.Object]
  
  var maxFailures: Double
  
  var modified: Double
  
  var queue: String
  
  var repeatDelay: Double
  
  var repeatTimes: Double
  
  var repeatUntil: Double
  
  var runFailures: Double
  
  var runs: Double
  
  var status: String
  
  var success: js.UndefOr[String] = js.undefined
  
  var `type`: Script
}
object DocumentJob {
  
  inline def apply(
    _id: String,
    _key: String,
    _rev: String,
    abort: () => Unit,
    created: Double,
    data: js.Any,
    delayUntil: Double,
    failures: js.Array[js.Object],
    maxFailures: Double,
    modified: Double,
    queue: String,
    repeatDelay: Double,
    repeatTimes: Double,
    repeatUntil: Double,
    runFailures: Double,
    runs: Double,
    status: String,
    `type`: Script
  ): DocumentJob = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _key = _key.asInstanceOf[js.Any], _rev = _rev.asInstanceOf[js.Any], abort = js.Any.fromFunction0(abort), created = created.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delayUntil = delayUntil.asInstanceOf[js.Any], failures = failures.asInstanceOf[js.Any], maxFailures = maxFailures.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], repeatDelay = repeatDelay.asInstanceOf[js.Any], repeatTimes = repeatTimes.asInstanceOf[js.Any], repeatUntil = repeatUntil.asInstanceOf[js.Any], runFailures = runFailures.asInstanceOf[js.Any], runs = runs.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentJob]
  }
  
  extension [Self <: DocumentJob](x: Self) {
    
    inline def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDelayUntil(value: Double): Self = StObject.set(x, "delayUntil", value.asInstanceOf[js.Any])
    
    inline def setFailure(value: String): Self = StObject.set(x, "failure", value.asInstanceOf[js.Any])
    
    inline def setFailureUndefined: Self = StObject.set(x, "failure", js.undefined)
    
    inline def setFailures(value: js.Array[js.Object]): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    inline def setFailuresVarargs(value: js.Object*): Self = StObject.set(x, "failures", js.Array(value :_*))
    
    inline def setMaxFailures(value: Double): Self = StObject.set(x, "maxFailures", value.asInstanceOf[js.Any])
    
    inline def setModified(value: Double): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    
    inline def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    
    inline def setRepeatDelay(value: Double): Self = StObject.set(x, "repeatDelay", value.asInstanceOf[js.Any])
    
    inline def setRepeatTimes(value: Double): Self = StObject.set(x, "repeatTimes", value.asInstanceOf[js.Any])
    
    inline def setRepeatUntil(value: Double): Self = StObject.set(x, "repeatUntil", value.asInstanceOf[js.Any])
    
    inline def setRunFailures(value: Double): Self = StObject.set(x, "runFailures", value.asInstanceOf[js.Any])
    
    inline def setRuns(value: Double): Self = StObject.set(x, "runs", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setType(value: Script): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_from(value: String): Self = StObject.set(x, "_from", value.asInstanceOf[js.Any])
    
    inline def set_fromUndefined: Self = StObject.set(x, "_from", js.undefined)
    
    inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_key(value: String): Self = StObject.set(x, "_key", value.asInstanceOf[js.Any])
    
    inline def set_rev(value: String): Self = StObject.set(x, "_rev", value.asInstanceOf[js.Any])
    
    inline def set_to(value: String): Self = StObject.set(x, "_to", value.asInstanceOf[js.Any])
    
    inline def set_toUndefined: Self = StObject.set(x, "_to", js.undefined)
  }
}
