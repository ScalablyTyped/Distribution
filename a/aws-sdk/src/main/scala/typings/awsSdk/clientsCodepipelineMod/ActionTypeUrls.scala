package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionTypeUrls extends StObject {
  
  /**
    * The URL returned to the CodePipeline console that contains a link to the page where customers can configure the external action.
    */
  var configurationUrl: js.UndefOr[Url] = js.undefined
  
  /**
    * The URL returned to the CodePipeline console that provides a deep link to the resources of the external system, such as a status page. This link is provided as part of the action display in the pipeline.
    */
  var entityUrlTemplate: js.UndefOr[UrlTemplate] = js.undefined
  
  /**
    * The link to an execution page for the action type in progress. For example, for a CodeDeploy action, this link is shown on the pipeline view page in the CodePipeline console, and it links to a CodeDeploy status page.
    */
  var executionUrlTemplate: js.UndefOr[UrlTemplate] = js.undefined
  
  /**
    * The URL returned to the CodePipeline console that contains a link to the page where customers can update or change the configuration of the external action.
    */
  var revisionUrlTemplate: js.UndefOr[UrlTemplate] = js.undefined
}
object ActionTypeUrls {
  
  inline def apply(): ActionTypeUrls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionTypeUrls]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionTypeUrls] (val x: Self) extends AnyVal {
    
    inline def setConfigurationUrl(value: Url): Self = StObject.set(x, "configurationUrl", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUrlUndefined: Self = StObject.set(x, "configurationUrl", js.undefined)
    
    inline def setEntityUrlTemplate(value: UrlTemplate): Self = StObject.set(x, "entityUrlTemplate", value.asInstanceOf[js.Any])
    
    inline def setEntityUrlTemplateUndefined: Self = StObject.set(x, "entityUrlTemplate", js.undefined)
    
    inline def setExecutionUrlTemplate(value: UrlTemplate): Self = StObject.set(x, "executionUrlTemplate", value.asInstanceOf[js.Any])
    
    inline def setExecutionUrlTemplateUndefined: Self = StObject.set(x, "executionUrlTemplate", js.undefined)
    
    inline def setRevisionUrlTemplate(value: UrlTemplate): Self = StObject.set(x, "revisionUrlTemplate", value.asInstanceOf[js.Any])
    
    inline def setRevisionUrlTemplateUndefined: Self = StObject.set(x, "revisionUrlTemplate", js.undefined)
  }
}
