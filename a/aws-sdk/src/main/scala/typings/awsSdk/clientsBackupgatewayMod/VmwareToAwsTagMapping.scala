package typings.awsSdk.clientsBackupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VmwareToAwsTagMapping extends StObject {
  
  /**
    * The key part of the Amazon Web Services tag's key-value pair.
    */
  var AwsTagKey: TagKey
  
  /**
    * The value part of the Amazon Web Services tag's key-value pair.
    */
  var AwsTagValue: TagValue
  
  /**
    * The is the category of VMware.
    */
  var VmwareCategory: typings.awsSdk.clientsBackupgatewayMod.VmwareCategory
  
  /**
    * This is the user-defined name of a VMware tag.
    */
  var VmwareTagName: typings.awsSdk.clientsBackupgatewayMod.VmwareTagName
}
object VmwareToAwsTagMapping {
  
  inline def apply(
    AwsTagKey: TagKey,
    AwsTagValue: TagValue,
    VmwareCategory: VmwareCategory,
    VmwareTagName: VmwareTagName
  ): VmwareToAwsTagMapping = {
    val __obj = js.Dynamic.literal(AwsTagKey = AwsTagKey.asInstanceOf[js.Any], AwsTagValue = AwsTagValue.asInstanceOf[js.Any], VmwareCategory = VmwareCategory.asInstanceOf[js.Any], VmwareTagName = VmwareTagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VmwareToAwsTagMapping]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VmwareToAwsTagMapping] (val x: Self) extends AnyVal {
    
    inline def setAwsTagKey(value: TagKey): Self = StObject.set(x, "AwsTagKey", value.asInstanceOf[js.Any])
    
    inline def setAwsTagValue(value: TagValue): Self = StObject.set(x, "AwsTagValue", value.asInstanceOf[js.Any])
    
    inline def setVmwareCategory(value: VmwareCategory): Self = StObject.set(x, "VmwareCategory", value.asInstanceOf[js.Any])
    
    inline def setVmwareTagName(value: VmwareTagName): Self = StObject.set(x, "VmwareTagName", value.asInstanceOf[js.Any])
  }
}
