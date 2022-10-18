package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoleAliasDescription extends StObject {
  
  /**
    * The UNIX timestamp of when the role alias was created.
    */
  var creationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The number of seconds for which the credential is valid.
    */
  var credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds] = js.undefined
  
  /**
    * The UNIX timestamp of when the role alias was last modified.
    */
  var lastModifiedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The role alias owner.
    */
  var owner: js.UndefOr[AwsAccountId] = js.undefined
  
  /**
    * The role alias.
    */
  var roleAlias: js.UndefOr[RoleAlias] = js.undefined
  
  /**
    * The ARN of the role alias.
    */
  var roleAliasArn: js.UndefOr[RoleAliasArn] = js.undefined
  
  /**
    * The role ARN.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
}
object RoleAliasDescription {
  
  inline def apply(): RoleAliasDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoleAliasDescription]
  }
  
  extension [Self <: RoleAliasDescription](x: Self) {
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setCredentialDurationSeconds(value: CredentialDurationSeconds): Self = StObject.set(x, "credentialDurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setCredentialDurationSecondsUndefined: Self = StObject.set(x, "credentialDurationSeconds", js.undefined)
    
    inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    
    inline def setOwner(value: AwsAccountId): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setRoleAlias(value: RoleAlias): Self = StObject.set(x, "roleAlias", value.asInstanceOf[js.Any])
    
    inline def setRoleAliasArn(value: RoleAliasArn): Self = StObject.set(x, "roleAliasArn", value.asInstanceOf[js.Any])
    
    inline def setRoleAliasArnUndefined: Self = StObject.set(x, "roleAliasArn", js.undefined)
    
    inline def setRoleAliasUndefined: Self = StObject.set(x, "roleAlias", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
  }
}
