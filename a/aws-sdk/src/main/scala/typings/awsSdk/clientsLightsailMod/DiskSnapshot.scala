package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiskSnapshot extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the disk snapshot.
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The date when the disk snapshot was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the source disk from which the disk snapshot was created.
    */
  var fromDiskArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The unique name of the source disk from which the disk snapshot was created.
    */
  var fromDiskName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the source instance from which the disk (system volume) snapshot was created.
    */
  var fromInstanceArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The unique name of the source instance from which the disk (system volume) snapshot was created.
    */
  var fromInstanceName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * A Boolean value indicating whether the snapshot was created from an automatic snapshot.
    */
  var isFromAutoSnapshot: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The AWS Region and Availability Zone where the disk snapshot was created.
    */
  var location: js.UndefOr[ResourceLocation] = js.undefined
  
  /**
    * The name of the disk snapshot (e.g., my-disk-snapshot).
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The progress of the snapshot.
    */
  var progress: js.UndefOr[String] = js.undefined
  
  /**
    * The Lightsail resource type (e.g., DiskSnapshot).
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
  
  /**
    * The size of the disk in GB.
    */
  var sizeInGb: js.UndefOr[integer] = js.undefined
  
  /**
    * The status of the disk snapshot operation.
    */
  var state: js.UndefOr[DiskSnapshotState] = js.undefined
  
  /**
    * The support code. Include this code in your email to support when you have questions about an instance or another resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.undefined
  
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Amazon Lightsail Developer Guide.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object DiskSnapshot {
  
  inline def apply(): DiskSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskSnapshot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiskSnapshot] (val x: Self) extends AnyVal {
    
    inline def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setFromDiskArn(value: NonEmptyString): Self = StObject.set(x, "fromDiskArn", value.asInstanceOf[js.Any])
    
    inline def setFromDiskArnUndefined: Self = StObject.set(x, "fromDiskArn", js.undefined)
    
    inline def setFromDiskName(value: ResourceName): Self = StObject.set(x, "fromDiskName", value.asInstanceOf[js.Any])
    
    inline def setFromDiskNameUndefined: Self = StObject.set(x, "fromDiskName", js.undefined)
    
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
    
    inline def setState(value: DiskSnapshotState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setSupportCode(value: String): Self = StObject.set(x, "supportCode", value.asInstanceOf[js.Any])
    
    inline def setSupportCodeUndefined: Self = StObject.set(x, "supportCode", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
