package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.KeyManagementScheme")
@js.native
open class KeyManagementScheme protected () extends StObject {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  var DUKPT: typings.authorizenet.mod.APIContracts.KeyManagementScheme.DUKPT = js.native
  
  def getDUKPT(): typings.authorizenet.mod.APIContracts.KeyManagementScheme.DUKPT = js.native
  
  def setDUKPT(p_DUKPT: typings.authorizenet.mod.APIContracts.KeyManagementScheme.DUKPT): Unit = js.native
}
object KeyManagementScheme {
  
  @JSImport("authorizenet", "APIContracts.KeyManagementScheme.DUKPT")
  @js.native
  open class DUKPT protected () extends StObject {
    def this(obj: Any, args: Any*) = this()
    def this(obj: Unit, args: Any*) = this()
    
    var DeviceInfo: Any = js.native
    
    var EncryptedData: Any = js.native
    
    var Mode: Any = js.native
    
    var Operation: Any = js.native
    
    def getDeviceInfo(): Any = js.native
    
    def getEncryptedData(): Any = js.native
    
    def getMode(): Any = js.native
    
    def getOperation(): Any = js.native
    
    def setDeviceInfo(p_deviceInfo: Any): Unit = js.native
    
    def setEncryptedData(p_encryptedData: Any): Unit = js.native
    
    def setMode(p_mode: Any): Unit = js.native
    
    def setOperation(p_operation: Any): Unit = js.native
  }
}
