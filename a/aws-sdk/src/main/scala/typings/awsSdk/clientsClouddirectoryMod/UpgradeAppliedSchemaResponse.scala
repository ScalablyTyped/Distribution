package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpgradeAppliedSchemaResponse extends StObject {
  
  /**
    * The ARN of the directory that is returned as part of the response.
    */
  var DirectoryArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ARN of the upgraded schema that is returned as part of the response.
    */
  var UpgradedSchemaArn: js.UndefOr[Arn] = js.undefined
}
object UpgradeAppliedSchemaResponse {
  
  inline def apply(): UpgradeAppliedSchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpgradeAppliedSchemaResponse]
  }
  
  extension [Self <: UpgradeAppliedSchemaResponse](x: Self) {
    
    inline def setDirectoryArn(value: Arn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
    
    inline def setDirectoryArnUndefined: Self = StObject.set(x, "DirectoryArn", js.undefined)
    
    inline def setUpgradedSchemaArn(value: Arn): Self = StObject.set(x, "UpgradedSchemaArn", value.asInstanceOf[js.Any])
    
    inline def setUpgradedSchemaArnUndefined: Self = StObject.set(x, "UpgradedSchemaArn", js.undefined)
  }
}
