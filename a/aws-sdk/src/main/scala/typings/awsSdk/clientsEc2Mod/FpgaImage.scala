package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FpgaImage extends StObject {
  
  /**
    * The date and time the AFI was created.
    */
  var CreateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Indicates whether data retention support is enabled for the AFI.
    */
  var DataRetentionSupport: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The description of the AFI.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The global FPGA image identifier (AGFI ID).
    */
  var FpgaImageGlobalId: js.UndefOr[String] = js.undefined
  
  /**
    * The FPGA image identifier (AFI ID).
    */
  var FpgaImageId: js.UndefOr[String] = js.undefined
  
  /**
    * The instance types supported by the AFI.
    */
  var InstanceTypes: js.UndefOr[InstanceTypesList] = js.undefined
  
  /**
    * The name of the AFI.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The alias of the AFI owner. Possible values include self, amazon, and aws-marketplace.
    */
  var OwnerAlias: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Amazon Web Services account that owns the AFI.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the PCI bus.
    */
  var PciId: js.UndefOr[typings.awsSdk.clientsEc2Mod.PciId] = js.undefined
  
  /**
    * The product codes for the AFI.
    */
  var ProductCodes: js.UndefOr[ProductCodeList] = js.undefined
  
  /**
    * Indicates whether the AFI is public.
    */
  var Public: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The version of the Amazon Web Services Shell that was used to create the bitstream.
    */
  var ShellVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the state of the AFI.
    */
  var State: js.UndefOr[FpgaImageState] = js.undefined
  
  /**
    * Any tags assigned to the AFI.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The time of the most recent update to the AFI.
    */
  var UpdateTime: js.UndefOr[js.Date] = js.undefined
}
object FpgaImage {
  
  inline def apply(): FpgaImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FpgaImage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FpgaImage] (val x: Self) extends AnyVal {
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "CreateTime", js.undefined)
    
    inline def setDataRetentionSupport(value: Boolean): Self = StObject.set(x, "DataRetentionSupport", value.asInstanceOf[js.Any])
    
    inline def setDataRetentionSupportUndefined: Self = StObject.set(x, "DataRetentionSupport", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFpgaImageGlobalId(value: String): Self = StObject.set(x, "FpgaImageGlobalId", value.asInstanceOf[js.Any])
    
    inline def setFpgaImageGlobalIdUndefined: Self = StObject.set(x, "FpgaImageGlobalId", js.undefined)
    
    inline def setFpgaImageId(value: String): Self = StObject.set(x, "FpgaImageId", value.asInstanceOf[js.Any])
    
    inline def setFpgaImageIdUndefined: Self = StObject.set(x, "FpgaImageId", js.undefined)
    
    inline def setInstanceTypes(value: InstanceTypesList): Self = StObject.set(x, "InstanceTypes", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypesUndefined: Self = StObject.set(x, "InstanceTypes", js.undefined)
    
    inline def setInstanceTypesVarargs(value: String*): Self = StObject.set(x, "InstanceTypes", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOwnerAlias(value: String): Self = StObject.set(x, "OwnerAlias", value.asInstanceOf[js.Any])
    
    inline def setOwnerAliasUndefined: Self = StObject.set(x, "OwnerAlias", js.undefined)
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setPciId(value: PciId): Self = StObject.set(x, "PciId", value.asInstanceOf[js.Any])
    
    inline def setPciIdUndefined: Self = StObject.set(x, "PciId", js.undefined)
    
    inline def setProductCodes(value: ProductCodeList): Self = StObject.set(x, "ProductCodes", value.asInstanceOf[js.Any])
    
    inline def setProductCodesUndefined: Self = StObject.set(x, "ProductCodes", js.undefined)
    
    inline def setProductCodesVarargs(value: ProductCode*): Self = StObject.set(x, "ProductCodes", js.Array(value*))
    
    inline def setPublic(value: Boolean): Self = StObject.set(x, "Public", value.asInstanceOf[js.Any])
    
    inline def setPublicUndefined: Self = StObject.set(x, "Public", js.undefined)
    
    inline def setShellVersion(value: String): Self = StObject.set(x, "ShellVersion", value.asInstanceOf[js.Any])
    
    inline def setShellVersionUndefined: Self = StObject.set(x, "ShellVersion", js.undefined)
    
    inline def setState(value: FpgaImageState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "UpdateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "UpdateTime", js.undefined)
  }
}
