package typings.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSiteInput extends StObject {
  
  var Description: js.UndefOr[SiteDescription] = js.undefined
  
  var Name: js.UndefOr[SiteName] = js.undefined
  
  /**
    * Notes about a site.
    */
  var Notes: js.UndefOr[SiteNotes] = js.undefined
  
  /**
    *  The ID or the Amazon Resource Name (ARN) of the site. 
    */
  var SiteId: typings.awsSdk.clientsOutpostsMod.SiteId
}
object UpdateSiteInput {
  
  inline def apply(SiteId: SiteId): UpdateSiteInput = {
    val __obj = js.Dynamic.literal(SiteId = SiteId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSiteInput]
  }
  
  extension [Self <: UpdateSiteInput](x: Self) {
    
    inline def setDescription(value: SiteDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: SiteName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNotes(value: SiteNotes): Self = StObject.set(x, "Notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "Notes", js.undefined)
    
    inline def setSiteId(value: SiteId): Self = StObject.set(x, "SiteId", value.asInstanceOf[js.Any])
  }
}
