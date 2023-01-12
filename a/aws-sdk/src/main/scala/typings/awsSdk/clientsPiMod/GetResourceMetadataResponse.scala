package typings.awsSdk.clientsPiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceMetadataResponse extends StObject {
  
  /**
    * The metadata for different features. For example, the metadata might indicate that a feature is turned on or off on a specific DB instance.
    */
  var Features: js.UndefOr[FeatureMetadataMap] = js.undefined
  
  /**
    * An immutable identifier for a data source that is unique for an Amazon Web Services Region. Performance Insights gathers metrics from this data source. To use a DB instance as a data source, specify its DbiResourceId value. For example, specify db-ABCDEFGHIJKLMNOPQRSTU1VW2X. 
    */
  var Identifier: js.UndefOr[String] = js.undefined
}
object GetResourceMetadataResponse {
  
  inline def apply(): GetResourceMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourceMetadataResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResourceMetadataResponse] (val x: Self) extends AnyVal {
    
    inline def setFeatures(value: FeatureMetadataMap): Self = StObject.set(x, "Features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "Features", js.undefined)
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "Identifier", js.undefined)
  }
}
