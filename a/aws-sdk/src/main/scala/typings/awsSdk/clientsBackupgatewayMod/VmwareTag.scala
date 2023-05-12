package typings.awsSdk.clientsBackupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VmwareTag extends StObject {
  
  /**
    * The is the category of VMware.
    */
  var VmwareCategory: js.UndefOr[typings.awsSdk.clientsBackupgatewayMod.VmwareCategory] = js.undefined
  
  /**
    * This is a user-defined description of a VMware tag.
    */
  var VmwareTagDescription: js.UndefOr[String] = js.undefined
  
  /**
    * This is the user-defined name of a VMware tag.
    */
  var VmwareTagName: js.UndefOr[typings.awsSdk.clientsBackupgatewayMod.VmwareTagName] = js.undefined
}
object VmwareTag {
  
  inline def apply(): VmwareTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VmwareTag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VmwareTag] (val x: Self) extends AnyVal {
    
    inline def setVmwareCategory(value: VmwareCategory): Self = StObject.set(x, "VmwareCategory", value.asInstanceOf[js.Any])
    
    inline def setVmwareCategoryUndefined: Self = StObject.set(x, "VmwareCategory", js.undefined)
    
    inline def setVmwareTagDescription(value: String): Self = StObject.set(x, "VmwareTagDescription", value.asInstanceOf[js.Any])
    
    inline def setVmwareTagDescriptionUndefined: Self = StObject.set(x, "VmwareTagDescription", js.undefined)
    
    inline def setVmwareTagName(value: VmwareTagName): Self = StObject.set(x, "VmwareTagName", value.asInstanceOf[js.Any])
    
    inline def setVmwareTagNameUndefined: Self = StObject.set(x, "VmwareTagName", js.undefined)
  }
}
