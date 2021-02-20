package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexReplace
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.style.GraphicLocation
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.activexLibreoffice.com_.sun.star.util.XRefreshListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies service of user defined indexes within a document.
  * @see com.sun.star.text.BaseIndex
  */
@js.native
trait UserIndex extends BaseIndex {
  
  /** determines if embedded objects are included in the index. */
  var CreateFromEmbeddedObjects: Boolean = js.native
  
  /** determines if graphic objects are included in the index. */
  var CreateFromGraphicObjects: Boolean = js.native
  
  /** determines if the document index marks are included in this index. */
  var CreateFromMarks: Boolean = js.native
  
  /** determines if tables are included in the index. */
  var CreateFromTables: Boolean = js.native
  
  /** determines if text frames are included in the index. */
  var CreateFromTextFrames: Boolean = js.native
  
  /**
    * contains the interface to access the paragraph style names that are included in this index.
    * @see DocumentIndexParagraphStyles
    */
  var LevelParagraphStyles: XIndexReplace = js.native
  
  /** determines if the outline level of the location of the indexed object is used as index level of the index entry. */
  var UseLevelFromSource: Boolean = js.native
  
  /** contains the name of the user index. */
  var UserIndexName: String = js.native
}
object UserIndex {
  
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
    CreateFromEmbeddedObjects: Boolean,
    CreateFromGraphicObjects: Boolean,
    CreateFromMarks: Boolean,
    CreateFromTables: Boolean,
    CreateFromTextFrames: Boolean,
    HeaderSection: XTextSection,
    IsProtected: Boolean,
    LevelFormat: XIndexReplace,
    LevelParagraphStyles: XIndexReplace,
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
    UseLevelFromSource: Boolean,
    UserIndexName: String,
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
  ): UserIndex = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackGraphicFilter = BackGraphicFilter.asInstanceOf[js.Any], BackGraphicLocation = BackGraphicLocation.asInstanceOf[js.Any], BackGraphicURL = BackGraphicURL.asInstanceOf[js.Any], BackTransparent = BackTransparent.asInstanceOf[js.Any], ContentSection = ContentSection.asInstanceOf[js.Any], CreateFromChapter = CreateFromChapter.asInstanceOf[js.Any], CreateFromEmbeddedObjects = CreateFromEmbeddedObjects.asInstanceOf[js.Any], CreateFromGraphicObjects = CreateFromGraphicObjects.asInstanceOf[js.Any], CreateFromMarks = CreateFromMarks.asInstanceOf[js.Any], CreateFromTables = CreateFromTables.asInstanceOf[js.Any], CreateFromTextFrames = CreateFromTextFrames.asInstanceOf[js.Any], HeaderSection = HeaderSection.asInstanceOf[js.Any], IsProtected = IsProtected.asInstanceOf[js.Any], LevelFormat = LevelFormat.asInstanceOf[js.Any], LevelParagraphStyles = LevelParagraphStyles.asInstanceOf[js.Any], ParaStyleHeading = ParaStyleHeading.asInstanceOf[js.Any], ParaStyleLevel1 = ParaStyleLevel1.asInstanceOf[js.Any], ParaStyleLevel10 = ParaStyleLevel10.asInstanceOf[js.Any], ParaStyleLevel2 = ParaStyleLevel2.asInstanceOf[js.Any], ParaStyleLevel3 = ParaStyleLevel3.asInstanceOf[js.Any], ParaStyleLevel4 = ParaStyleLevel4.asInstanceOf[js.Any], ParaStyleLevel5 = ParaStyleLevel5.asInstanceOf[js.Any], ParaStyleLevel6 = ParaStyleLevel6.asInstanceOf[js.Any], ParaStyleLevel7 = ParaStyleLevel7.asInstanceOf[js.Any], ParaStyleLevel8 = ParaStyleLevel8.asInstanceOf[js.Any], ParaStyleLevel9 = ParaStyleLevel9.asInstanceOf[js.Any], ParaStyleSeparator = ParaStyleSeparator.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any], TextColumns = TextColumns.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], UseLevelFromSource = UseLevelFromSource.asInstanceOf[js.Any], UserIndexName = UserIndexName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addRefreshListener = js.Any.fromFunction1(addRefreshListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getServiceName = js.Any.fromFunction0(getServiceName), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeRefreshListener = js.Any.fromFunction1(removeRefreshListener), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[UserIndex]
  }
  
  @scala.inline
  implicit class UserIndexMutableBuilder[Self <: UserIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateFromEmbeddedObjects(value: Boolean): Self = StObject.set(x, "CreateFromEmbeddedObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateFromGraphicObjects(value: Boolean): Self = StObject.set(x, "CreateFromGraphicObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateFromMarks(value: Boolean): Self = StObject.set(x, "CreateFromMarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateFromTables(value: Boolean): Self = StObject.set(x, "CreateFromTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateFromTextFrames(value: Boolean): Self = StObject.set(x, "CreateFromTextFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelParagraphStyles(value: XIndexReplace): Self = StObject.set(x, "LevelParagraphStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseLevelFromSource(value: Boolean): Self = StObject.set(x, "UseLevelFromSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIndexName(value: String): Self = StObject.set(x, "UserIndexName", value.asInstanceOf[js.Any])
  }
}
