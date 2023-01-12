package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3LogsConfiguration extends StObject {
  
  /**
    *  The status of S3 data event logs as a data source.
    */
  var Enable: Boolean
}
object S3LogsConfiguration {
  
  inline def apply(Enable: Boolean): S3LogsConfiguration = {
    val __obj = js.Dynamic.literal(Enable = Enable.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3LogsConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3LogsConfiguration] (val x: Self) extends AnyVal {
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "Enable", value.asInstanceOf[js.Any])
  }
}
