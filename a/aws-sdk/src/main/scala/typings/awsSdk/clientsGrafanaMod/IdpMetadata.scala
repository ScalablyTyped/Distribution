package typings.awsSdk.clientsGrafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdpMetadata extends StObject {
  
  /**
    * The URL of the location containing the IdP metadata.
    */
  var url: js.UndefOr[IdpMetadataUrl] = js.undefined
  
  /**
    * The full IdP metadata, in XML format.
    */
  var xml: js.UndefOr[String] = js.undefined
}
object IdpMetadata {
  
  inline def apply(): IdpMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdpMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdpMetadata] (val x: Self) extends AnyVal {
    
    inline def setUrl(value: IdpMetadataUrl): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setXml(value: String): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
    
    inline def setXmlUndefined: Self = StObject.set(x, "xml", js.undefined)
  }
}
