package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetObjectOptions extends StObject {
  
  /**
    * The attributes that should come with witch object.
    */
  val attributesToRetrieve: js.UndefOr[js.Array[String]] = js.undefined
}
object GetObjectOptions {
  
  @scala.inline
  def apply(): GetObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetObjectOptions]
  }
  
  @scala.inline
  implicit class GetObjectOptionsMutableBuilder[Self <: GetObjectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributesToRetrieve(value: js.Array[String]): Self = StObject.set(x, "attributesToRetrieve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesToRetrieveUndefined: Self = StObject.set(x, "attributesToRetrieve", js.undefined)
    
    @scala.inline
    def setAttributesToRetrieveVarargs(value: String*): Self = StObject.set(x, "attributesToRetrieve", js.Array(value :_*))
  }
}
