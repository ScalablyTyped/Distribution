package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeImagesRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Scopes the images by users with explicit launch permissions. Specify an Amazon Web Services account ID, self (the sender of the request), or all (public AMIs).   If you specify an Amazon Web Services account ID that is not your own, only AMIs shared with that specific Amazon Web Services account ID are returned. However, AMIs that are shared with the account’s organization or organizational unit (OU) are not returned.   If you specify self or your own Amazon Web Services account ID, AMIs shared with your account are returned. In addition, AMIs that are shared with the organization or OU of which you are member are also returned.    If you specify all, all public AMIs are returned.  
    */
  var ExecutableUsers: js.UndefOr[ExecutableByStringList] = js.undefined
  
  /**
    * The filters.    architecture - The image architecture (i386 | x86_64 | arm64).    block-device-mapping.delete-on-termination - A Boolean value that indicates whether the Amazon EBS volume is deleted on instance termination.    block-device-mapping.device-name - The device name specified in the block device mapping (for example, /dev/sdh or xvdh).    block-device-mapping.snapshot-id - The ID of the snapshot used for the Amazon EBS volume.    block-device-mapping.volume-size - The volume size of the Amazon EBS volume, in GiB.    block-device-mapping.volume-type - The volume type of the Amazon EBS volume (io1 | io2 | gp2 | gp3 | sc1 | st1 | standard).    block-device-mapping.encrypted - A Boolean that indicates whether the Amazon EBS volume is encrypted.    creation-date - The time when the image was created, in the ISO 8601 format in the UTC time zone (YYYY-MM-DDThh:mm:ss.sssZ), for example, 2021-09-29T11:04:43.305Z. You can use a wildcard (*), for example, 2021-09-29T*, which matches an entire day.    description - The description of the image (provided during image creation).    ena-support - A Boolean that indicates whether enhanced networking with ENA is enabled.    hypervisor - The hypervisor type (ovm | xen).    image-id - The ID of the image.    image-type - The image type (machine | kernel | ramdisk).    is-public - A Boolean that indicates whether the image is public.    kernel-id - The kernel ID.    manifest-location - The location of the image manifest.    name - The name of the AMI (provided during image creation).    owner-alias - The owner alias (amazon | aws-marketplace). The valid aliases are defined in an Amazon-maintained list. This is not the Amazon Web Services account alias that can be set using the IAM console. We recommend that you use the Owner request parameter instead of this filter.    owner-id - The Amazon Web Services account ID of the owner. We recommend that you use the Owner request parameter instead of this filter.    platform - The platform. To only list Windows-based AMIs, use windows.    product-code - The product code.    product-code.type - The type of the product code (marketplace).    ramdisk-id - The RAM disk ID.    root-device-name - The device name of the root device volume (for example, /dev/sda1).    root-device-type - The type of the root device volume (ebs | instance-store).    state - The state of the image (available | pending | failed).    state-reason-code - The reason code for the state change.    state-reason-message - The message for the state change.    sriov-net-support - A value of simple indicates that enhanced networking with the Intel 82599 VF interface is enabled.    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.    virtualization-type - The virtualization type (paravirtual | hvm).  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The image IDs. Default: Describes all images available to you.
    */
  var ImageIds: js.UndefOr[ImageIdStringList] = js.undefined
  
  /**
    * Specifies whether to include deprecated AMIs. Default: No deprecated AMIs are included in the response.  If you are the AMI owner, all deprecated AMIs appear in the response regardless of what you specify for this parameter. 
    */
  var IncludeDeprecated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Scopes the results to images with the specified owners. You can specify a combination of Amazon Web Services account IDs, self, amazon, and aws-marketplace. If you omit this parameter, the results include all images for which you have launch permissions, regardless of ownership.
    */
  var Owners: js.UndefOr[OwnerStringList] = js.undefined
}
object DescribeImagesRequest {
  
  inline def apply(): DescribeImagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImagesRequest]
  }
  
  extension [Self <: DescribeImagesRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setExecutableUsers(value: ExecutableByStringList): Self = StObject.set(x, "ExecutableUsers", value.asInstanceOf[js.Any])
    
    inline def setExecutableUsersUndefined: Self = StObject.set(x, "ExecutableUsers", js.undefined)
    
    inline def setExecutableUsersVarargs(value: String*): Self = StObject.set(x, "ExecutableUsers", js.Array(value*))
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setImageIds(value: ImageIdStringList): Self = StObject.set(x, "ImageIds", value.asInstanceOf[js.Any])
    
    inline def setImageIdsUndefined: Self = StObject.set(x, "ImageIds", js.undefined)
    
    inline def setImageIdsVarargs(value: ImageId*): Self = StObject.set(x, "ImageIds", js.Array(value*))
    
    inline def setIncludeDeprecated(value: Boolean): Self = StObject.set(x, "IncludeDeprecated", value.asInstanceOf[js.Any])
    
    inline def setIncludeDeprecatedUndefined: Self = StObject.set(x, "IncludeDeprecated", js.undefined)
    
    inline def setOwners(value: OwnerStringList): Self = StObject.set(x, "Owners", value.asInstanceOf[js.Any])
    
    inline def setOwnersUndefined: Self = StObject.set(x, "Owners", js.undefined)
    
    inline def setOwnersVarargs(value: String*): Self = StObject.set(x, "Owners", js.Array(value*))
  }
}
