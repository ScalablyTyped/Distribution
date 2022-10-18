package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SAMLIdp extends StObject {
  
  /**
    * The unique Entity ID of the application in SAML Identity Provider.
    */
  var EntityId: SAMLEntityId
  
  /**
    * The Metadata of the SAML application in xml format.
    */
  var MetadataContent: SAMLMetadata
}
object SAMLIdp {
  
  inline def apply(EntityId: SAMLEntityId, MetadataContent: SAMLMetadata): SAMLIdp = {
    val __obj = js.Dynamic.literal(EntityId = EntityId.asInstanceOf[js.Any], MetadataContent = MetadataContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SAMLIdp]
  }
  
  extension [Self <: SAMLIdp](x: Self) {
    
    inline def setEntityId(value: SAMLEntityId): Self = StObject.set(x, "EntityId", value.asInstanceOf[js.Any])
    
    inline def setMetadataContent(value: SAMLMetadata): Self = StObject.set(x, "MetadataContent", value.asInstanceOf[js.Any])
  }
}
