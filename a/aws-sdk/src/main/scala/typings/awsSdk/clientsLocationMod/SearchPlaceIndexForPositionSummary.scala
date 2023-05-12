package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchPlaceIndexForPositionSummary extends StObject {
  
  /**
    * The geospatial data provider attached to the place index resource specified in the request. Values can be one of the following:   Esri   Grab   Here   For more information about data providers, see Amazon Location Service data providers.
    */
  var DataSource: String
  
  /**
    * The preferred language used to return results. Matches the language in the request. The value is a valid BCP 47 language tag, for example, en for English.
    */
  var Language: js.UndefOr[LanguageTag] = js.undefined
  
  /**
    * Contains the optional result count limit that is specified in the request. Default value: 50 
    */
  var MaxResults: js.UndefOr[PlaceIndexSearchResultLimit] = js.undefined
  
  /**
    * The position specified in the request.
    */
  var Position: typings.awsSdk.clientsLocationMod.Position
}
object SearchPlaceIndexForPositionSummary {
  
  inline def apply(DataSource: String, Position: Position): SearchPlaceIndexForPositionSummary = {
    val __obj = js.Dynamic.literal(DataSource = DataSource.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPlaceIndexForPositionSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchPlaceIndexForPositionSummary] (val x: Self) extends AnyVal {
    
    inline def setDataSource(value: String): Self = StObject.set(x, "DataSource", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: LanguageTag): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "Language", js.undefined)
    
    inline def setMaxResults(value: PlaceIndexSearchResultLimit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setPosition(value: Position): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setPositionVarargs(value: Double*): Self = StObject.set(x, "Position", js.Array(value*))
  }
}
