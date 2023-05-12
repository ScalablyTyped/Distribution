package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeEnrichmentParameters extends StObject {
  
  /**
    * Contains the HTTP parameters to use when the target is a API Gateway REST endpoint or EventBridge ApiDestination. If you specify an API Gateway REST API or EventBridge ApiDestination as a target, you can use this parameter to specify headers, path parameters, and query string keys/values as part of your target invoking request. If you're using ApiDestinations, the corresponding Connection can also have these values configured. In case of any conflicting keys, values from the Connection take precedence.
    */
  var HttpParameters: js.UndefOr[PipeEnrichmentHttpParameters] = js.undefined
  
  /**
    * Valid JSON text passed to the enrichment. In this case, nothing from the event itself is passed to the enrichment. For more information, see The JavaScript Object Notation (JSON) Data Interchange Format.
    */
  var InputTemplate: js.UndefOr[typings.awsSdk.clientsPipesMod.InputTemplate] = js.undefined
}
object PipeEnrichmentParameters {
  
  inline def apply(): PipeEnrichmentParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipeEnrichmentParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PipeEnrichmentParameters] (val x: Self) extends AnyVal {
    
    inline def setHttpParameters(value: PipeEnrichmentHttpParameters): Self = StObject.set(x, "HttpParameters", value.asInstanceOf[js.Any])
    
    inline def setHttpParametersUndefined: Self = StObject.set(x, "HttpParameters", js.undefined)
    
    inline def setInputTemplate(value: InputTemplate): Self = StObject.set(x, "InputTemplate", value.asInstanceOf[js.Any])
    
    inline def setInputTemplateUndefined: Self = StObject.set(x, "InputTemplate", js.undefined)
  }
}
