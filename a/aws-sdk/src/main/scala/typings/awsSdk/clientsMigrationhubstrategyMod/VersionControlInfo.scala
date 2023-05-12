package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VersionControlInfo extends StObject {
  
  /**
    * The time when the version control system was last configured.
    */
  var versionControlConfigurationTimeStamp: js.UndefOr[String] = js.undefined
  
  /**
    * The type of version control.
    */
  var versionControlType: js.UndefOr[VersionControlType] = js.undefined
}
object VersionControlInfo {
  
  inline def apply(): VersionControlInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VersionControlInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VersionControlInfo] (val x: Self) extends AnyVal {
    
    inline def setVersionControlConfigurationTimeStamp(value: String): Self = StObject.set(x, "versionControlConfigurationTimeStamp", value.asInstanceOf[js.Any])
    
    inline def setVersionControlConfigurationTimeStampUndefined: Self = StObject.set(x, "versionControlConfigurationTimeStamp", js.undefined)
    
    inline def setVersionControlType(value: VersionControlType): Self = StObject.set(x, "versionControlType", value.asInstanceOf[js.Any])
    
    inline def setVersionControlTypeUndefined: Self = StObject.set(x, "versionControlType", js.undefined)
  }
}
