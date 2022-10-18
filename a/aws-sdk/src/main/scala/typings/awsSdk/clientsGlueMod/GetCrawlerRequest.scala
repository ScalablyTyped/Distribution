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
  
  extension [Self <: GetCrawlerRequest](x: Self) {
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
