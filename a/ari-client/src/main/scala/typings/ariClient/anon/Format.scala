package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Format extends StObject {
  
  var beep: js.UndefOr[Boolean] = js.native
  
  var format: String = js.native
  
  var ifExists: js.UndefOr[String] = js.native
  
  var maxDurationSeconds: js.UndefOr[Double] = js.native
  
  var maxSilenceSeconds: js.UndefOr[Double] = js.native
  
  var name: String = js.native
  
  var terminateOn: js.UndefOr[String] = js.native
}
object Format {
  
  @scala.inline
  def apply(format: String, name: String): Format = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
  
  @scala.inline
  implicit class FormatMutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeep(value: Boolean): Self = StObject.set(x, "beep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeepUndefined: Self = StObject.set(x, "beep", js.undefined)
    
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
