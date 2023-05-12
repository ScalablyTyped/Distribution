package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamConfigurationSessionBackup extends StObject {
  
  /**
    * The maximum number of backups that each streaming session created from this launch profile can have.
    */
  var maxBackupsToRetain: js.UndefOr[StreamConfigurationMaxBackupsToRetain] = js.undefined
  
  /**
    * Specifies how artists sessions are backed up. Configures backups for streaming sessions launched with this launch profile. The default value is DEACTIVATED, which means that backups are deactivated. To allow backups, set this value to AUTOMATIC.
    */
  var mode: js.UndefOr[SessionBackupMode] = js.undefined
}
object StreamConfigurationSessionBackup {
  
  inline def apply(): StreamConfigurationSessionBackup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamConfigurationSessionBackup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamConfigurationSessionBackup] (val x: Self) extends AnyVal {
    
    inline def setMaxBackupsToRetain(value: StreamConfigurationMaxBackupsToRetain): Self = StObject.set(x, "maxBackupsToRetain", value.asInstanceOf[js.Any])
    
    inline def setMaxBackupsToRetainUndefined: Self = StObject.set(x, "maxBackupsToRetain", js.undefined)
    
    inline def setMode(value: SessionBackupMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
