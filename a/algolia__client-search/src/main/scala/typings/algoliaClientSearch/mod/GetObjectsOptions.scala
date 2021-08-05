package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetObjectsOptions extends StObject {
  
  /**
    * The attributes that should come with witch object.
    */
  val attributesToRetrieve: js.UndefOr[js.Array[String]] = js.undefined
}
object GetObjectsOptions {
  
  inline def apply(): GetObjectsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetObjectsOptions]
  }
  
  extension [Self <: GetObjectsOptions](x: Self) {
    
    inline def setAttributesToRetrieve(value: js.Array[String]): Self = StObject.set(x, "attributesToRetrieve", value.asInstanceOf[js.Any])
    
    inline def setAttributesToRetrieveUndefined: Self = StObject.set(x, "attributesToRetrieve", js.undefined)
    
    inline def setAttributesToRetrieveVarargs(value: String*): Self = StObject.set(x, "attributesToRetrieve", js.Array(value :_*))
  }
}
