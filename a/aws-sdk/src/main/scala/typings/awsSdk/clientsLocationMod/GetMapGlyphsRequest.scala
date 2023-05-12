package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMapGlyphsRequest extends StObject {
  
  /**
    * A comma-separated list of fonts to load glyphs from in order of preference. For example, Noto Sans Regular, Arial Unicode. Valid fonts stacks for Esri styles:    VectorEsriDarkGrayCanvas – Ubuntu Medium Italic | Ubuntu Medium | Ubuntu Italic | Ubuntu Regular | Ubuntu Bold    VectorEsriLightGrayCanvas – Ubuntu Italic | Ubuntu Regular | Ubuntu Light | Ubuntu Bold    VectorEsriTopographic – Noto Sans Italic | Noto Sans Regular | Noto Sans Bold | Noto Serif Regular | Roboto Condensed Light Italic    VectorEsriStreets – Arial Regular | Arial Italic | Arial Bold    VectorEsriNavigation – Arial Regular | Arial Italic | Arial Bold    Valid font stacks for HERE Technologies styles:   VectorHereContrast – Fira GO Regular | Fira GO Bold    VectorHereExplore, VectorHereExploreTruck, HybridHereExploreSatellite – Fira GO Italic | Fira GO Map | Fira GO Map Bold | Noto Sans CJK JP Bold | Noto Sans CJK JP Light | Noto Sans CJK JP Regular    Valid font stacks for GrabMaps styles:   VectorGrabStandardLight, VectorGrabStandardDark – Noto Sans Regular | Noto Sans Medium | Noto Sans Bold    Valid font stacks for Open Data styles:   VectorOpenDataStandardLight, VectorOpenDataStandardDark, VectorOpenDataVisualizationLight, VectorOpenDataVisualizationDark – Amazon Ember Regular,Noto Sans Regular | Amazon Ember Bold,Noto Sans Bold | Amazon Ember Medium,Noto Sans Medium | Amazon Ember Regular Italic,Noto Sans Italic | Amazon Ember Condensed RC Regular,Noto Sans Regular | Amazon Ember Condensed RC Bold,Noto Sans Bold     The fonts used by the Open Data map styles are combined fonts that use Amazon Ember for most glyphs but Noto Sans for glyphs unsupported by Amazon Ember. 
    */
  var FontStack: String
  
  /**
    * A Unicode range of characters to download glyphs for. Each response will contain 256 characters. For example, 0–255 includes all characters from range U+0000 to 00FF. Must be aligned to multiples of 256.
    */
  var FontUnicodeRange: GetMapGlyphsRequestFontUnicodeRangeString
  
  /**
    * The optional API key to authorize the request.
    */
  var Key: js.UndefOr[ApiKey] = js.undefined
  
  /**
    * The map resource associated with the glyph ﬁle.
    */
  var MapName: ResourceName
}
object GetMapGlyphsRequest {
  
  inline def apply(
    FontStack: String,
    FontUnicodeRange: GetMapGlyphsRequestFontUnicodeRangeString,
    MapName: ResourceName
  ): GetMapGlyphsRequest = {
    val __obj = js.Dynamic.literal(FontStack = FontStack.asInstanceOf[js.Any], FontUnicodeRange = FontUnicodeRange.asInstanceOf[js.Any], MapName = MapName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMapGlyphsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMapGlyphsRequest] (val x: Self) extends AnyVal {
    
    inline def setFontStack(value: String): Self = StObject.set(x, "FontStack", value.asInstanceOf[js.Any])
    
    inline def setFontUnicodeRange(value: GetMapGlyphsRequestFontUnicodeRangeString): Self = StObject.set(x, "FontUnicodeRange", value.asInstanceOf[js.Any])
    
    inline def setKey(value: ApiKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setMapName(value: ResourceName): Self = StObject.set(x, "MapName", value.asInstanceOf[js.Any])
  }
}
