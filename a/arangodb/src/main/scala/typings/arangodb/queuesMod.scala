package typings.arangodb

import typings.arangodb.Foxx.Schema
import typings.arangodb.anon.DocumentJob
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queuesMod {
  
  @JSImport("@arangodb/foxx/queues", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(name: String): Queue = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[Queue]
  @scala.inline
  def create(name: String, maxWorkers: Double): Queue = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], maxWorkers.asInstanceOf[js.Any])).asInstanceOf[Queue]
  
  @scala.inline
  def delete(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def get(name: String): Queue = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any]).asInstanceOf[Queue]
  
  trait Job extends StObject {
    
    def abort(): Unit
    
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
  object Job {
    
    @scala.inline
    def apply(
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
    ): Job = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), created = created.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delayUntil = delayUntil.asInstanceOf[js.Any], failures = failures.asInstanceOf[js.Any], maxFailures = maxFailures.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], repeatDelay = repeatDelay.asInstanceOf[js.Any], repeatTimes = repeatTimes.asInstanceOf[js.Any], repeatUntil = repeatUntil.asInstanceOf[js.Any], runFailures = runFailures.asInstanceOf[js.Any], runs = runs.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Job]
    }
    
    @scala.inline
    implicit class JobMutableBuilder[Self <: Job] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUntil(value: Double): Self = StObject.set(x, "delayUntil", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailure(value: String): Self = StObject.set(x, "failure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailureUndefined: Self = StObject.set(x, "failure", js.undefined)
      
      @scala.inline
      def setFailures(value: js.Array[js.Object]): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailuresVarargs(value: js.Object*): Self = StObject.set(x, "failures", js.Array(value :_*))
      
      @scala.inline
      def setMaxFailures(value: Double): Self = StObject.set(x, "maxFailures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModified(value: Double): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatDelay(value: Double): Self = StObject.set(x, "repeatDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatTimes(value: Double): Self = StObject.set(x, "repeatTimes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatUntil(value: Double): Self = StObject.set(x, "repeatUntil", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunFailures(value: Double): Self = StObject.set(x, "runFailures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuns(value: Double): Self = StObject.set(x, "runs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccess(value: String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      @scala.inline
      def setType(value: Script): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type JobCallback = js.Function3[/* result */ js.Any, /* jobData */ js.Any, /* job */ DocumentJob, Unit]
  
  trait JobOptions extends StObject {
    
    var backOff: js.UndefOr[(js.Function1[/* failureCount */ Double, Double]) | Double] = js.undefined
    
    var delayUntil: js.UndefOr[Double | Date] = js.undefined
    
    var failure: js.UndefOr[JobCallback] = js.undefined
    
    var maxFailures: js.UndefOr[Double] = js.undefined
    
    var repeatDelay: js.UndefOr[Double] = js.undefined
    
    var repeatTimes: js.UndefOr[Double] = js.undefined
    
    var repeatUntil: js.UndefOr[Double | Date] = js.undefined
    
    var success: js.UndefOr[JobCallback] = js.undefined
  }
  object JobOptions {
    
    @scala.inline
    def apply(): JobOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JobOptions]
    }
    
    @scala.inline
    implicit class JobOptionsMutableBuilder[Self <: JobOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackOff(value: (js.Function1[/* failureCount */ Double, Double]) | Double): Self = StObject.set(x, "backOff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackOffFunction1(value: /* failureCount */ Double => Double): Self = StObject.set(x, "backOff", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBackOffUndefined: Self = StObject.set(x, "backOff", js.undefined)
      
      @scala.inline
      def setDelayUntil(value: Double | Date): Self = StObject.set(x, "delayUntil", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUntilUndefined: Self = StObject.set(x, "delayUntil", js.undefined)
      
      @scala.inline
      def setFailure(value: (/* result */ js.Any, /* jobData */ js.Any, /* job */ DocumentJob) => Unit): Self = StObject.set(x, "failure", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFailureUndefined: Self = StObject.set(x, "failure", js.undefined)
      
      @scala.inline
      def setMaxFailures(value: Double): Self = StObject.set(x, "maxFailures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxFailuresUndefined: Self = StObject.set(x, "maxFailures", js.undefined)
      
      @scala.inline
      def setRepeatDelay(value: Double): Self = StObject.set(x, "repeatDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatDelayUndefined: Self = StObject.set(x, "repeatDelay", js.undefined)
      
      @scala.inline
      def setRepeatTimes(value: Double): Self = StObject.set(x, "repeatTimes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatTimesUndefined: Self = StObject.set(x, "repeatTimes", js.undefined)
      
      @scala.inline
      def setRepeatUntil(value: Double | Date): Self = StObject.set(x, "repeatUntil", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatUntilUndefined: Self = StObject.set(x, "repeatUntil", js.undefined)
      
      @scala.inline
      def setSuccess(value: (/* result */ js.Any, /* jobData */ js.Any, /* job */ DocumentJob) => Unit): Self = StObject.set(x, "success", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    }
  }
  
  @js.native
  trait Queue extends StObject {
    
    def all(): js.Array[String] = js.native
    def all(script: Script): js.Array[String] = js.native
    
    def complete(): js.Array[String] = js.native
    def complete(script: Script): js.Array[String] = js.native
    
    def delete(jobId: String): Boolean = js.native
    
    def failed(): js.Array[String] = js.native
    def failed(script: Script): js.Array[String] = js.native
    
    def get(jobId: String): DocumentJob = js.native
    
    def pending(): js.Array[String] = js.native
    def pending(script: Script): js.Array[String] = js.native
    
    def progress(): js.Array[String] = js.native
    def progress(script: Script): js.Array[String] = js.native
    
    def push(item: QueueItem, data: js.Any): Unit = js.native
    def push(item: QueueItem, data: js.Any, opts: JobOptions): Unit = js.native
  }
  
  trait QueueItem extends StObject {
    
    var backOff: js.UndefOr[(js.Function1[/* failureCount */ Double, Double]) | Double] = js.undefined
    
    var maxFailures: js.UndefOr[Double] = js.undefined
    
    var mount: String
    
    var name: String
    
    var preprocess: js.UndefOr[js.Function1[/* data */ js.Any, js.Any]] = js.undefined
    
    var schema: js.UndefOr[Schema] = js.undefined
  }
  object QueueItem {
    
    @scala.inline
    def apply(mount: String, name: String): QueueItem = {
      val __obj = js.Dynamic.literal(mount = mount.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueueItem]
    }
    
    @scala.inline
    implicit class QueueItemMutableBuilder[Self <: QueueItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackOff(value: (js.Function1[/* failureCount */ Double, Double]) | Double): Self = StObject.set(x, "backOff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackOffFunction1(value: /* failureCount */ Double => Double): Self = StObject.set(x, "backOff", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBackOffUndefined: Self = StObject.set(x, "backOff", js.undefined)
      
      @scala.inline
      def setMaxFailures(value: Double): Self = StObject.set(x, "maxFailures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxFailuresUndefined: Self = StObject.set(x, "maxFailures", js.undefined)
      
      @scala.inline
      def setMount(value: String): Self = StObject.set(x, "mount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreprocess(value: /* data */ js.Any => js.Any): Self = StObject.set(x, "preprocess", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPreprocessUndefined: Self = StObject.set(x, "preprocess", js.undefined)
      
      @scala.inline
      def setSchema(value: Schema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    }
  }
  
  trait Script extends StObject {
    
    var mount: String
    
    var name: String
  }
  object Script {
    
    @scala.inline
    def apply(mount: String, name: String): Script = {
      val __obj = js.Dynamic.literal(mount = mount.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Script]
    }
    
    @scala.inline
    implicit class ScriptMutableBuilder[Self <: Script] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMount(value: String): Self = StObject.set(x, "mount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
