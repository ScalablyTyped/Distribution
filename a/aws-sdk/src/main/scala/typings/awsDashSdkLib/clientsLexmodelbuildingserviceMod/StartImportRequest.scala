package typings
package awsDashSdkLib.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartImportRequest extends js.Object {
  /**
    * Specifies the action that the StartImport operation should take when there is an existing resource with the same name.   FAIL_ON_CONFLICT - The import operation is stopped on the first conflict between a resource in the import file and an existing resource. The name of the resource causing the conflict is in the failureReason field of the response to the GetImport operation. OVERWRITE_LATEST - The import operation proceeds even if there is a conflict with an existing resource. The $LASTEST version of the existing resource is overwritten with the data from the import file.  
    */
  var mergeStrategy: MergeStrategy
  /**
    * A zip archive in binary format. The archive should contain one file, a JSON file containing the resource to import. The resource should match the type specified in the resourceType field.
    */
  var payload: _Blob
  /**
    * Specifies the type of resource to export. Each resource also exports any resources that it depends on.    A bot exports dependent intents.   An intent exports dependent slot types.  
    */
  var resourceType: ResourceType
}

object StartImportRequest {
  @scala.inline
  def apply(mergeStrategy: MergeStrategy, payload: _Blob, resourceType: ResourceType): StartImportRequest = {
    val __obj = js.Dynamic.literal(mergeStrategy = mergeStrategy.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StartImportRequest]
  }
}

