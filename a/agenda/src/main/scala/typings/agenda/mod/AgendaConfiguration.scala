package typings.agenda.mod

import typings.agenda.anon.Address
import typings.mongodb.mod.Db
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Agenda Configuration.
  */
@js.native
trait AgendaConfiguration extends js.Object {
  
  /**
    * Specifies that Agenda should connect to MongoDB.
    */
  var db: js.UndefOr[Address] = js.native
  
  /**
    * Takes a number which specifies the default number of a specific job that can be running at any given moment.
    * By default it is 5.
    */
  var defaultConcurrency: js.UndefOr[Double] = js.native
  
  /**
    * Takes a number which specifies the default lock lifetime in milliseconds. By default it is 10 minutes. This
    * can be overridden by specifying the lockLifetime option to a defined job.
    */
  var defaultLockLifetime: js.UndefOr[Double] = js.native
  
  /**
    * Takes a number which specifies the default number of a specific job that can be locked at any given moment.
    * By default it is 0 for no max.
    */
  var defaultLockLimit: js.UndefOr[Double] = js.native
  
  /**
    * Takes a number which specifies the max number jobs that can be locked at any given moment. By default it is
    * 0 for no max.
    */
  var lockLimit: js.UndefOr[Double] = js.native
  
  /**
    * Takes a number which specifies the max number of jobs that can be running at any given moment. By default it
    * is 20.
    */
  var maxConcurrency: js.UndefOr[Double] = js.native
  
  /**
    * Specifies that Agenda should be initialized using and existing MongoDB connection.
    */
  var mongo: js.UndefOr[Db] = js.native
  
  /**
    * Sets the `lastModifiedBy` field to `name` in the jobs collection. Useful if you have multiple job processors
    * (agendas) and want to see which job queue last ran the job.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Sets the interval with which the queue is checked. A number in milliseconds or a frequency string.
    */
  var processEvery: js.UndefOr[String | Double] = js.native
}
object AgendaConfiguration {
  
  @scala.inline
  def apply(): AgendaConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgendaConfiguration]
  }
  
  @scala.inline
  implicit class AgendaConfigurationOps[Self <: AgendaConfiguration] (val x: Self) extends AnyVal {
    
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
    def setDb(value: Address): Self = this.set("db", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDb: Self = this.set("db", js.undefined)
    
    @scala.inline
    def setDefaultConcurrency(value: Double): Self = this.set("defaultConcurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultConcurrency: Self = this.set("defaultConcurrency", js.undefined)
    
    @scala.inline
    def setDefaultLockLifetime(value: Double): Self = this.set("defaultLockLifetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultLockLifetime: Self = this.set("defaultLockLifetime", js.undefined)
    
    @scala.inline
    def setDefaultLockLimit(value: Double): Self = this.set("defaultLockLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultLockLimit: Self = this.set("defaultLockLimit", js.undefined)
    
    @scala.inline
    def setLockLimit(value: Double): Self = this.set("lockLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockLimit: Self = this.set("lockLimit", js.undefined)
    
    @scala.inline
    def setMaxConcurrency(value: Double): Self = this.set("maxConcurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxConcurrency: Self = this.set("maxConcurrency", js.undefined)
    
    @scala.inline
    def setMongo(value: Db): Self = this.set("mongo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMongo: Self = this.set("mongo", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProcessEvery(value: String | Double): Self = this.set("processEvery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessEvery: Self = this.set("processEvery", js.undefined)
  }
}
