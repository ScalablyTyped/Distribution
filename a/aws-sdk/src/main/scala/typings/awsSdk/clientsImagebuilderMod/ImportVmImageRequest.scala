package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportVmImageRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information, see Ensuring idempotency in the Amazon EC2 API Reference.
    */
  var clientToken: ClientToken
  
  /**
    * The description for the base image that is created by the import process.
    */
  var description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the base image that is created by the import process.
    */
  var name: NonEmptyString
  
  /**
    * The operating system version for the imported VM.
    */
  var osVersion: js.UndefOr[OsVersion] = js.undefined
  
  /**
    * The operating system platform for the imported VM.
    */
  var platform: Platform
  
  /**
    * The semantic version to attach to the base image that was created during the import process. This version follows the semantic version syntax.  The semantic version has four nodes: &lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;/&lt;build&gt;. You can assign values for the first three, and can filter on all of them.  Assignment: For the first three nodes you can assign any positive integer value, including zero, with an upper limit of 2^30-1, or 1073741823 for each node. Image Builder automatically assigns the build number to the fourth node.  Patterns: You can use any numeric pattern that adheres to the assignment requirements for the nodes that you can assign. For example, you might choose a software version pattern, such as 1.0.0, or a date, such as 2021.01.01. 
    */
  var semanticVersion: VersionNumber
  
  /**
    * Tags that are attached to the import resources.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The importTaskId (API) or ImportTaskId (CLI) from the Amazon EC2 VM import process. Image Builder retrieves information from the import process to pull in the AMI that is created from the VM source as the base image for your recipe.
    */
  var vmImportTaskId: NonEmptyString
}
object ImportVmImageRequest {
  
  inline def apply(
    clientToken: ClientToken,
    name: NonEmptyString,
    platform: Platform,
    semanticVersion: VersionNumber,
    vmImportTaskId: NonEmptyString
  ): ImportVmImageRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], semanticVersion = semanticVersion.asInstanceOf[js.Any], vmImportTaskId = vmImportTaskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportVmImageRequest]
  }
  
  extension [Self <: ImportVmImageRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOsVersion(value: OsVersion): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
    
    inline def setOsVersionUndefined: Self = StObject.set(x, "osVersion", js.undefined)
    
    inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setSemanticVersion(value: VersionNumber): Self = StObject.set(x, "semanticVersion", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setVmImportTaskId(value: NonEmptyString): Self = StObject.set(x, "vmImportTaskId", value.asInstanceOf[js.Any])
  }
}
