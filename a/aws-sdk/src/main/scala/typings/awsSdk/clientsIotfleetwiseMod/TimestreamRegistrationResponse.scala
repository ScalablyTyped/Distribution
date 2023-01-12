package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimestreamRegistrationResponse extends StObject {
  
  /**
    * A message associated with a registration error.
    */
  var errorMessage: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.errorMessage] = js.undefined
  
  /**
    * The status of registering your Amazon Timestream resources. The status can be one of REGISTRATION_SUCCESS, REGISTRATION_PENDING, REGISTRATION_FAILURE.
    */
  var registrationStatus: RegistrationStatus
  
  /**
    * The Amazon Resource Name (ARN) of the Timestream database.
    */
  var timestreamDatabaseArn: js.UndefOr[arn] = js.undefined
  
  /**
    * The name of the Timestream database.
    */
  var timestreamDatabaseName: TimestreamDatabaseName
  
  /**
    * The ARN of the Timestream database table.
    */
  var timestreamTableArn: js.UndefOr[arn] = js.undefined
  
  /**
    * The name of the Timestream database table.
    */
  var timestreamTableName: TimestreamTableName
}
object TimestreamRegistrationResponse {
  
  inline def apply(
    registrationStatus: RegistrationStatus,
    timestreamDatabaseName: TimestreamDatabaseName,
    timestreamTableName: TimestreamTableName
  ): TimestreamRegistrationResponse = {
    val __obj = js.Dynamic.literal(registrationStatus = registrationStatus.asInstanceOf[js.Any], timestreamDatabaseName = timestreamDatabaseName.asInstanceOf[js.Any], timestreamTableName = timestreamTableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimestreamRegistrationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimestreamRegistrationResponse] (val x: Self) extends AnyVal {
    
    inline def setErrorMessage(value: errorMessage): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setRegistrationStatus(value: RegistrationStatus): Self = StObject.set(x, "registrationStatus", value.asInstanceOf[js.Any])
    
    inline def setTimestreamDatabaseArn(value: arn): Self = StObject.set(x, "timestreamDatabaseArn", value.asInstanceOf[js.Any])
    
    inline def setTimestreamDatabaseArnUndefined: Self = StObject.set(x, "timestreamDatabaseArn", js.undefined)
    
    inline def setTimestreamDatabaseName(value: TimestreamDatabaseName): Self = StObject.set(x, "timestreamDatabaseName", value.asInstanceOf[js.Any])
    
    inline def setTimestreamTableArn(value: arn): Self = StObject.set(x, "timestreamTableArn", value.asInstanceOf[js.Any])
    
    inline def setTimestreamTableArnUndefined: Self = StObject.set(x, "timestreamTableArn", js.undefined)
    
    inline def setTimestreamTableName(value: TimestreamTableName): Self = StObject.set(x, "timestreamTableName", value.asInstanceOf[js.Any])
  }
}
