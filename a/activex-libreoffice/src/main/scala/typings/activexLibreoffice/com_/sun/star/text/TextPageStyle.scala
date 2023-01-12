package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a page style for a text document.
  *
  * This service extends the service {@link com.sun.star.style.PageStyle} with specific properties for text documents.
  */
trait TextPageStyle extends StObject {
  
  /**
    * contains the interface to the text of the footer.
    * @see com.sun.star.text.Text
    */
  var FooterText: XText
  
  /**
    * contains the interface to the text of the footer of a first page.
    * @see com.sun.star.text.Text
    * @since LibreOffice 4.0
    */
  var FooterTextFirst: XText
  
  /**
    * contains the interface to the text of the footer of a left page.
    * @see com.sun.star.text.Text
    */
  var FooterTextLeft: XText
  
  /**
    * contains the interface to the text of the footer of a right page.
    * @see com.sun.star.text.Text
    */
  var FooterTextRight: XText
  
  /**
    * contains the maximum height of the footnote area (in 1/100 mm).
    *
    * If set to zero, the height of the current page is used as limit.
    */
  var FootnoteHeight: Double
  
  /**
    * contains the adjustment of the separator line between the text and the footnote area.
    * @see com.sun.star.text.HorizontalAdjust
    */
  var FootnoteLineAdjust: Double
  
  /** contains the color of the separator line between the text and the footnote area. */
  var FootnoteLineColor: Color
  
  /** contains the distance between the footnote area and the separator line between the text and the footnote area (in 1/100 mm). */
  var FootnoteLineDistance: Double
  
  /** contains the relative width of the separator line between the text and the footnote area (in percent). */
  var FootnoteLineRelativeWidth: Double
  
  /** contains the distance between the text and the separator line between the text and the footnote area (in 1/100 mm). */
  var FootnoteLineTextDistance: Double
  
  /** contains the weight of the separator line between the text and the footnote area (in 1/100 mm). */
  var FootnoteLineWeight: Double
  
  /**
    * contains the interface to the text of the header.
    * @see com.sun.star.text.Text
    */
  var HeaderText: XText
  
  /**
    * contains the interface to the text of the header of first pages.
    * @see com.sun.star.text.Text
    * @since LibreOffice 4.0
    */
  var HeaderTextFirst: XText
  
  /**
    * contains the interface to the text of the header of left pages.
    * @see com.sun.star.text.Text
    */
  var HeaderTextLeft: XText
  
  /**
    * contains the interface to the text of the header of right pages.
    * @see com.sun.star.text.Text
    */
  var HeaderTextRight: XText
  
  /** determines whether the register mode is active on that page. */
  var RegisterModeActive: Boolean
  
  /** contains the name of the paragraph style that is used as reference of the register mode. */
  var RegisterParagraphStyle: String
  
  /** contains the column settings of the page. */
  var TextColumns: XTextColumns
}
object TextPageStyle {
  
