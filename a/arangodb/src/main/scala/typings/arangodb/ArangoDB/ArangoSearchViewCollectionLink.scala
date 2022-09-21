package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StringDictionary
import typings.arangodb.arangodbStrings.id
import typings.arangodb.arangodbStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArangoSearchViewCollectionLink extends StObject {
  
  var analyzers: js.UndefOr[js.Array[String]] = js.undefined
  
  var fields: js.UndefOr[StringDictionary[js.UndefOr[ArangoSearchViewCollectionLink]]] = js.undefined
  
  var includeAllFields: js.UndefOr[Boolean] = js.undefined
  
  var storeValues: js.UndefOr[none | id] = js.undefined
  
  var trackListPositions: js.UndefOr[Boolean] = js.undefined
}
object ArangoSearchViewCollectionLink {
  
  inline def apply(): ArangoSearchViewCollectionLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArangoSearchViewCollectionLink]
  }
  
  extension [Self <: ArangoSearchViewCollectionLink](x: Self) {
    
    inline def setAnalyzers(value: js.Array[String]): Self = StObject.set(x, "analyzers", value.asInstanceOf[js.Any])
    
    inline def setAnalyzersUndefined: Self = StObject.set(x, "analyzers", js.undefined)
    
    inline def setAnalyzersVarargs(value: String*): Self = StObject.set(x, "analyzers", js.Array(value*))
    
    inline def setFields(value: StringDictionary[js.UndefOr[ArangoSearchViewCollectionLink]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setIncludeAllFields(value: Boolean): Self = StObject.set(x, "includeAllFields", value.asInstanceOf[js.Any])
    
    inline def setIncludeAllFieldsUndefined: Self = StObject.set(x, "includeAllFields", js.undefined)
    
    inline def setStoreValues(value: none | id): Self = StObject.set(x, "storeValues", value.asInstanceOf[js.Any])
    
    inline def setStoreValuesUndefined: Self = StObject.set(x, "storeValues", js.undefined)
    
    inline def setTrackListPositions(value: Boolean): Self = StObject.set(x, "trackListPositions", value.asInstanceOf[js.Any])
    
    inline def setTrackListPositionsUndefined: Self = StObject.set(x, "trackListPositions", js.undefined)
  }
}
