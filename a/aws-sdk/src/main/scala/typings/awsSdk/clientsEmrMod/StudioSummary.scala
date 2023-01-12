package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StudioSummary extends StObject {
  
  /**
    * Specifies whether the Studio authenticates users using IAM or Amazon Web Services SSO.
    */
  var AuthMode: js.UndefOr[typings.awsSdk.clientsEmrMod.AuthMode] = js.undefined
  
  /**
    * The time when the Amazon EMR Studio was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The detailed description of the Amazon EMR Studio.
    */
  var Description: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The name of the Amazon EMR Studio.
    */
  var Name: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The ID of the Amazon EMR Studio.
    */
  var StudioId: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The unique access URL of the Amazon EMR Studio.
    */
  var Url: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The ID of the Virtual Private Cloud (Amazon VPC) associated with the Amazon EMR Studio.
    */
  var VpcId: js.UndefOr[XmlStringMaxLen256] = js.undefined
}
object StudioSummary {
  
  inline def apply(): StudioSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StudioSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StudioSummary] (val x: Self) extends AnyVal {
    
    inline def setAuthMode(value: AuthMode): Self = StObject.set(x, "AuthMode", value.asInstanceOf[js.Any])
    
    inline def setAuthModeUndefined: Self = StObject.set(x, "AuthMode", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDescription(value: XmlStringMaxLen256): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: XmlStringMaxLen256): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStudioId(value: XmlStringMaxLen256): Self = StObject.set(x, "StudioId", value.asInstanceOf[js.Any])
    
    inline def setStudioIdUndefined: Self = StObject.set(x, "StudioId", js.undefined)
    
    inline def setUrl(value: XmlStringMaxLen256): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
    
    inline def setVpcId(value: XmlStringMaxLen256): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
