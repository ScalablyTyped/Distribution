package typings.activexLibreoffice.com_.sun.star.view

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the settings for printing documents.
  *
  * These settings are printer independent but affect the rendering of the document.
  */
@js.native
trait PrintSettings extends js.Object {
  /**
    * determines how annotations are printed.
    * @see NotePrintMode
    */
  var PrintAnnotationMode: Double = js.native
  /**
    * If `TRUE` , all characters are printed in black.
    *
    * It is useful for printing colored text on a b/w printer.
    */
  var PrintBlackFonts: Boolean = js.native
  /** If `TRUE` , control shapes are included in printing. */
  var PrintControls: Boolean = js.native
  /** If `TRUE` , drawing objects (shapes) are included in printing. */
  var PrintDrawings: Boolean = js.native
  /** If `TRUE` , graphic objects are included in printing. */
  var PrintGraphics: Boolean = js.native
  /** If `TRUE` , left pages are included in printing. */
  var PrintLeftPages: Boolean = js.native
  /** If `TRUE` , the background of the page is printed. */
  var PrintPageBackground: Boolean = js.native
  /** If `TRUE` , the pages are printed in the order of prospects. */
  var PrintProspect: Boolean = js.native
  /**
    * If `TRUE` , the pages are printed in reverse order.
    *
    * The last page is printed first.
    */
  var PrintReversed: Boolean = js.native
  /** If `TRUE` , right pages are included in printing. */
  var PrintRightPages: Boolean = js.native
  /** If `TRUE` , tables are included in printing. */
  var PrintTables: Boolean = js.native
}

object PrintSettings {
  @scala.inline
  def apply(
    PrintAnnotationMode: Double,
    PrintBlackFonts: Boolean,
    PrintControls: Boolean,
    PrintDrawings: Boolean,
    PrintGraphics: Boolean,
    PrintLeftPages: Boolean,
    PrintPageBackground: Boolean,
    PrintProspect: Boolean,
    PrintReversed: Boolean,
    PrintRightPages: Boolean,
    PrintTables: Boolean
  ): PrintSettings = {
    val __obj = js.Dynamic.literal(PrintAnnotationMode = PrintAnnotationMode.asInstanceOf[js.Any], PrintBlackFonts = PrintBlackFonts.asInstanceOf[js.Any], PrintControls = PrintControls.asInstanceOf[js.Any], PrintDrawings = PrintDrawings.asInstanceOf[js.Any], PrintGraphics = PrintGraphics.asInstanceOf[js.Any], PrintLeftPages = PrintLeftPages.asInstanceOf[js.Any], PrintPageBackground = PrintPageBackground.asInstanceOf[js.Any], PrintProspect = PrintProspect.asInstanceOf[js.Any], PrintReversed = PrintReversed.asInstanceOf[js.Any], PrintRightPages = PrintRightPages.asInstanceOf[js.Any], PrintTables = PrintTables.asInstanceOf[js.Any])
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
    def setPrintAnnotationMode(value: Double): Self = this.set("PrintAnnotationMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrintBlackFonts(value: Boolean): Self = this.set("PrintBlackFonts", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrintControls(value: Boolean): Self = this.set("PrintControls", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrintDrawings(value: Boolean): Self = this.set("PrintDrawings", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrintGraphics(value: Boolean): Self = this.set("PrintGraphics", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrintLeftPages(value: Boolean): Self = this.set("PrintLeftPages", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrintPageBackground(value: Boolean): Self = this.set("PrintPageBackground", value.asInstanceOf[js.Any])
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

