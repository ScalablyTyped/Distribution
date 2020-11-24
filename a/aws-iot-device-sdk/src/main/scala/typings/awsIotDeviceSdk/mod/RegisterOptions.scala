package typings.awsIotDeviceSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterOptions extends js.Object {
  
  /**
    * set to false to allow receiving messages with old version
    * numbers (default true)
    */
  var discardStale: js.UndefOr[Boolean] = js.native
  
  /** set to true to send version numbers with shadow updates (default true) */
  var enableVersioning: js.UndefOr[Boolean] = js.native
  
  /**
    * set to true to not subscribe to the delta sub-topic for this
    * Thing Shadow; used in cases where the application is not interested in
    * changes (e.g. update only.) (default false)
    */
  var ignoreDeltas: js.UndefOr[Boolean] = js.native
  
  /**
    * set to false to unsubscribe from all operation sub-topics while not
    * performing an operation (default true)
    */
  var persistentSubscribe: js.UndefOr[Boolean] = js.native
}
object RegisterOptions {
  
  @scala.inline
  def apply(): RegisterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterOptions]
  }
  
  @scala.inline
  implicit class RegisterOptionsOps[Self <: RegisterOptions] (val x: Self) extends AnyVal {
    
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
    def setDiscardStale(value: Boolean): Self = this.set("discardStale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscardStale: Self = this.set("discardStale", js.undefined)
    
    @scala.inline
    def setEnableVersioning(value: Boolean): Self = this.set("enableVersioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableVersioning: Self = this.set("enableVersioning", js.undefined)
    
    @scala.inline
    def setIgnoreDeltas(value: Boolean): Self = this.set("ignoreDeltas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreDeltas: Self = this.set("ignoreDeltas", js.undefined)
    
    @scala.inline
    def setPersistentSubscribe(value: Boolean): Self = this.set("persistentSubscribe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersistentSubscribe: Self = this.set("persistentSubscribe", js.undefined)
  }
}
