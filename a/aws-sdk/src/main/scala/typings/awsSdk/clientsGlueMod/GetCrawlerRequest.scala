package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCrawlerRequest extends StObject {
  
  /**
    * The name of the crawler to retrieve metadata for.
    */
  var Name: NameString
}
object GetCrawlerRequest {
  
  inline def apply(Name: NameString): GetCrawlerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCrawlerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCrawlerRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
