package typings.awsSdk.clientsKinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApplicationRequest extends StObject {
  
  /**
    * Name of the Amazon Kinesis Analytics application to update.
    */
  var ApplicationName: typings.awsSdk.clientsKinesisanalyticsMod.ApplicationName
  
  /**
    * Describes application updates.
    */
  var ApplicationUpdate: typings.awsSdk.clientsKinesisanalyticsMod.ApplicationUpdate
  
  /**
    * The current application version ID. You can use the DescribeApplication operation to get this value.
    */
  var CurrentApplicationVersionId: ApplicationVersionId
}
object UpdateApplicationRequest {
  
  inline def apply(
    ApplicationName: ApplicationName,
    ApplicationUpdate: ApplicationUpdate,
    CurrentApplicationVersionId: ApplicationVersionId
  ): UpdateApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], ApplicationUpdate = ApplicationUpdate.asInstanceOf[js.Any], CurrentApplicationVersionId = CurrentApplicationVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationRequest]
  }
  
  extension [Self <: UpdateApplicationRequest](x: Self) {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setApplicationUpdate(value: ApplicationUpdate): Self = StObject.set(x, "ApplicationUpdate", value.asInstanceOf[js.Any])
    
    inline def setCurrentApplicationVersionId(value: ApplicationVersionId): Self = StObject.set(x, "CurrentApplicationVersionId", value.asInstanceOf[js.Any])
  }
}
