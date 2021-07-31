package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.document.Settings
import typings.activexLibreoffice.com_.sun.star.i18n.XForbiddenCharacters
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** describes properties that apply to the whole text document. */
trait DocumentSettings
  extends StObject
     with Settings
     with PrintSettings {
  
  /**
    * specifies if paragraph and table spacing is added at the bottom of table cells
    *
    * This property controls, if the spacing of the last paragraph respectively table of a table cell is added at the bottom of this table cells If `TRUE`
    * (default for documents since OpenOffice.org 2.0), the spacing of the last paragraph respectively table of a table cell is added at the bottom of this
    * table cell. If `FALSE` (typically for documents till OpenOffice.org 1.1), the spacing of the last paragraph respectively table of a table cell isn't
    * added at the bottom of this table cell.
    * @since OOo 2.0
    */
  var AddParaSpacingToTableCells: Boolean
  
  /**
    * specifies if spacing between paragraphs and tables is to be added.
    *
    * If between two paragraphs, two tables, or a paragraph and a table, you have defined spacing above and below each object, usually only the larger one
    * of the two spaces is used. If the spacing between the objects are to be added this property has to be `TRUE` .
    */
  var AddParaTableSpacing: Boolean
  
  /**
    * specifies if top paragraph spacing is applied to paragraphs on the first page of text documents.
    *
    * If `TRUE` , the paragraph or table spacing to the top will also be effective at the beginning of a page or column if the paragraph or table is
    * positioned on the first page of the document. The same applies for a page break.
    */
  var AddParaTableSpacingAtStart: Boolean
  
  /**
    * specifies the alignment of tab stops in text documents.
    *
    * If `TRUE` centered and right-aligned paragraphs containing tabs are formatted as a whole in the center or aligned to the right. If `FALSE` , only the
    * text to the right of the last tab, for example, is aligned to the right, while the text to the left remains where it is.
    */
  var AlignTabStopPosition: Boolean
  
  /**
    * specifies if charts in text documents are updated automatically.
    *
    * This has no effect if "FieldAutoUpdate" is `FALSE` .
    */
  var ChartAutoUpdate: Boolean
  
  /**
    * specifies if the text wrap of floating screen objects are considered in a specified way in the positioning algorithm.
    *
    * This property controls how floating screen objects (Writer fly frames and drawing objects) are positioned. If `TRUE` , the object positioning
    * algorithm will consider the text wrap style, set at the floating screen object. The attribute {@link BaseFrameProperties.WrapInfluenceOnPosition}
    * specifies how the text wrap is considered. If `FALSE` (default value), the former object positioning algorithm (known from OpenOffice.org 1.1) is
    * applied.
    * @since OOo 2.0
    */
  var ConsiderTextWrapOnObjPos: Boolean
  
  /**
    * specifies if the document has been created as a label document.
    *
    * This property indicates that the document contains multiple text frames and that the content of one frame is duplicated into the other frames by
    * internally linked text sections.
    */
  var IsLabelDocument: Boolean
  
  /**
    * specifies if Math objects should automatically vertically aligned to match the baseline of the surrounding text.
    *
    * If activated formula object that are anchored 'As Character' will be vertically aligned to have their baseline match with the one from the text.
    * @since OOo 3.4
    */
  var MathBaselineAlignment: Boolean
  
  /**
    * specifies if the contents of links in the global document are saved or not.
    *
    * This property applies only for master documents.
    *
    * **Note** : This name is a bit misleading, it should be something like `SaveLinkedDocumentContent` .
    */
  var SaveGlobalDocumentLinks: Boolean
  
  /**
    * specifies if the former (till OpenOffice.org 1.1) or the new line spacing formatting is applied.
    *
    * This property controls how a set line spacing at a paragraph influences the formatting of the text lines and the spacing between paragraphs. If `TRUE`
    * , the formatting till OpenOffice.org 1.1 is applied. This means, that a proportional line spacing is applied above and below a text line and that the
    * maximum of the line spacing value between two paragraph is added respectively reckoned up with the paragraph spacing (adding or reckoning up is
    * controlled by document option AddParaTableSpacing). If `FALSE` (default for documents since OpenOffice.org 2.0), a proportional line spacing is only
    * applied below a text line and it's always added to the paragraph spacing between two paragraphs.
    * @since OOo 2.0
    */
  var UseFormerLineSpacing: Boolean
  
  /**
    * specifies if the former (till OpenOffice.org 1.1) or the new object positioning is applied.
    *
    * This property controls how floating screen objects (Writer fly frames and drawing objects are positioned. If `TRUE` , the object positioning till
    * OpenOffice.org 1.1 is applied. This means, that the top of a paragraph, at which a floating screen object orients its vertical position, includes the
    * lower spacing and the line spacing of the previous paragraph. If `FALSE` (default for documents since OpenOffice.org 2.0), the top of a paragraph, at
    * which a floating screen object orients its vertical position, doesn't include the lower spacing and the line spacing of the previous paragraph.
    * @since OOo 2.0
    */
  var UseFormerObjectPositioning: Boolean
}
object DocumentSettings {
  
