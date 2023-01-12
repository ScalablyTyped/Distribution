package typings.agenda

import typings.agenda.distJobMod.Job
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAgendaDefineMod {
  
  @JSImport("agenda/dist/agenda/define", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait JobPriority extends StObject
  @JSImport("agenda/dist/agenda/define", "JobPriority")
  @js.native
  object JobPriority extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[JobPriority & Double] = js.native
    
    @js.native
    sealed trait high
      extends StObject
         with JobPriority
    /* 10 */ val high: typings.agenda.distAgendaDefineMod.JobPriority.high & Double = js.native
    
    @js.native
    sealed trait highest
      extends StObject
         with JobPriority
    /* 20 */ val highest: typings.agenda.distAgendaDefineMod.JobPriority.highest & Double = js.native
    
    @js.native
    sealed trait low
      extends StObject
         with JobPriority
    /* -10 */ val low: typings.agenda.distAgendaDefineMod.JobPriority.low & Double = js.native
    
    @js.native
    sealed trait lowest
      extends StObject
         with JobPriority
    /* -20 */ val lowest: typings.agenda.distAgendaDefineMod.JobPriority.lowest & Double = js.native
    
    @js.native
    sealed trait normal
      extends StObject
         with JobPriority
    /* 0 */ val normal: typings.agenda.distAgendaDefineMod.JobPriority.normal & Double = js.native
  }
  
  inline def define[T](name: String, options: DefineOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def define[T](name: String, options: DefineOptions, processor: Processor[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], processor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def define[T](name: String, options: Processor[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def define[T](name: String, options: Processor[T], processor: Processor[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], processor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait DefineOptions extends StObject {
    
    /**
      * Maximum number of that job that can be running at once (per instance of agenda)
      */
    var concurrency: js.UndefOr[Double] = js.undefined
    
    /**
      * Interval in ms of how long the job stays locked for (see multiple job processors for more info). A job will
      * automatically unlock if done() is called.
      */
    var lockLifetime: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum number of that job that can be locked at once (per instance of agenda)
      */
    var lockLimit: js.UndefOr[Double] = js.undefined
    
    /**
      * (lowest|low|normal|high|highest|number) specifies the priority of the job. Higher priority jobs will run
      * first.
      */
    var priority: js.UndefOr[JobPriority] = js.undefined
    
    /**
      * Should the return value of the job be persisted
      */
    var shouldSaveResult: js.UndefOr[Boolean] = js.undefined
  }
  object DefineOptions {
    
    inline def apply(): DefineOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefineOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefineOptions] (val x: Self) extends AnyVal {
      
      inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      inline def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      inline def setLockLifetime(value: Double): Self = StObject.set(x, "lockLifetime", value.asInstanceOf[js.Any])
      
      inline def setLockLifetimeUndefined: Self = StObject.set(x, "lockLifetime", js.undefined)
      
      inline def setLockLimit(value: Double): Self = StObject.set(x, "lockLimit", value.asInstanceOf[js.Any])
      
      inline def setLockLimitUndefined: Self = StObject.set(x, "lockLimit", js.undefined)
      
      inline def setPriority(value: JobPriority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setShouldSaveResult(value: Boolean): Self = StObject.set(x, "shouldSaveResult", value.asInstanceOf[js.Any])
      
      inline def setShouldSaveResultUndefined: Self = StObject.set(x, "shouldSaveResult", js.undefined)
    }
  }
  
  type Processor[T] = (js.Function1[/* job */ Job[T], js.Promise[Unit]]) | (js.Function2[/* job */ Job[T], /* done */ js.Function0[Unit], Unit])
}