  inline def apply(
    FooterText: XText,
    FooterTextFirst: XText,
    FooterTextLeft: XText,
    FooterTextRight: XText,
    FootnoteHeight: Double,
    FootnoteLineAdjust: Double,
    FootnoteLineColor: Color,
    FootnoteLineDistance: Double,
    FootnoteLineRelativeWidth: Double,
    FootnoteLineTextDistance: Double,
    FootnoteLineWeight: Double,
    HeaderText: XText,
    HeaderTextFirst: XText,
    HeaderTextLeft: XText,
    HeaderTextRight: XText,
    RegisterModeActive: Boolean,
    RegisterParagraphStyle: String,
    TextColumns: XTextColumns
  ): TextPageStyle = {
    val __obj = js.Dynamic.literal(FooterText = FooterText.asInstanceOf[js.Any], FooterTextFirst = FooterTextFirst.asInstanceOf[js.Any], FooterTextLeft = FooterTextLeft.asInstanceOf[js.Any], FooterTextRight = FooterTextRight.asInstanceOf[js.Any], FootnoteHeight = FootnoteHeight.asInstanceOf[js.Any], FootnoteLineAdjust = FootnoteLineAdjust.asInstanceOf[js.Any], FootnoteLineColor = FootnoteLineColor.asInstanceOf[js.Any], FootnoteLineDistance = FootnoteLineDistance.asInstanceOf[js.Any], FootnoteLineRelativeWidth = FootnoteLineRelativeWidth.asInstanceOf[js.Any], FootnoteLineTextDistance = FootnoteLineTextDistance.asInstanceOf[js.Any], FootnoteLineWeight = FootnoteLineWeight.asInstanceOf[js.Any], HeaderText = HeaderText.asInstanceOf[js.Any], HeaderTextFirst = HeaderTextFirst.asInstanceOf[js.Any], HeaderTextLeft = HeaderTextLeft.asInstanceOf[js.Any], HeaderTextRight = HeaderTextRight.asInstanceOf[js.Any], RegisterModeActive = RegisterModeActive.asInstanceOf[js.Any], RegisterParagraphStyle = RegisterParagraphStyle.asInstanceOf[js.Any], TextColumns = TextColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextPageStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextPageStyle] (val x: Self) extends AnyVal {
    
    inline def setFooterText(value: XText): Self = StObject.set(x, "FooterText", value.asInstanceOf[js.Any])
    
    inline def setFooterTextFirst(value: XText): Self = StObject.set(x, "FooterTextFirst", value.asInstanceOf[js.Any])
    
    inline def setFooterTextLeft(value: XText): Self = StObject.set(x, "FooterTextLeft", value.asInstanceOf[js.Any])
    
    inline def setFooterTextRight(value: XText): Self = StObject.set(x, "FooterTextRight", value.asInstanceOf[js.Any])
    
    inline def setFootnoteHeight(value: Double): Self = StObject.set(x, "FootnoteHeight", value.asInstanceOf[js.Any])
    
    inline def setFootnoteLineAdjust(value: Double): Self = StObject.set(x, "FootnoteLineAdjust", value.asInstanceOf[js.Any])
    
    inline def setFootnoteLineColor(value: Color): Self = StObject.set(x, "FootnoteLineColor", value.asInstanceOf[js.Any])
    
    inline def setFootnoteLineDistance(value: Double): Self = StObject.set(x, "FootnoteLineDistance", value.asInstanceOf[js.Any])
    
    inline def setFootnoteLineRelativeWidth(value: Double): Self = StObject.set(x, "FootnoteLineRelativeWidth", value.asInstanceOf[js.Any])
    
    inline def setFootnoteLineTextDistance(value: Double): Self = StObject.set(x, "FootnoteLineTextDistance", value.asInstanceOf[js.Any])
    
    inline def setFootnoteLineWeight(value: Double): Self = StObject.set(x, "FootnoteLineWeight", value.asInstanceOf[js.Any])
    
    inline def setHeaderText(value: XText): Self = StObject.set(x, "HeaderText", value.asInstanceOf[js.Any])
    
    inline def setHeaderTextFirst(value: XText): Self = StObject.set(x, "HeaderTextFirst", value.asInstanceOf[js.Any])
    
    inline def setHeaderTextLeft(value: XText): Self = StObject.set(x, "HeaderTextLeft", value.asInstanceOf[js.Any])
    
    inline def setHeaderTextRight(value: XText): Self = StObject.set(x, "HeaderTextRight", value.asInstanceOf[js.Any])
    
    inline def setRegisterModeActive(value: Boolean): Self = StObject.set(x, "RegisterModeActive", value.asInstanceOf[js.Any])
    
    inline def setRegisterParagraphStyle(value: String): Self = StObject.set(x, "RegisterParagraphStyle", value.asInstanceOf[js.Any])
    
    inline def setTextColumns(value: XTextColumns): Self = StObject.set(x, "TextColumns", value.asInstanceOf[js.Any])
  }
}
