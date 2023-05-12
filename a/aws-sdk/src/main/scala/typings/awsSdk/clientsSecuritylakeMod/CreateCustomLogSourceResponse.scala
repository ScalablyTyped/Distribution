package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCustomLogSourceResponse extends StObject {
  
  /**
    * The location of the partition in the Amazon S3 bucket for Security Lake.
    */
  var customDataLocation: String
  
  /**
    * The name of the Glue crawler.
    */
  var glueCrawlerName: String
  
  /**
    * The Glue database where results are written, such as: arn:aws:daylight:us-east-1::database/sometable/ *.
    */
  var glueDatabaseName: String
  
  /**
    * The table name of the Glue crawler.
    */
  var glueTableName: String
  
  /**
    * The ARN of the IAM role to be used by the entity putting logs into your custom source partition. Security Lake will apply the correct access policies to this role, but you must first manually create the trust policy for this role. The IAM role name must start with the text 'Security Lake'. The IAM role must trust the logProviderAccountId to assume the role.
    */
  var logProviderAccessRoleArn: String
}
object CreateCustomLogSourceResponse {
  
  inline def apply(
    customDataLocation: String,
    glueCrawlerName: String,
    glueDatabaseName: String,
    glueTableName: String,
    logProviderAccessRoleArn: String
  ): CreateCustomLogSourceResponse = {
    val __obj = js.Dynamic.literal(customDataLocation = customDataLocation.asInstanceOf[js.Any], glueCrawlerName = glueCrawlerName.asInstanceOf[js.Any], glueDatabaseName = glueDatabaseName.asInstanceOf[js.Any], glueTableName = glueTableName.asInstanceOf[js.Any], logProviderAccessRoleArn = logProviderAccessRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomLogSourceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateCustomLogSourceResponse] (val x: Self) extends AnyVal {
    
    inline def setCustomDataLocation(value: String): Self = StObject.set(x, "customDataLocation", value.asInstanceOf[js.Any])
    
    inline def setGlueCrawlerName(value: String): Self = StObject.set(x, "glueCrawlerName", value.asInstanceOf[js.Any])
    
    inline def setGlueDatabaseName(value: String): Self = StObject.set(x, "glueDatabaseName", value.asInstanceOf[js.Any])
    
    inline def setGlueTableName(value: String): Self = StObject.set(x, "glueTableName", value.asInstanceOf[js.Any])
    
    inline def setLogProviderAccessRoleArn(value: String): Self = StObject.set(x, "logProviderAccessRoleArn", value.asInstanceOf[js.Any])
  }
}