  @scala.inline
  def apply(
    AddExternalLeading: Boolean,
    AddParaSpacingToTableCells: Boolean,
    AddParaTableSpacing: Boolean,
    AddParaTableSpacingAtStart: Boolean,
    AlignTabStopPosition: Boolean,
    ApplyUserData: Boolean,
    AutoCalculate: Boolean,
    BitmapTableURL: String,
    CharacterCompressionType: Double,
    ChartAutoUpdate: Boolean,
    ColorTableURL: String,
    ConsiderTextWrapOnObjPos: Boolean,
    CurrentDatabaseCommand: String,
    CurrentDatabaseCommandType: Double,
    CurrentDatabaseDataSource: String,
    DashTableURL: String,
    DefaultTabStop: Double,
    EmbedFonts: Boolean,
    EmbedSystemFonts: Boolean,
    FieldAutoUpdate: Boolean,
    ForbiddenCharacters: XForbiddenCharacters,
    GradientTableURL: String,
    HatchTableURL: String,
    IsKernAsianPunctuation: Boolean,
    IsLabelDocument: Boolean,
    IsPrintBooklet: Boolean,
    IsPrintBookletBack: Boolean,
    IsPrintBookletFront: Boolean,
    LineEndTableURL: String,
    LinkUpdateMode: Double,
    MathBaselineAlignment: Boolean,
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
    PrintQuality: Double,
    PrintReversed: Boolean,
    PrintRightPages: Boolean,
    PrintTables: Boolean,
    PrinterIndependentLayout: Double,
    PrinterName: String,
    PrinterSetup: SafeArray[Double],
    PropertySetInfo: XPropertySetInfo,
    SaveGlobalDocumentLinks: Boolean,
    SaveVersionOnClose: Boolean,
    UpdateFromTemplate: Boolean,
    UseFormerLineSpacing: Boolean,
    UseFormerObjectPositioning: Boolean,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): DocumentSettings = {
    val __obj = js.Dynamic.literal(AddExternalLeading = AddExternalLeading.asInstanceOf[js.Any], AddParaSpacingToTableCells = AddParaSpacingToTableCells.asInstanceOf[js.Any], AddParaTableSpacing = AddParaTableSpacing.asInstanceOf[js.Any], AddParaTableSpacingAtStart = AddParaTableSpacingAtStart.asInstanceOf[js.Any], AlignTabStopPosition = AlignTabStopPosition.asInstanceOf[js.Any], ApplyUserData = ApplyUserData.asInstanceOf[js.Any], AutoCalculate = AutoCalculate.asInstanceOf[js.Any], BitmapTableURL = BitmapTableURL.asInstanceOf[js.Any], CharacterCompressionType = CharacterCompressionType.asInstanceOf[js.Any], ChartAutoUpdate = ChartAutoUpdate.asInstanceOf[js.Any], ColorTableURL = ColorTableURL.asInstanceOf[js.Any], ConsiderTextWrapOnObjPos = ConsiderTextWrapOnObjPos.asInstanceOf[js.Any], CurrentDatabaseCommand = CurrentDatabaseCommand.asInstanceOf[js.Any], CurrentDatabaseCommandType = CurrentDatabaseCommandType.asInstanceOf[js.Any], CurrentDatabaseDataSource = CurrentDatabaseDataSource.asInstanceOf[js.Any], DashTableURL = DashTableURL.asInstanceOf[js.Any], DefaultTabStop = DefaultTabStop.asInstanceOf[js.Any], EmbedFonts = EmbedFonts.asInstanceOf[js.Any], EmbedSystemFonts = EmbedSystemFonts.asInstanceOf[js.Any], FieldAutoUpdate = FieldAutoUpdate.asInstanceOf[js.Any], ForbiddenCharacters = ForbiddenCharacters.asInstanceOf[js.Any], GradientTableURL = GradientTableURL.asInstanceOf[js.Any], HatchTableURL = HatchTableURL.asInstanceOf[js.Any], IsKernAsianPunctuation = IsKernAsianPunctuation.asInstanceOf[js.Any], IsLabelDocument = IsLabelDocument.asInstanceOf[js.Any], IsPrintBooklet = IsPrintBooklet.asInstanceOf[js.Any], IsPrintBookletBack = IsPrintBookletBack.asInstanceOf[js.Any], IsPrintBookletFront = IsPrintBookletFront.asInstanceOf[js.Any], LineEndTableURL = LineEndTableURL.asInstanceOf[js.Any], LinkUpdateMode = LinkUpdateMode.asInstanceOf[js.Any], MathBaselineAlignment = MathBaselineAlignment.asInstanceOf[js.Any], PrintAnnotationMode = PrintAnnotationMode.asInstanceOf[js.Any], PrintBlackFonts = PrintBlackFonts.asInstanceOf[js.Any], PrintControls = PrintControls.asInstanceOf[js.Any], PrintDrawings = PrintDrawings.asInstanceOf[js.Any], PrintEmptyPages = PrintEmptyPages.asInstanceOf[js.Any], PrintFaxName = PrintFaxName.asInstanceOf[js.Any], PrintGraphics = PrintGraphics.asInstanceOf[js.Any], PrintLeftPages = PrintLeftPages.asInstanceOf[js.Any], PrintPageBackground = PrintPageBackground.asInstanceOf[js.Any], PrintPaperFromSetup = PrintPaperFromSetup.asInstanceOf[js.Any], PrintProspect = PrintProspect.asInstanceOf[js.Any], PrintQuality = PrintQuality.asInstanceOf[js.Any], PrintReversed = PrintReversed.asInstanceOf[js.Any], PrintRightPages = PrintRightPages.asInstanceOf[js.Any], PrintTables = PrintTables.asInstanceOf[js.Any], PrinterIndependentLayout = PrinterIndependentLayout.asInstanceOf[js.Any], PrinterName = PrinterName.asInstanceOf[js.Any], PrinterSetup = PrinterSetup.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], SaveGlobalDocumentLinks = SaveGlobalDocumentLinks.asInstanceOf[js.Any], SaveVersionOnClose = SaveVersionOnClose.asInstanceOf[js.Any], UpdateFromTemplate = UpdateFromTemplate.asInstanceOf[js.Any], UseFormerLineSpacing = UseFormerLineSpacing.asInstanceOf[js.Any], UseFormerObjectPositioning = UseFormerObjectPositioning.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[DocumentSettings]
  }
  
