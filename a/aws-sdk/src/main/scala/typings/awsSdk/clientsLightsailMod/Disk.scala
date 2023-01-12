package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Disk extends StObject {
  
  /**
    * An array of objects representing the add-ons enabled on the disk.
    */
  var addOns: js.UndefOr[AddOnList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the disk.
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The resources to which the disk is attached.
    */
  var attachedTo: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * (Deprecated) The attachment state of the disk.  In releases prior to November 14, 2017, this parameter returned attached for system disks in the API response. It is now deprecated, but still included in the response. Use isAttached instead. 
    */
  var attachmentState: js.UndefOr[String] = js.undefined
  
  /**
    * The date when the disk was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * (Deprecated) The number of GB in use by the disk.  In releases prior to November 14, 2017, this parameter was not included in the API response. It is now deprecated. 
    */
  var gbInUse: js.UndefOr[integer] = js.undefined
  
  /**
    * The input/output operations per second (IOPS) of the disk.
    */
  var iops: js.UndefOr[integer] = js.undefined
  
  /**
    * A Boolean value indicating whether the disk is attached.
    */
  var isAttached: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean value indicating whether this disk is a system disk (has an operating system loaded on it).
    */
  var isSystemDisk: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The AWS Region and Availability Zone where the disk is located.
    */
  var location: js.UndefOr[ResourceLocation] = js.undefined
  
  /**
    * The unique name of the disk.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The disk path.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * The Lightsail resource type (e.g., Disk).
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
  
  /**
    * The size of the disk in GB.
    */
  var sizeInGb: js.UndefOr[integer] = js.undefined
  
  /**
    * Describes the status of the disk.
    */
  var state: js.UndefOr[DiskState] = js.undefined
  
  /**
    * The support code. Include this code in your email to support when you have questions about an instance or another resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.undefined
  
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Amazon Lightsail Developer Guide.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object Disk {
  
  inline def apply(): Disk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Disk]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Disk] (val x: Self) extends AnyVal {
    
    inline def setAddOns(value: AddOnList): Self = StObject.set(x, "addOns", value.asInstanceOf[js.Any])
    
    inline def setAddOnsUndefined: Self = StObject.set(x, "addOns", js.undefined)
    
    inline def setAddOnsVarargs(value: AddOn*): Self = StObject.set(x, "addOns", js.Array(value*))
    
    inline def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setAttachedTo(value: ResourceName): Self = StObject.set(x, "attachedTo", value.asInstanceOf[js.Any])
    
    inline def setAttachedToUndefined: Self = StObject.set(x, "attachedTo", js.undefined)
    
    inline def setAttachmentState(value: String): Self = StObject.set(x, "attachmentState", value.asInstanceOf[js.Any])
    
    inline def setAttachmentStateUndefined: Self = StObject.set(x, "attachmentState", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setGbInUse(value: integer): Self = StObject.set(x, "gbInUse", value.asInstanceOf[js.Any])
    
    inline def setGbInUseUndefined: Self = StObject.set(x, "gbInUse", js.undefined)
    
    inline def setIops(value: integer): Self = StObject.set(x, "iops", value.asInstanceOf[js.Any])
    
    inline def setIopsUndefined: Self = StObject.set(x, "iops", js.undefined)
    
    inline def setIsAttached(value: Boolean): Self = StObject.set(x, "isAttached", value.asInstanceOf[js.Any])
    
    inline def setIsAttachedUndefined: Self = StObject.set(x, "isAttached", js.undefined)
    
    inline def setIsSystemDisk(value: Boolean): Self = StObject.set(x, "isSystemDisk", value.asInstanceOf[js.Any])
    
    inline def setIsSystemDiskUndefined: Self = StObject.set(x, "isSystemDisk", js.undefined)
    
    inline def setLocation(value: ResourceLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setSizeInGb(value: integer): Self = StObject.set(x, "sizeInGb", value.asInstanceOf[js.Any])
    
    inline def setSizeInGbUndefined: Self = StObject.set(x, "sizeInGb", js.undefined)
    
    inline def setState(value: DiskState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setSupportCode(value: String): Self = StObject.set(x, "supportCode", value.asInstanceOf[js.Any])
    
    inline def setSupportCodeUndefined: Self = StObject.set(x, "supportCode", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
