package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultipleGetObject extends StObject {
  
  /**
    * The attributes that should be returned with the object.
    */
  val attributesToRetrieve: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The index name.
    */
  val indexName: String
  
  /**
    * The object id.
    */
  val objectID: String
}
object MultipleGetObject {
  
  @scala.inline
  def apply(indexName: String, objectID: String): MultipleGetObject = {
    val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any], objectID = objectID.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleGetObject]
  }
  
  @scala.inline
  implicit class MultipleGetObjectMutableBuilder[Self <: MultipleGetObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributesToRetrieve(value: js.Array[String]): Self = StObject.set(x, "attributesToRetrieve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesToRetrieveUndefined: Self = StObject.set(x, "attributesToRetrieve", js.undefined)
    
    @scala.inline
    def setAttributesToRetrieveVarargs(value: String*): Self = StObject.set(x, "attributesToRetrieve", js.Array(value :_*))
    
    @scala.inline
    def setIndexName(value: String): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectID(value: String): Self = StObject.set(x, "objectID", value.asInstanceOf[js.Any])
  }
}
