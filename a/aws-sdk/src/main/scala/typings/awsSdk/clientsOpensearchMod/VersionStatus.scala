package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VersionStatus extends StObject {
  
  /**
    * The OpenSearch or Elasticsearch version for the specified domain.
    */
  var Options: VersionString
  
  /**
    * The status of the version options for the specified domain.
    */
  var Status: OptionStatus
}
object VersionStatus {
  
  inline def apply(Options: VersionString, Status: OptionStatus): VersionStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VersionStatus] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: VersionString): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: OptionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
