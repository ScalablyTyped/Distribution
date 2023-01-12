package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchPlaceIndexForPositionRequest extends StObject {
  
  /**
    * The name of the place index resource you want to use for the search.
    */
  var IndexName: ResourceName
  
  /**
    * The preferred language used to return results. The value must be a valid BCP 47 language tag, for example, en for English. This setting affects the languages used in the results, but not the results themselves. If no language is specified, or not supported for a particular result, the partner automatically chooses a language for the result. For an example, we'll use the Greek language. You search for a location around Athens, Greece, with the language parameter set to en. The city in the results will most likely be returned as Athens. If you set the language parameter to el, for Greek, then the city in the results will more likely be returned as Αθήνα. If the data provider does not have a value for Greek, the result will be in a language that the provider does support.
    */
  var Language: js.UndefOr[LanguageTag] = js.undefined
  
  /**
    * An optional parameter. The maximum number of results returned per request. Default value: 50 
    */
  var MaxResults: js.UndefOr[PlaceIndexSearchResultLimit] = js.undefined
  
  /**
    * Specifies the longitude and latitude of the position to query.  This parameter must contain a pair of numbers. The first number represents the X coordinate, or longitude; the second number represents the Y coordinate, or latitude. For example, [-123.1174, 49.2847] represents a position with longitude -123.1174 and latitude 49.2847.
    */
  var Position: typings.awsSdk.clientsLocationMod.Position
}
object SearchPlaceIndexForPositionRequest {
  
  inline def apply(IndexName: ResourceName, Position: Position): SearchPlaceIndexForPositionRequest = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPlaceIndexForPositionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchPlaceIndexForPositionRequest] (val x: Self) extends AnyVal {
    
    inline def setIndexName(value: ResourceName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: LanguageTag): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "Language", js.undefined)
    
    inline def setMaxResults(value: PlaceIndexSearchResultLimit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setPosition(value: Position): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setPositionVarargs(value: Double*): Self = StObject.set(x, "Position", js.Array(value*))
  }
}
