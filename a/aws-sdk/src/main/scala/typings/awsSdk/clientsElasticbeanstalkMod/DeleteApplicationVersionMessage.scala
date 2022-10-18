package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteApplicationVersionMessage extends StObject {
  
  /**
    * The name of the application to which the version belongs.
    */
  var ApplicationName: typings.awsSdk.clientsElasticbeanstalkMod.ApplicationName
  
  /**
    * Set to true to delete the source bundle from your storage bucket. Otherwise, the application version is deleted only from Elastic Beanstalk and the source bundle remains in Amazon S3.
    */
  var DeleteSourceBundle: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.DeleteSourceBundle] = js.undefined
  
  /**
    * The label of the version to delete.
    */
  var VersionLabel: typings.awsSdk.clientsElasticbeanstalkMod.VersionLabel
}
object DeleteApplicationVersionMessage {
  
  inline def apply(ApplicationName: ApplicationName, VersionLabel: VersionLabel): DeleteApplicationVersionMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], VersionLabel = VersionLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApplicationVersionMessage]
  }
  
  extension [Self <: DeleteApplicationVersionMessage](x: Self) {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setDeleteSourceBundle(value: DeleteSourceBundle): Self = StObject.set(x, "DeleteSourceBundle", value.asInstanceOf[js.Any])
    
    inline def setDeleteSourceBundleUndefined: Self = StObject.set(x, "DeleteSourceBundle", js.undefined)
    
    inline def setVersionLabel(value: VersionLabel): Self = StObject.set(x, "VersionLabel", value.asInstanceOf[js.Any])
  }
}
