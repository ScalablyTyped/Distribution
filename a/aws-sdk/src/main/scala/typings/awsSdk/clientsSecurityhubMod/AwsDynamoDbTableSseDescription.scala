package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsDynamoDbTableSseDescription extends StObject {
  
  /**
    * If the key is inaccessible, the date and time when DynamoDB detected that the key was inaccessible. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var InaccessibleEncryptionDateTime: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ARN of the KMS key that is used for the KMS encryption.
    */
  var KmsMasterKeyArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The type of server-side encryption.
    */
  var SseType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The status of the server-side encryption.
    */
  var Status: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsDynamoDbTableSseDescription {
  
  inline def apply(): AwsDynamoDbTableSseDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsDynamoDbTableSseDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsDynamoDbTableSseDescription] (val x: Self) extends AnyVal {
    
    inline def setInaccessibleEncryptionDateTime(value: NonEmptyString): Self = StObject.set(x, "InaccessibleEncryptionDateTime", value.asInstanceOf[js.Any])
    
    inline def setInaccessibleEncryptionDateTimeUndefined: Self = StObject.set(x, "InaccessibleEncryptionDateTime", js.undefined)
    
    inline def setKmsMasterKeyArn(value: NonEmptyString): Self = StObject.set(x, "KmsMasterKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKmsMasterKeyArnUndefined: Self = StObject.set(x, "KmsMasterKeyArn", js.undefined)
    
    inline def setSseType(value: NonEmptyString): Self = StObject.set(x, "SseType", value.asInstanceOf[js.Any])
    
    inline def setSseTypeUndefined: Self = StObject.set(x, "SseType", js.undefined)
    
    inline def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
