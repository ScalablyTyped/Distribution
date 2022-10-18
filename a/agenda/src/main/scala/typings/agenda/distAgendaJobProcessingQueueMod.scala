package typings.agenda

import typings.agenda.distJobMod.Job
import typings.agenda.distJobMod.JobAttributesData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAgendaJobProcessingQueueMod {
  
  /**
    * @class
    * @param {Object} args - Job Options
    * @property {Object} agenda - The Agenda instance
    * @property {Object} attrs
    */
  @JSImport("agenda/dist/agenda/job-processing-queue", "JobProcessingQueue")
  @js.native
  open class JobProcessingQueue () extends StObject {
    
    /* protected */ var _queue: js.Array[Job[JobAttributesData]] = js.native
    
    def insert(job: Job[JobAttributesData]): Unit = js.native
    
    def length: Double = js.native
    
    def pop(): js.UndefOr[Job[JobAttributesData]] = js.native
    
    def push(job: Job[JobAttributesData]): Unit = js.native
    
    def returnNextConcurrencyFreeJob(agendaDefinitions: Any): Job[JobAttributesData] = js.native
  }
}