  @scala.inline
  implicit class DocumentSettingsMutableBuilder[Self <: DocumentSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddParaSpacingToTableCells(value: Boolean): Self = StObject.set(x, "AddParaSpacingToTableCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddParaTableSpacing(value: Boolean): Self = StObject.set(x, "AddParaTableSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddParaTableSpacingAtStart(value: Boolean): Self = StObject.set(x, "AddParaTableSpacingAtStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignTabStopPosition(value: Boolean): Self = StObject.set(x, "AlignTabStopPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartAutoUpdate(value: Boolean): Self = StObject.set(x, "ChartAutoUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsiderTextWrapOnObjPos(value: Boolean): Self = StObject.set(x, "ConsiderTextWrapOnObjPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLabelDocument(value: Boolean): Self = StObject.set(x, "IsLabelDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMathBaselineAlignment(value: Boolean): Self = StObject.set(x, "MathBaselineAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveGlobalDocumentLinks(value: Boolean): Self = StObject.set(x, "SaveGlobalDocumentLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseFormerLineSpacing(value: Boolean): Self = StObject.set(x, "UseFormerLineSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseFormerObjectPositioning(value: Boolean): Self = StObject.set(x, "UseFormerObjectPositioning", value.asInstanceOf[js.Any])
  }
}
