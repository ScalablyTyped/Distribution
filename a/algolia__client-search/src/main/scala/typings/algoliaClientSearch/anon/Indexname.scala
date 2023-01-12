package typings.algoliaClientSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Indexname extends StObject {
  
  /**
    * Index name of the query.
    */
  val index_name: String
  
  /**
    * The offset of the query.
    */
  val offset: js.UndefOr[Double] = js.undefined
  
  /**
    * Query ID of the query.
    */
  val query_id: js.UndefOr[String] = js.undefined
  
  /**
    * The user token of the query.
    */
  val user_token: js.UndefOr[String] = js.undefined
}
object Indexname {
  
  inline def apply(index_name: String): Indexname = {
    val __obj = js.Dynamic.literal(index_name = index_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indexname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Indexname] (val x: Self) extends AnyVal {
    
    inline def setIndex_name(value: String): Self = StObject.set(x, "index_name", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setQuery_id(value: String): Self = StObject.set(x, "query_id", value.asInstanceOf[js.Any])
    
    inline def setQuery_idUndefined: Self = StObject.set(x, "query_id", js.undefined)
    
    inline def setUser_token(value: String): Self = StObject.set(x, "user_token", value.asInstanceOf[js.Any])
    
    inline def setUser_tokenUndefined: Self = StObject.set(x, "user_token", js.undefined)
  }
}
