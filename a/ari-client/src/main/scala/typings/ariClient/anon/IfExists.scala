package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IfExists extends StObject {
  
  var beep: js.UndefOr[Boolean] = js.undefined
  
  var channelId: String
  
  var format: String
  
  var ifExists: js.UndefOr[String] = js.undefined
  
  var maxDurationSeconds: js.UndefOr[Double] = js.undefined
  
  var maxSilenceSeconds: js.UndefOr[Double] = js.undefined
  
  var name: String
  
  var terminateOn: js.UndefOr[String] = js.undefined
}
object IfExists {
  
  @scala.inline
  def apply(channelId: String, format: String, name: String): IfExists = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IfExists]
  }
  
  @scala.inline
  implicit class IfExistsMutableBuilder[Self <: IfExists] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeep(value: Boolean): Self = StObject.set(x, "beep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeepUndefined: Self = StObject.set(x, "beep", js.undefined)
    
    @scala.inline
    def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfExists(value: String): Self = StObject.set(x, "ifExists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfExistsUndefined: Self = StObject.set(x, "ifExists", js.undefined)
    
    @scala.inline
    def setMaxDurationSeconds(value: Double): Self = StObject.set(x, "maxDurationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDurationSecondsUndefined: Self = StObject.set(x, "maxDurationSeconds", js.undefined)
    
    @scala.inline
    def setMaxSilenceSeconds(value: Double): Self = StObject.set(x, "maxSilenceSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSilenceSecondsUndefined: Self = StObject.set(x, "maxSilenceSeconds", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminateOn(value: String): Self = StObject.set(x, "terminateOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminateOnUndefined: Self = StObject.set(x, "terminateOn", js.undefined)
  }
}
