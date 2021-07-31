package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Formats extends StObject {
  
  var app: String
  
  var appArgs: js.UndefOr[String] = js.undefined
  
  var endpoint: String
  
  var formats: js.UndefOr[String] = js.undefined
  
  var originator: js.UndefOr[String] = js.undefined
  
  var otherChannelId: js.UndefOr[String] = js.undefined
}
object Formats {
  
  @scala.inline
  def apply(app: String, endpoint: String): Formats = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Formats]
  }
  
  @scala.inline
  implicit class FormatsMutableBuilder[Self <: Formats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppArgs(value: String): Self = StObject.set(x, "appArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppArgsUndefined: Self = StObject.set(x, "appArgs", js.undefined)
    
    @scala.inline
    def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormats(value: String): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
    
    @scala.inline
    def setOriginator(value: String): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginatorUndefined: Self = StObject.set(x, "originator", js.undefined)
    
    @scala.inline
    def setOtherChannelId(value: String): Self = StObject.set(x, "otherChannelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherChannelIdUndefined: Self = StObject.set(x, "otherChannelId", js.undefined)
  }
}
