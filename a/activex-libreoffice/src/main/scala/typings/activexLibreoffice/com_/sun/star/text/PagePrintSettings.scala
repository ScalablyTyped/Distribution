package typings.activexLibreoffice.com_.sun.star.text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** These properties describe the way the {@link XPagePrintable} interface prints the page on one printer page. */
trait PagePrintSettings extends StObject {
  
  /** contains the right margin of the printer page. */
  var BottomMargin: Double
  
  /** contains the margin between the rows of printed pages. */
  var HoriMargin: Double
  
  /** defines if the printer page is used in landscape format. */
  var IsLandscape: Boolean
  
  /** contains the left margin of the printer page. */
  var LeftMargin: Double
  
  /** contains the number of pages per printed row of pages. */
  var PageColumns: Double
  
  /** contains the number of pages per printed column of pages. */
  var PageRows: Double
  
  /** contains the right margin of the printer page. */
  var RightMargin: Double
  
  /** contains the top margin of the printer page. */
  var TopMargin: Double
  
  /** contains the margin between the columns of printed pages. */
  var VertMargin: Double
}
object PagePrintSettings {
  
  @scala.inline
  def apply(
    BottomMargin: Double,
    HoriMargin: Double,
    IsLandscape: Boolean,
    LeftMargin: Double,
    PageColumns: Double,
    PageRows: Double,
    RightMargin: Double,
    TopMargin: Double,
    VertMargin: Double
  ): PagePrintSettings = {
    val __obj = js.Dynamic.literal(BottomMargin = BottomMargin.asInstanceOf[js.Any], HoriMargin = HoriMargin.asInstanceOf[js.Any], IsLandscape = IsLandscape.asInstanceOf[js.Any], LeftMargin = LeftMargin.asInstanceOf[js.Any], PageColumns = PageColumns.asInstanceOf[js.Any], PageRows = PageRows.asInstanceOf[js.Any], RightMargin = RightMargin.asInstanceOf[js.Any], TopMargin = TopMargin.asInstanceOf[js.Any], VertMargin = VertMargin.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagePrintSettings]
  }
  
  @scala.inline
  implicit class PagePrintSettingsMutableBuilder[Self <: PagePrintSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottomMargin(value: Double): Self = StObject.set(x, "BottomMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoriMargin(value: Double): Self = StObject.set(x, "HoriMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLandscape(value: Boolean): Self = StObject.set(x, "IsLandscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftMargin(value: Double): Self = StObject.set(x, "LeftMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageColumns(value: Double): Self = StObject.set(x, "PageColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageRows(value: Double): Self = StObject.set(x, "PageRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightMargin(value: Double): Self = StObject.set(x, "RightMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopMargin(value: Double): Self = StObject.set(x, "TopMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertMargin(value: Double): Self = StObject.set(x, "VertMargin", value.asInstanceOf[js.Any])
  }
}
