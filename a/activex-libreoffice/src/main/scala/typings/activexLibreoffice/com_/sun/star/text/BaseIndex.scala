package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexReplace
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.style.GraphicLocation
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.activexLibreoffice.com_.sun.star.util.XRefreshListener
import typings.activexLibreoffice.com_.sun.star.util.XRefreshable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies the basic service of different indexes within a document.
  * @see com.sun.star.text.DocumentIndex
  * @see com.sun.star.text.ContentIndex
  * @see com.sun.star.text.UserDefinedIndex
  * @see com.sun.star.text.IllustrationsIndex
  * @see com.sun.star.text.TableIndex
  * @see com.sun.star.text.ObjectIndex
  */
@js.native
trait BaseIndex
  extends XDocumentIndex
     with XRefreshable {
  
  /** specifies the color of the background. */
  var BackColor: Color = js.native
  
  /** contains the name of the filter of the graphic file that is displayed as background graphic */
  var BackGraphicFilter: String = js.native
  
  /**
    * determines the position of the background graphic.
    * @see GraphicLocation
    */
  var BackGraphicLocation: GraphicLocation = js.native
  
  /** contains the URL of a graphic file that is displayed as background graphic */
  var BackGraphicURL: String = js.native
  
  /** If `TRUE` , the background color value in "BackColor" is not visible. */
  var BackTransparent: Boolean = js.native
  
  /** the text section containing the content of the index */
  var ContentSection: XTextSection = js.native
  
  /**
    * determines if the content of the document index is created from the complete document content or from the current chapter only.
    *
    * It is not available in the bibliography
    */
  var CreateFromChapter: Boolean = js.native
  
  /** the text section containing the header of the index */
  var HeaderSection: XTextSection = js.native
  
  /** determines if the index is protected. */
  var IsProtected: Boolean = js.native
  
  /**
    * returns the interface of the level format of the index.
    *
    * The description of the format of the levels depends on the type of the document index.
    * @see DocumentIndexLevelFormat
    */
  var LevelFormat: XIndexReplace = js.native
  
  /** contains the name of the paragraph style that is applied to the heading. */
  var ParaStyleHeading: String = js.native
  
  /** contains the name of the paragraph style that is applied to the 1st level. */
  var ParaStyleLevel1: String = js.native
  
  /** contains the name of the paragraph style that is applied to the 10th level. */
  var ParaStyleLevel10: String = js.native
  
  /** contains the name of the paragraph style that is applied to the 2nd level. */
  var ParaStyleLevel2: String = js.native
  
  /** contains the name of the paragraph style that is applied to the 3rd level. */
  var ParaStyleLevel3: String = js.native
  
  /** contains the name of the paragraph style that is applied to the 4th level. */
  var ParaStyleLevel4: String = js.native
  
  /** contains the name of the paragraph style that is applied to the 5th level. */
  var ParaStyleLevel5: String = js.native
  
  /** contains the name of the paragraph style that is applied to the 6th level. */
  var ParaStyleLevel6: String = js.native
  
  /** contains the name of the paragraph style that is applied to the 7th level. */
  var ParaStyleLevel7: String = js.native
  
  /** contains the name of the paragraph style that is applied to the 8th level. */
  var ParaStyleLevel8: String = js.native
  
  /** contains the name of the paragraph style that is applied to the 9th level. */
  var ParaStyleLevel9: String = js.native
  
  /** contains the name of the paragraph style that is applied to the separator level. */
  var ParaStyleSeparator: String = js.native
  
  /** contains the column interface. */
  var TextColumns: XTextColumns = js.native
  
  /** contains the title of the index. */
  var Title: String = js.native
}
object BaseIndex {
  
