package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsTaskDefinitionContainerDefinitionsFirelensConfigurationDetails extends StObject {
  
  /**
    * The options to use to configure the log router. The valid option keys are as follows:    enable-ecs-log-metadata. The value can be true or false.    config-file-type. The value can be s3 or file.    config-file-value. The value is either an S3 ARN or a file path.  
    */
  var Options: js.UndefOr[FieldMap] = js.undefined
  
  /**
    * The log router to use. Valid values are fluentbit or fluentd.
    */
  var Type: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEcsTaskDefinitionContainerDefinitionsFirelensConfigurationDetails {
  
  inline def apply(): AwsEcsTaskDefinitionContainerDefinitionsFirelensConfigurationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsTaskDefinitionContainerDefinitionsFirelensConfigurationDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEcsTaskDefinitionContainerDefinitionsFirelensConfigurationDetails] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: FieldMap): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    inline def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
