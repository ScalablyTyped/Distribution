package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveDirectoryBackupAttributes extends StObject {
  
  /**
    * The ID of the Amazon Web Services Managed Microsoft Active Directory instance to which the file system is joined.
    */
  var ActiveDirectoryId: js.UndefOr[DirectoryId] = js.undefined
  
  /**
    * The fully qualified domain name of the self-managed Active Directory directory.
    */
  var DomainName: js.UndefOr[ActiveDirectoryFullyQualifiedName] = js.undefined
  
  var ResourceARN: js.UndefOr[typings.awsSdk.clientsFsxMod.ResourceARN] = js.undefined
}
object ActiveDirectoryBackupAttributes {
  
  inline def apply(): ActiveDirectoryBackupAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveDirectoryBackupAttributes]
  }
  
  extension [Self <: ActiveDirectoryBackupAttributes](x: Self) {
    
    inline def setActiveDirectoryId(value: DirectoryId): Self = StObject.set(x, "ActiveDirectoryId", value.asInstanceOf[js.Any])
    
    inline def setActiveDirectoryIdUndefined: Self = StObject.set(x, "ActiveDirectoryId", js.undefined)
    
    inline def setDomainName(value: ActiveDirectoryFullyQualifiedName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    inline def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    inline def setResourceARNUndefined: Self = StObject.set(x, "ResourceARN", js.undefined)
  }
}
