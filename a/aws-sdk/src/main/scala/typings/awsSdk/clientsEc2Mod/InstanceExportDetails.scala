package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceExportDetails extends StObject {
  
  /**
    * The ID of the resource being exported.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * The target virtualization environment.
    */
  var TargetEnvironment: js.UndefOr[ExportEnvironment] = js.undefined
}
object InstanceExportDetails {
  
  inline def apply(): InstanceExportDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceExportDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceExportDetails] (val x: Self) extends AnyVal {
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setTargetEnvironment(value: ExportEnvironment): Self = StObject.set(x, "TargetEnvironment", value.asInstanceOf[js.Any])
    
    inline def setTargetEnvironmentUndefined: Self = StObject.set(x, "TargetEnvironment", js.undefined)
  }
}
