package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPlaceRequest extends StObject {
  
  /**
    * The name of the place index resource that you want to use for the search.
    */
  var IndexName: ResourceName
  
  /**
    * The preferred language used to return results. The value must be a valid BCP 47 language tag, for example, en for English. This setting affects the languages used in the results, but not the results themselves. If no language is specified, or not supported for a particular result, the partner automatically chooses a language for the result. For an example, we'll use the Greek language. You search for a location around Athens, Greece, with the language parameter set to en. The city in the results will most likely be returned as Athens. If you set the language parameter to el, for Greek, then the city in the results will more likely be returned as Αθήνα. If the data provider does not have a value for Greek, the result will be in a language that the provider does support.
    */
  var Language: js.UndefOr[LanguageTag] = js.undefined
  
  /**
    * The identifier of the place to find.
    */
  var PlaceId: typings.awsSdk.clientsLocationMod.PlaceId
}
object GetPlaceRequest {
  
  inline def apply(IndexName: ResourceName, PlaceId: PlaceId): GetPlaceRequest = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], PlaceId = PlaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPlaceRequest]
  }
  
  extension [Self <: GetPlaceRequest](x: Self) {
    
    inline def setIndexName(value: ResourceName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: LanguageTag): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "Language", js.undefined)
    
    inline def setPlaceId(value: PlaceId): Self = StObject.set(x, "PlaceId", value.asInstanceOf[js.Any])
  }
}
