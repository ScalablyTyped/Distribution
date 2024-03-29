package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HlsWebdavSettings extends StObject {
  
  /**
    * Number of seconds to wait before retrying connection to the CDN if the connection is lost.
    */
  var ConnectionRetryInterval: js.UndefOr[integerMin0] = js.undefined
  
  /**
    * Size in seconds of file cache for streaming outputs.
    */
  var FilecacheDuration: js.UndefOr[integerMin0Max600] = js.undefined
  
  /**
    * Specify whether or not to use chunked transfer encoding to WebDAV.
    */
  var HttpTransferMode: js.UndefOr[HlsWebdavHttpTransferMode] = js.undefined
  
  /**
    * Number of retry attempts that will be made before the Live Event is put into an error state. Applies only if the CDN destination URI begins with "s3" or "mediastore". For other URIs, the value is always 3.
    */
  var NumRetries: js.UndefOr[integerMin0] = js.undefined
  
  /**
    * If a streaming output fails, number of seconds to wait until a restart is initiated. A value of 0 means never restart.
    */
  var RestartDelay: js.UndefOr[integerMin0Max15] = js.undefined
}
object HlsWebdavSettings {
  
  inline def apply(): HlsWebdavSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsWebdavSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HlsWebdavSettings] (val x: Self) extends AnyVal {
    
    inline def setConnectionRetryInterval(value: integerMin0): Self = StObject.set(x, "ConnectionRetryInterval", value.asInstanceOf[js.Any])
    
    inline def setConnectionRetryIntervalUndefined: Self = StObject.set(x, "ConnectionRetryInterval", js.undefined)
    
    inline def setFilecacheDuration(value: integerMin0Max600): Self = StObject.set(x, "FilecacheDuration", value.asInstanceOf[js.Any])
    
    inline def setFilecacheDurationUndefined: Self = StObject.set(x, "FilecacheDuration", js.undefined)
    
    inline def setHttpTransferMode(value: HlsWebdavHttpTransferMode): Self = StObject.set(x, "HttpTransferMode", value.asInstanceOf[js.Any])
    
    inline def setHttpTransferModeUndefined: Self = StObject.set(x, "HttpTransferMode", js.undefined)
    
    inline def setNumRetries(value: integerMin0): Self = StObject.set(x, "NumRetries", value.asInstanceOf[js.Any])
    
    inline def setNumRetriesUndefined: Self = StObject.set(x, "NumRetries", js.undefined)
    
    inline def setRestartDelay(value: integerMin0Max15): Self = StObject.set(x, "RestartDelay", value.asInstanceOf[js.Any])
    
    inline def setRestartDelayUndefined: Self = StObject.set(x, "RestartDelay", js.undefined)
  }
}
