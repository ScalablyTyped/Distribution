package typings.awsSdk.clientsCloudsearchdomainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hit extends StObject {
  
  /**
    * The expressions returned from a document that matches the search request.
    */
  var exprs: js.UndefOr[Exprs] = js.undefined
  
  /**
    * The fields returned from a document that matches the search request.
    */
  var fields: js.UndefOr[Fields] = js.undefined
  
  /**
    * The highlights returned from a document that matches the search request.
    */
  var highlights: js.UndefOr[Highlights] = js.undefined
  
  /**
    * The document ID of a document that matches the search request.
    */
  var id: js.UndefOr[String] = js.undefined
}
object Hit {
  
  inline def apply(): Hit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hit]
  }
  
  extension [Self <: Hit](x: Self) {
    
    inline def setExprs(value: Exprs): Self = StObject.set(x, "exprs", value.asInstanceOf[js.Any])
    
    inline def setExprsUndefined: Self = StObject.set(x, "exprs", js.undefined)
    
    inline def setFields(value: Fields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setHighlights(value: Highlights): Self = StObject.set(x, "highlights", value.asInstanceOf[js.Any])
    
    inline def setHighlightsUndefined: Self = StObject.set(x, "highlights", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
