package typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.NamedValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.embedNs.XStorage
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.DateTime
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides document-specific information such as the author, creation date, and user-defined fields.
  *
  * This service replaces the deprecated DocumentInfo and StandaloneDocumentInfo services.
  * @see XDocumentProperties
  * @see XDocumentPropertiesSupplier
  * @since OOo 3.0
  */
trait DocumentProperties extends XDocumentProperties {
  /** constructs default-initialized instance */
  def create(): Unit
}

object DocumentProperties {
  @scala.inline
  def apply(
    Author: String,
    AutoloadSecs: Double,
    AutoloadURL: String,
    CreationDate: DateTime,
    DefaultTarget: String,
    Description: String,
    DocumentStatistics: SafeArray[NamedValue],
    EditingCycles: Double,
    EditingDuration: Double,
    Generator: String,
    Keywords: SafeArray[String],
    Language: Locale,
    ModificationDate: DateTime,
    ModifiedBy: String,
    PrintDate: DateTime,
    PrintedBy: String,
    Subject: String,
    TemplateDate: DateTime,
    TemplateName: String,
    TemplateURL: String,
    Title: String,
    UserDefinedProperties: XPropertyContainer,
    create: () => Unit,
    getUserDefinedProperties: () => XPropertyContainer,
    loadFromMedium: (String, SeqEquiv[PropertyValue]) => Unit,
    loadFromStorage: (XStorage, SeqEquiv[PropertyValue]) => Unit,
    resetUserData: String => Unit,
    storeToMedium: (String, SeqEquiv[PropertyValue]) => Unit,
    storeToStorage: (XStorage, SeqEquiv[PropertyValue]) => Unit
  ): DocumentProperties = {
    val __obj = js.Dynamic.literal(Author = Author, AutoloadSecs = AutoloadSecs, AutoloadURL = AutoloadURL, CreationDate = CreationDate, DefaultTarget = DefaultTarget, Description = Description, DocumentStatistics = DocumentStatistics, EditingCycles = EditingCycles, EditingDuration = EditingDuration, Generator = Generator, Keywords = Keywords, Language = Language, ModificationDate = ModificationDate, ModifiedBy = ModifiedBy, PrintDate = PrintDate, PrintedBy = PrintedBy, Subject = Subject, TemplateDate = TemplateDate, TemplateName = TemplateName, TemplateURL = TemplateURL, Title = Title, UserDefinedProperties = UserDefinedProperties, create = js.Any.fromFunction0(create), getUserDefinedProperties = js.Any.fromFunction0(getUserDefinedProperties), loadFromMedium = js.Any.fromFunction2(loadFromMedium), loadFromStorage = js.Any.fromFunction2(loadFromStorage), resetUserData = js.Any.fromFunction1(resetUserData), storeToMedium = js.Any.fromFunction2(storeToMedium), storeToStorage = js.Any.fromFunction2(storeToStorage))
  
    __obj.asInstanceOf[DocumentProperties]
  }
}

