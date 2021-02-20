package typings.arangodb.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data extends StObject {
  
  var data: String = js.native
  
  var headers: StringDictionary[js.UndefOr[String]] = js.native
}
object Data {
  
  @scala.inline
  def apply(data: String, headers: StringDictionary[js.UndefOr[String]]): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
