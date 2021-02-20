package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StringDictionary
import typings.arangodb.arangodbStrings.id
import typings.arangodb.arangodbStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArangoSearchViewCollectionLink extends StObject {
  
  var analyzers: js.UndefOr[js.Array[String]] = js.native
  
  var fields: js.UndefOr[StringDictionary[js.UndefOr[ArangoSearchViewCollectionLink]]] = js.native
  
  var includeAllFields: js.UndefOr[Boolean] = js.native
  
  var storeValues: js.UndefOr[none | id] = js.native
  
  var trackListPositions: js.UndefOr[Boolean] = js.native
}
object ArangoSearchViewCollectionLink {
  
  @scala.inline
  def apply(): ArangoSearchViewCollectionLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArangoSearchViewCollectionLink]
  }
  
  @scala.inline
  implicit class ArangoSearchViewCollectionLinkMutableBuilder[Self <: ArangoSearchViewCollectionLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalyzers(value: js.Array[String]): Self = StObject.set(x, "analyzers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalyzersUndefined: Self = StObject.set(x, "analyzers", js.undefined)
    
    @scala.inline
    def setAnalyzersVarargs(value: String*): Self = StObject.set(x, "analyzers", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: StringDictionary[js.UndefOr[ArangoSearchViewCollectionLink]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setIncludeAllFields(value: Boolean): Self = StObject.set(x, "includeAllFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeAllFieldsUndefined: Self = StObject.set(x, "includeAllFields", js.undefined)
    
    @scala.inline
    def setStoreValues(value: none | id): Self = StObject.set(x, "storeValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreValuesUndefined: Self = StObject.set(x, "storeValues", js.undefined)
    
    @scala.inline
    def setTrackListPositions(value: Boolean): Self = StObject.set(x, "trackListPositions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackListPositionsUndefined: Self = StObject.set(x, "trackListPositions", js.undefined)
  }
}
