package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAppResponse extends StObject {
  
  /**
    * The specified application, returned as an object with details including compliance status, creation time, description, resiliency score, and more.
    */
  var app: App
}
object DescribeAppResponse {
  
  inline def apply(app: App): DescribeAppResponse = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAppResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAppResponse] (val x: Self) extends AnyVal {
    
    inline def setApp(value: App): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
  }
}
