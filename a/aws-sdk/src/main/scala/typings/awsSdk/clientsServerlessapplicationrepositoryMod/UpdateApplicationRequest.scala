package typings.awsSdk.clientsServerlessapplicationrepositoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApplicationRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationId: string
  
  /**
    * The name of the author publishing the app.Minimum length=1. Maximum length=127.Pattern "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
    */
  var Author: js.UndefOr[string] = js.undefined
  
  /**
    * The description of the application.Minimum length=1. Maximum length=256
    */
  var Description: js.UndefOr[string] = js.undefined
  
  /**
    * A URL with more information about the application, for example the location of your GitHub repository for the application.
    */
  var HomePageUrl: js.UndefOr[string] = js.undefined
  
  /**
    * Labels to improve discovery of apps in search results.Minimum length=1. Maximum length=127. Maximum number of labels: 10Pattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
    */
  var Labels: js.UndefOr[listOfString] = js.undefined
  
  /**
    * A text readme file in Markdown language that contains a more detailed description of the application and how it works.Maximum size 5 MB
    */
  var ReadmeBody: js.UndefOr[string] = js.undefined
  
  /**
    * A link to the readme file in Markdown language that contains a more detailed description of the application and how it works.Maximum size 5 MB
    */
  var ReadmeUrl: js.UndefOr[string] = js.undefined
}
object UpdateApplicationRequest {
  
  inline def apply(ApplicationId: string): UpdateApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationRequest]
  }
  
  extension [Self <: UpdateApplicationRequest](x: Self) {
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setAuthor(value: string): Self = StObject.set(x, "Author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "Author", js.undefined)
    
    inline def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setHomePageUrl(value: string): Self = StObject.set(x, "HomePageUrl", value.asInstanceOf[js.Any])
    
    inline def setHomePageUrlUndefined: Self = StObject.set(x, "HomePageUrl", js.undefined)
    
    inline def setLabels(value: listOfString): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "Labels", js.undefined)
    
    inline def setLabelsVarargs(value: string*): Self = StObject.set(x, "Labels", js.Array(value*))
    
    inline def setReadmeBody(value: string): Self = StObject.set(x, "ReadmeBody", value.asInstanceOf[js.Any])
    
    inline def setReadmeBodyUndefined: Self = StObject.set(x, "ReadmeBody", js.undefined)
    
    inline def setReadmeUrl(value: string): Self = StObject.set(x, "ReadmeUrl", value.asInstanceOf[js.Any])
    
    inline def setReadmeUrlUndefined: Self = StObject.set(x, "ReadmeUrl", js.undefined)
  }
}
