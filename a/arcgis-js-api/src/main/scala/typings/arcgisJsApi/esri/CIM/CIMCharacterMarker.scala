package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMCharacterMarker
  extends CIMMarker
     with CIMSymbolLayerType {
  
  /**
    * The Unicode decimal value for the individual glyph of the font that defines the shape of the marker.
    */
  var characterIndex: js.UndefOr[Double] = js.native
  
  /**
    * The depth of the marker when drawn in 3D.
    */
  var depth3D: js.UndefOr[Double] = js.native
  
  /**
    * The font family name of the font. e.g. Comic Sans.
    */
  var fontFamilyName: js.UndefOr[String] = js.native
  
  /**
    * The style name for the font family. e.g. Regular, Bold, or Italic.
    */
  var fontStyleName: js.UndefOr[String] = js.native
  
  /**
    * The font type.
    */
  var fontType: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FontType * / any */ String
  ] = js.native
  
  /**
    * A value indicating whether the frame of the character marker should be honored when transforming the marker.
    */
  var respectFrame: js.UndefOr[Boolean] = js.native
  
  /**
    * A value indicating whether the strokes and/or fills of a marker are scaled proportionally when the symbol size is changed. When enabled, the strokes for the outline or fill of the polygon symbol used to draw the marker will be scaled proportionally with changes to the symbol size. If this property is not enabled, the stroke will draw with the specified width regardless of the marker size.
    */
  var scaleSymbolsProportionally: js.UndefOr[Boolean] = js.native
  
  /**
    * The width of the symbol without changing the height (or depth in 3D), as a ratio.
    */
  var scaleX: js.UndefOr[Double] = js.native
  
  /**
    * The polygon symbol that is used to renderer the marker.
    */
  var symbol: js.UndefOr[CIMPolygonSymbol] = js.native
  
  @JSName("type")
  var type_CIMCharacterMarker: typings.arcgisJsApi.arcgisJsApiStrings.CIMCharacterMarker = js.native
  
  /**
    * A value indicating whether the marker stands a marker upright as though locked in place. The marker can be viewed from all angles.
    */
  var verticalOrientation3D: js.UndefOr[Boolean] = js.native
}
object CIMCharacterMarker {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMCharacterMarker): CIMCharacterMarker = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMCharacterMarker]
  }
  
  @scala.inline
  implicit class CIMCharacterMarkerOps[Self <: CIMCharacterMarker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMCharacterMarker): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacterIndex(value: Double): Self = this.set("characterIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharacterIndex: Self = this.set("characterIndex", js.undefined)
    
    @scala.inline
    def setDepth3D(value: Double): Self = this.set("depth3D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepth3D: Self = this.set("depth3D", js.undefined)
    
    @scala.inline
    def setFontFamilyName(value: String): Self = this.set("fontFamilyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamilyName: Self = this.set("fontFamilyName", js.undefined)
    
    @scala.inline
    def setFontStyleName(value: String): Self = this.set("fontStyleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStyleName: Self = this.set("fontStyleName", js.undefined)
    
    @scala.inline
    def setFontType(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FontType * / any */ String
    ): Self = this.set("fontType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontType: Self = this.set("fontType", js.undefined)
    
    @scala.inline
    def setRespectFrame(value: Boolean): Self = this.set("respectFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRespectFrame: Self = this.set("respectFrame", js.undefined)
    
    @scala.inline
    def setScaleSymbolsProportionally(value: Boolean): Self = this.set("scaleSymbolsProportionally", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleSymbolsProportionally: Self = this.set("scaleSymbolsProportionally", js.undefined)
    
    @scala.inline
    def setScaleX(value: Double): Self = this.set("scaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleX: Self = this.set("scaleX", js.undefined)
    
    @scala.inline
    def setSymbol(value: CIMPolygonSymbol): Self = this.set("symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
    
    @scala.inline
    def setVerticalOrientation3D(value: Boolean): Self = this.set("verticalOrientation3D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalOrientation3D: Self = this.set("verticalOrientation3D", js.undefined)
  }
}
