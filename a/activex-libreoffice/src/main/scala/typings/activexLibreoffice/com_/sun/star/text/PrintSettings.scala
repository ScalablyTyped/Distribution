package typings.activexLibreoffice.com_.sun.star.text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** These properties describe the printing of the content of a text document. */
@js.native
trait PrintSettings extends js.Object {
  
  /**
    * determines how notes are printed.
    * @see NotePrintMode
    */
  var PrintAnnotationMode: NotePrintMode = js.native
  
  /** determines if characters are always printed in black. */
  var PrintBlackFonts: Boolean = js.native
  
  /** determines if control shapes are printed. */
  var PrintControls: Boolean = js.native
  
  /** determines if shapes are printed. */
  var PrintDrawings: Boolean = js.native
  
  /** determines if automatically inserted empty pages are printed. */
  var PrintEmptyPages: Boolean = js.native
  
  /** contains the name of the fax. */
  var PrintFaxName: String = js.native
  
  /** determines if graphic objects are printed */
  var PrintGraphics: Boolean = js.native
  
  /** determines if left pages are printed. */
  var PrintLeftPages: Boolean = js.native
  
  /** determines if the background color / background graphic of pages is printed. */
  var PrintPageBackground: Boolean = js.native
  
  /**
    * specifies if the printer paper tray selection of the system printer is used.
    *
    * If com::sun::star::view::PrintSettings::PaperFromSetup is `FALSE` , then the paper tray selection of the page styles is used.
    */
  var PrintPaperFromSetup: Boolean = js.native
  
  /** determines if prospect printing is used. */
  var PrintProspect: Boolean = js.native
  
  /** determines if the pages are printed in the reverse order, starting with the last page. */
  var PrintReversed: Boolean = js.native
  
  /** determines if right pages are printed. */
  var PrintRightPages: Boolean = js.native
  
  /** determines if text tables are printed. */
  var PrintTables: Boolean = js.native
}
object PrintSettings {
  
  @scala.inline
  def apply(
    PrintAnnotationMode: NotePrintMode,
    PrintBlackFonts: Boolean,
    PrintControls: Boolean,
    PrintDrawings: Boolean,
    PrintEmptyPages: Boolean,
    PrintFaxName: String,
    PrintGraphics: Boolean,
    PrintLeftPages: Boolean,
    PrintPageBackground: Boolean,
    PrintPaperFromSetup: Boolean,
    PrintProspect: Boolean,
    PrintReversed: Boolean,
    PrintRightPages: Boolean,
    PrintTables: Boolean
  ): PrintSettings = {
    val __obj = js.Dynamic.literal(PrintAnnotationMode = PrintAnnotationMode.asInstanceOf[js.Any], PrintBlackFonts = PrintBlackFonts.asInstanceOf[js.Any], PrintControls = PrintControls.asInstanceOf[js.Any], PrintDrawings = PrintDrawings.asInstanceOf[js.Any], PrintEmptyPages = PrintEmptyPages.asInstanceOf[js.Any], PrintFaxName = PrintFaxName.asInstanceOf[js.Any], PrintGraphics = PrintGraphics.asInstanceOf[js.Any], PrintLeftPages = PrintLeftPages.asInstanceOf[js.Any], PrintPageBackground = PrintPageBackground.asInstanceOf[js.Any], PrintPaperFromSetup = PrintPaperFromSetup.asInstanceOf[js.Any], PrintProspect = PrintProspect.asInstanceOf[js.Any], PrintReversed = PrintReversed.asInstanceOf[js.Any], PrintRightPages = PrintRightPages.asInstanceOf[js.Any], PrintTables = PrintTables.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintSettings]
  }
  
  @scala.inline
  implicit class PrintSettingsOps[Self <: PrintSettings] (val x: Self) extends AnyVal {
    
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
    def setPrintAnnotationMode(value: NotePrintMode): Self = this.set("PrintAnnotationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintBlackFonts(value: Boolean): Self = this.set("PrintBlackFonts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintControls(value: Boolean): Self = this.set("PrintControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintDrawings(value: Boolean): Self = this.set("PrintDrawings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintEmptyPages(value: Boolean): Self = this.set("PrintEmptyPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintFaxName(value: String): Self = this.set("PrintFaxName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintGraphics(value: Boolean): Self = this.set("PrintGraphics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintLeftPages(value: Boolean): Self = this.set("PrintLeftPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintPageBackground(value: Boolean): Self = this.set("PrintPageBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintPaperFromSetup(value: Boolean): Self = this.set("PrintPaperFromSetup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintProspect(value: Boolean): Self = this.set("PrintProspect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintReversed(value: Boolean): Self = this.set("PrintReversed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintRightPages(value: Boolean): Self = this.set("PrintRightPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintTables(value: Boolean): Self = this.set("PrintTables", value.asInstanceOf[js.Any])
  }
}
