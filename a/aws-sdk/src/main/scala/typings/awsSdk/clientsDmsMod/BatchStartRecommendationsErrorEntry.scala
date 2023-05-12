package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchStartRecommendationsErrorEntry extends StObject {
  
  /**
    * The code of an error that occurred during the analysis of the source database.
    */
  var Code: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier of the source database.
    */
  var DatabaseId: js.UndefOr[String] = js.undefined
  
  /**
    * The information about the error.
    */
  var Message: js.UndefOr[String] = js.undefined
}
object BatchStartRecommendationsErrorEntry {
  
  inline def apply(): BatchStartRecommendationsErrorEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchStartRecommendationsErrorEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchStartRecommendationsErrorEntry] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setDatabaseId(value: String): Self = StObject.set(x, "DatabaseId", value.asInstanceOf[js.Any])
    
    inline def setDatabaseIdUndefined: Self = StObject.set(x, "DatabaseId", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