  @scala.inline
  def apply(
    Anchor: XTextRange,
    BackColor: Color,
    BackGraphicFilter: String,
    BackGraphicLocation: GraphicLocation,
    BackGraphicURL: String,
    BackTransparent: Boolean,
    ContentSection: XTextSection,
    CreateFromChapter: Boolean,
    HeaderSection: XTextSection,
    IsProtected: Boolean,
    LevelFormat: XIndexReplace,
    ParaStyleHeading: String,
    ParaStyleLevel1: String,
    ParaStyleLevel10: String,
    ParaStyleLevel2: String,
    ParaStyleLevel3: String,
    ParaStyleLevel4: String,
    ParaStyleLevel5: String,
    ParaStyleLevel6: String,
    ParaStyleLevel7: String,
    ParaStyleLevel8: String,
    ParaStyleLevel9: String,
    ParaStyleSeparator: String,
    ServiceName: String,
    TextColumns: XTextColumns,
    Title: String,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addRefreshListener: XRefreshListener => Unit,
    attach: XTextRange => Unit,
    dispose: () => Unit,
    getAnchor: () => XTextRange,
    getServiceName: () => String,
    queryInterface: `type` => js.Any,
    refresh: () => Unit,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removeRefreshListener: XRefreshListener => Unit,
    update: () => Unit
  ): BaseIndex = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackGraphicFilter = BackGraphicFilter.asInstanceOf[js.Any], BackGraphicLocation = BackGraphicLocation.asInstanceOf[js.Any], BackGraphicURL = BackGraphicURL.asInstanceOf[js.Any], BackTransparent = BackTransparent.asInstanceOf[js.Any], ContentSection = ContentSection.asInstanceOf[js.Any], CreateFromChapter = CreateFromChapter.asInstanceOf[js.Any], HeaderSection = HeaderSection.asInstanceOf[js.Any], IsProtected = IsProtected.asInstanceOf[js.Any], LevelFormat = LevelFormat.asInstanceOf[js.Any], ParaStyleHeading = ParaStyleHeading.asInstanceOf[js.Any], ParaStyleLevel1 = ParaStyleLevel1.asInstanceOf[js.Any], ParaStyleLevel10 = ParaStyleLevel10.asInstanceOf[js.Any], ParaStyleLevel2 = ParaStyleLevel2.asInstanceOf[js.Any], ParaStyleLevel3 = ParaStyleLevel3.asInstanceOf[js.Any], ParaStyleLevel4 = ParaStyleLevel4.asInstanceOf[js.Any], ParaStyleLevel5 = ParaStyleLevel5.asInstanceOf[js.Any], ParaStyleLevel6 = ParaStyleLevel6.asInstanceOf[js.Any], ParaStyleLevel7 = ParaStyleLevel7.asInstanceOf[js.Any], ParaStyleLevel8 = ParaStyleLevel8.asInstanceOf[js.Any], ParaStyleLevel9 = ParaStyleLevel9.asInstanceOf[js.Any], ParaStyleSeparator = ParaStyleSeparator.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any], TextColumns = TextColumns.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addRefreshListener = js.Any.fromFunction1(addRefreshListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getServiceName = js.Any.fromFunction0(getServiceName), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeRefreshListener = js.Any.fromFunction1(removeRefreshListener), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[BaseIndex]
  }
  
  @scala.inline
  implicit class BaseIndexMutableBuilder[Self <: BaseIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackColor(value: Color): Self = StObject.set(x, "BackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackGraphicFilter(value: String): Self = StObject.set(x, "BackGraphicFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackGraphicLocation(value: GraphicLocation): Self = StObject.set(x, "BackGraphicLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackGraphicURL(value: String): Self = StObject.set(x, "BackGraphicURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackTransparent(value: Boolean): Self = StObject.set(x, "BackTransparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentSection(value: XTextSection): Self = StObject.set(x, "ContentSection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateFromChapter(value: Boolean): Self = StObject.set(x, "CreateFromChapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderSection(value: XTextSection): Self = StObject.set(x, "HeaderSection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsProtected(value: Boolean): Self = StObject.set(x, "IsProtected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelFormat(value: XIndexReplace): Self = StObject.set(x, "LevelFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaStyleHeading(value: String): Self = StObject.set(x, "ParaStyleHeading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaStyleLevel1(value: String): Self = StObject.set(x, "ParaStyleLevel1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaStyleLevel10(value: String): Self = StObject.set(x, "ParaStyleLevel10", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaStyleLevel2(value: String): Self = StObject.set(x, "ParaStyleLevel2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaStyleLevel3(value: String): Self = StObject.set(x, "ParaStyleLevel3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaStyleLevel4(value: String): Self = StObject.set(x, "ParaStyleLevel4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaStyleLevel5(value: String): Self = StObject.set(x, "ParaStyleLevel5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaStyleLevel6(value: String): Self = StObject.set(x, "ParaStyleLevel6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaStyleLevel7(value: String): Self = StObject.set(x, "ParaStyleLevel7", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaStyleLevel8(value: String): Self = StObject.set(x, "ParaStyleLevel8", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaStyleLevel9(value: String): Self = StObject.set(x, "ParaStyleLevel9", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaStyleSeparator(value: String): Self = StObject.set(x, "ParaStyleSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColumns(value: XTextColumns): Self = StObject.set(x, "TextColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
