package typings.awsDashSdk.clientsMigrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutResourceAttributesRequest extends js.Object {
  /**
    * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission to make the call.
    */
  var DryRun: js.UndefOr[typings.awsDashSdk.clientsMigrationhubMod.DryRun] = js.undefined
  /**
    * Unique identifier that references the migration task.
    */
  var MigrationTaskName: typings.awsDashSdk.clientsMigrationhubMod.MigrationTaskName
  /**
    * The name of the ProgressUpdateStream. 
    */
  var ProgressUpdateStream: typings.awsDashSdk.clientsMigrationhubMod.ProgressUpdateStream
  /**
    * Information about the resource that is being migrated. This data will be used to map the task to a resource in the Application Discovery Service (ADS)'s repository.  Takes the object array of ResourceAttribute where the Type field is reserved for the following values: IPV4_ADDRESS | IPV6_ADDRESS | MAC_ADDRESS | FQDN | VM_MANAGER_ID | VM_MANAGED_OBJECT_REFERENCE | VM_NAME | VM_PATH | BIOS_ID | MOTHERBOARD_SERIAL_NUMBER where the identifying value can be a string up to 256 characters.     If any "VM" related value is set for a ResourceAttribute object, it is required that VM_MANAGER_ID, as a minimum, is always set. If VM_MANAGER_ID is not set, then all "VM" fields will be discarded and "VM" fields will not be used for matching the migration task to a server in Application Discovery Service (ADS)'s repository. See the Example section below for a use case of specifying "VM" related values.    If a server you are trying to match has multiple IP or MAC addresses, you should provide as many as you know in separate type/value pairs passed to the ResourceAttributeList parameter to maximize the chances of matching.   
    */
  var ResourceAttributeList: typings.awsDashSdk.clientsMigrationhubMod.ResourceAttributeList
}

object PutResourceAttributesRequest {
  @scala.inline
  def apply(
    MigrationTaskName: MigrationTaskName,
    ProgressUpdateStream: ProgressUpdateStream,
    ResourceAttributeList: ResourceAttributeList,
    DryRun: js.UndefOr[DryRun] = js.undefined
  ): PutResourceAttributesRequest = {
    val __obj = js.Dynamic.literal(MigrationTaskName = MigrationTaskName, ProgressUpdateStream = ProgressUpdateStream, ResourceAttributeList = ResourceAttributeList)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[PutResourceAttributesRequest]
  }
}

