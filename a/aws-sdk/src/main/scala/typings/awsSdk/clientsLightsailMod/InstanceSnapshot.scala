package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceSnapshot extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the snapshot (e.g., arn:aws:lightsail:us-east-2:123456789101:InstanceSnapshot/d23b5706-3322-4d83-81e5-12345EXAMPLE).
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The timestamp when the snapshot was created (e.g., 1479907467.024).
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * An array of disk objects containing information about all block storage disks.
    */
  var fromAttachedDisks: js.UndefOr[DiskList] = js.undefined
  
  /**
    * The blueprint ID from which you created the snapshot (e.g., os_debian_8_3). A blueprint is a virtual private server (or instance) image used to create instances quickly.
    */
  var fromBlueprintId: js.UndefOr[String] = js.undefined
  
  /**
    * The bundle ID from which you created the snapshot (e.g., micro_1_0).
    */
  var fromBundleId: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the instance from which the snapshot was created (e.g., arn:aws:lightsail:us-east-2:123456789101:Instance/64b8404c-ccb1-430b-8daf-12345EXAMPLE).
    */
  var fromInstanceArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The instance from which the snapshot was created.
    */
  var fromInstanceName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * A Boolean value indicating whether the snapshot was created from an automatic snapshot.
    */
  var isFromAutoSnapshot: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The region name and Availability Zone where you created the snapshot.
    */
  var location: js.UndefOr[ResourceLocation] = js.undefined
  
  /**
    * The name of the snapshot.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The progress of the snapshot.  This is populated only for disk snapshots, and is null for instance snapshots. 
    */
  var progress: js.UndefOr[String] = js.undefined
  
  /**
    * The type of resource (usually InstanceSnapshot).
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
  
  /**
    * The size in GB of the SSD.
    */
  var sizeInGb: js.UndefOr[integer] = js.undefined
  
  /**
    * The state the snapshot is in.
    */
  var state: js.UndefOr[InstanceSnapshotState] = js.undefined
  
  /**
    * The support code. Include this code in your email to support when you have questions about an instance or another resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.undefined
  
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Amazon Lightsail Developer Guide.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object InstanceSnapshot {
  
  inline def apply(): InstanceSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceSnapshot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceSnapshot] (val x: Self) extends AnyVal {
    
    inline def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setFromAttachedDisks(value: DiskList): Self = StObject.set(x, "fromAttachedDisks", value.asInstanceOf[js.Any])
    
    inline def setFromAttachedDisksUndefined: Self = StObject.set(x, "fromAttachedDisks", js.undefined)
    
    inline def setFromAttachedDisksVarargs(value: Disk*): Self = StObject.set(x, "fromAttachedDisks", js.Array(value*))
    
    inline def setFromBlueprintId(value: String): Self = StObject.set(x, "fromBlueprintId", value.asInstanceOf[js.Any])
    
    inline def setFromBlueprintIdUndefined: Self = StObject.set(x, "fromBlueprintId", js.undefined)
    
    inline def setFromBundleId(value: String): Self = StObject.set(x, "fromBundleId", value.asInstanceOf[js.Any])
    
    inline def setFromBundleIdUndefined: Self = StObject.set(x, "fromBundleId", js.undefined)
    
    inline def setFromInstanceArn(value: NonEmptyString): Self = StObject.set(x, "fromInstanceArn", value.asInstanceOf[js.Any])
    
    inline def setFromInstanceArnUndefined: Self = StObject.set(x, "fromInstanceArn", js.undefined)
    
    inline def setFromInstanceName(value: ResourceName): Self = StObject.set(x, "fromInstanceName", value.asInstanceOf[js.Any])
    
    inline def setFromInstanceNameUndefined: Self = StObject.set(x, "fromInstanceName", js.undefined)
    
    inline def setIsFromAutoSnapshot(value: Boolean): Self = StObject.set(x, "isFromAutoSnapshot", value.asInstanceOf[js.Any])
    
    inline def setIsFromAutoSnapshotUndefined: Self = StObject.set(x, "isFromAutoSnapshot", js.undefined)
    
    inline def setLocation(value: ResourceLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProgress(value: String): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setSizeInGb(value: integer): Self = StObject.set(x, "sizeInGb", value.asInstanceOf[js.Any])
    
    inline def setSizeInGbUndefined: Self = StObject.set(x, "sizeInGb", js.undefined)
    
    inline def setState(value: InstanceSnapshotState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setSupportCode(value: String): Self = StObject.set(x, "supportCode", value.asInstanceOf[js.Any])
    
    inline def setSupportCodeUndefined: Self = StObject.set(x, "supportCode", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
