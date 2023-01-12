package typings.awsSdk.clientsKinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApplicationResponse extends StObject {
  
  /**
    * In response to your CreateApplication request, Amazon Kinesis Analytics returns a response with a summary of the application it created, including the application Amazon Resource Name (ARN), name, and status.
    */
  var ApplicationSummary: typings.awsSdk.clientsKinesisanalyticsMod.ApplicationSummary
}
object CreateApplicationResponse {
  
  inline def apply(ApplicationSummary: ApplicationSummary): CreateApplicationResponse = {
    val __obj = js.Dynamic.literal(ApplicationSummary = ApplicationSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateApplicationResponse] (val x: Self) extends AnyVal {
    
    inline def setApplicationSummary(value: ApplicationSummary): Self = StObject.set(x, "ApplicationSummary", value.asInstanceOf[js.Any])
  }
}
