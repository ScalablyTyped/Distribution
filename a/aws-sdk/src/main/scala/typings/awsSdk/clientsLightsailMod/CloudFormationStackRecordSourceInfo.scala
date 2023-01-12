package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudFormationStackRecordSourceInfo extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the export snapshot record.
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the record.
    */
  var name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The Lightsail resource type (e.g., ExportSnapshotRecord).
    */
  var resourceType: js.UndefOr[CloudFormationStackRecordSourceType] = js.undefined
}
object CloudFormationStackRecordSourceInfo {
  
  inline def apply(): CloudFormationStackRecordSourceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudFormationStackRecordSourceInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloudFormationStackRecordSourceInfo] (val x: Self) extends AnyVal {
    
    inline def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResourceType(value: CloudFormationStackRecordSourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
