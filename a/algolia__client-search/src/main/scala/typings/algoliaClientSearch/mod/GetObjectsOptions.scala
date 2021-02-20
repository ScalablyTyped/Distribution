package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetObjectsOptions extends StObject {
  
  /**
    * The attributes that should come with witch object.
    */
  val attributesToRetrieve: js.UndefOr[js.Array[String]] = js.native
}
object GetObjectsOptions {
  
  @scala.inline
  def apply(): GetObjectsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetObjectsOptions]
  }
  
  @scala.inline
  implicit class GetObjectsOptionsMutableBuilder[Self <: GetObjectsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributesToRetrieve(value: js.Array[String]): Self = StObject.set(x, "attributesToRetrieve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesToRetrieveUndefined: Self = StObject.set(x, "attributesToRetrieve", js.undefined)
    
    @scala.inline
    def setAttributesToRetrieveVarargs(value: String*): Self = StObject.set(x, "attributesToRetrieve", js.Array(value :_*))
  }
}
