package typings.agenda

import typings.agenda.agendaMod.Agenda
import typings.agenda.jobMod.Job
import typings.agenda.jobMod.JobAttributesData
import typings.mongodb.mod.MongoClientOptions
import typings.mongodb.mod.ObjectId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Address extends StObject {
    
    var address: String
    
    var collection: js.UndefOr[String] = js.undefined
    
    var options: js.UndefOr[MongoClientOptions] = js.undefined
  }
  object Address {
    
    inline def apply(address: String): Address = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    extension [Self <: Address](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      inline def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
      
      inline def setOptions(value: MongoClientOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(when: String, names: String, data: Any): js.Promise[Job[JobAttributesData]] = js.native
    def apply(when: String, names: js.Array[String], data: Any): js.Promise[js.Array[Job[JobAttributesData]]] = js.native
    def apply(when: js.Date, names: String, data: Any): js.Promise[Job[JobAttributesData]] = js.native
    def apply(when: js.Date, names: js.Array[String], data: Any): js.Promise[js.Array[Job[JobAttributesData]]] = js.native
  }
  
  trait Force extends StObject {
    
    var force: Boolean
  }
  object Force {
    
    inline def apply(force: Boolean): Force = {
      val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
      __obj.asInstanceOf[Force]
    }
    
    extension [Self <: Force](x: Self) {
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    }
  }
  
  trait InsertOnly extends StObject {
    
    var insertOnly: Boolean
  }
  object InsertOnly {
    
    inline def apply(insertOnly: Boolean): InsertOnly = {
      val __obj = js.Dynamic.literal(insertOnly = insertOnly.asInstanceOf[js.Any])
      __obj.asInstanceOf[InsertOnly]
    }
    
    extension [Self <: InsertOnly](x: Self) {
      
      inline def setInsertOnly(value: Boolean): Self = StObject.set(x, "insertOnly", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<agenda.agenda/dist/job.JobAttributes<agenda.agenda/dist/job.JobAttributesData>> */
  trait PartialJobAttributesJobAt extends StObject {
    
    var _id: js.UndefOr[ObjectId] = js.undefined
    
    var agenda: js.UndefOr[Agenda] = js.undefined
    
    var data: js.UndefOr[JobAttributesData] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var endDate: js.UndefOr[js.Date | Double | Null] = js.undefined
    
    var failCount: js.UndefOr[Double] = js.undefined
    
    var failReason: js.UndefOr[String] = js.undefined
    
    var failedAt: js.UndefOr[js.Date] = js.undefined
    
    var lastFinishedAt: js.UndefOr[js.Date] = js.undefined
    
    var lastModifiedBy: js.UndefOr[String] = js.undefined
    
    var lastRunAt: js.UndefOr[js.Date] = js.undefined
    
    var lockedAt: js.UndefOr[js.Date | Null] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var nextRunAt: js.UndefOr[js.Date | Null] = js.undefined
    
    var priority: js.UndefOr[Double | String] = js.undefined
    
    var repeatAt: js.UndefOr[String] = js.undefined
    
    var repeatInterval: js.UndefOr[String] = js.undefined
    
    var repeatTimezone: js.UndefOr[String | Null] = js.undefined
    
    var result: js.UndefOr[Any] = js.undefined
    
    var shouldSaveResult: js.UndefOr[Boolean] = js.undefined
    
    var skipDays: js.UndefOr[String | Null] = js.undefined
    
    var startDate: js.UndefOr[js.Date | Double | Null] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var unique: js.UndefOr[Any] = js.undefined
    
    var uniqueOpts: js.UndefOr[InsertOnly] = js.undefined
  }
  object PartialJobAttributesJobAt {
    
    inline def apply(): PartialJobAttributesJobAt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialJobAttributesJobAt]
    }
    
    extension [Self <: PartialJobAttributesJobAt](x: Self) {
      
      inline def setAgenda(value: Agenda): Self = StObject.set(x, "agenda", value.asInstanceOf[js.Any])
      
      inline def setAgendaUndefined: Self = StObject.set(x, "agenda", js.undefined)
      
      inline def setData(value: JobAttributesData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEndDate(value: js.Date | Double): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateNull: Self = StObject.set(x, "endDate", null)
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setFailCount(value: Double): Self = StObject.set(x, "failCount", value.asInstanceOf[js.Any])
      
      inline def setFailCountUndefined: Self = StObject.set(x, "failCount", js.undefined)
      
      inline def setFailReason(value: String): Self = StObject.set(x, "failReason", value.asInstanceOf[js.Any])
      
      inline def setFailReasonUndefined: Self = StObject.set(x, "failReason", js.undefined)
      
      inline def setFailedAt(value: js.Date): Self = StObject.set(x, "failedAt", value.asInstanceOf[js.Any])
      
      inline def setFailedAtUndefined: Self = StObject.set(x, "failedAt", js.undefined)
      
      inline def setLastFinishedAt(value: js.Date): Self = StObject.set(x, "lastFinishedAt", value.asInstanceOf[js.Any])
      
      inline def setLastFinishedAtUndefined: Self = StObject.set(x, "lastFinishedAt", js.undefined)
      
      inline def setLastModifiedBy(value: String): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedByUndefined: Self = StObject.set(x, "lastModifiedBy", js.undefined)
      
      inline def setLastRunAt(value: js.Date): Self = StObject.set(x, "lastRunAt", value.asInstanceOf[js.Any])
      
      inline def setLastRunAtUndefined: Self = StObject.set(x, "lastRunAt", js.undefined)
      
      inline def setLockedAt(value: js.Date): Self = StObject.set(x, "lockedAt", value.asInstanceOf[js.Any])
      
      inline def setLockedAtNull: Self = StObject.set(x, "lockedAt", null)
      
      inline def setLockedAtUndefined: Self = StObject.set(x, "lockedAt", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNextRunAt(value: js.Date): Self = StObject.set(x, "nextRunAt", value.asInstanceOf[js.Any])
      
      inline def setNextRunAtNull: Self = StObject.set(x, "nextRunAt", null)
      
      inline def setNextRunAtUndefined: Self = StObject.set(x, "nextRunAt", js.undefined)
      
      inline def setPriority(value: Double | String): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setRepeatAt(value: String): Self = StObject.set(x, "repeatAt", value.asInstanceOf[js.Any])
      
      inline def setRepeatAtUndefined: Self = StObject.set(x, "repeatAt", js.undefined)
      
      inline def setRepeatInterval(value: String): Self = StObject.set(x, "repeatInterval", value.asInstanceOf[js.Any])
      
      inline def setRepeatIntervalUndefined: Self = StObject.set(x, "repeatInterval", js.undefined)
      
      inline def setRepeatTimezone(value: String): Self = StObject.set(x, "repeatTimezone", value.asInstanceOf[js.Any])
      
      inline def setRepeatTimezoneNull: Self = StObject.set(x, "repeatTimezone", null)
      
      inline def setRepeatTimezoneUndefined: Self = StObject.set(x, "repeatTimezone", js.undefined)
      
      inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      inline def setShouldSaveResult(value: Boolean): Self = StObject.set(x, "shouldSaveResult", value.asInstanceOf[js.Any])
      
      inline def setShouldSaveResultUndefined: Self = StObject.set(x, "shouldSaveResult", js.undefined)
      
      inline def setSkipDays(value: String): Self = StObject.set(x, "skipDays", value.asInstanceOf[js.Any])
      
      inline def setSkipDaysNull: Self = StObject.set(x, "skipDays", null)
      
      inline def setSkipDaysUndefined: Self = StObject.set(x, "skipDays", js.undefined)
      
      inline def setStartDate(value: js.Date | Double): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateNull: Self = StObject.set(x, "startDate", null)
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUnique(value: Any): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
      
      inline def setUniqueOpts(value: InsertOnly): Self = StObject.set(x, "uniqueOpts", value.asInstanceOf[js.Any])
      
      inline def setUniqueOptsUndefined: Self = StObject.set(x, "uniqueOpts", js.undefined)
      
      inline def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
      
      inline def set_id(value: ObjectId): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
      
      inline def set_idUndefined: Self = StObject.set(x, "_id", js.undefined)
    }
  }
}
