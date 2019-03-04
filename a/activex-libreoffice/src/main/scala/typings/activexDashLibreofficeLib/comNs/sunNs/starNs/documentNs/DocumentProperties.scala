package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

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
  def create(): scala.Unit
}

object DocumentProperties {
  @scala.inline
  def apply(
    Author: java.lang.String,
    AutoloadSecs: scala.Double,
    AutoloadURL: java.lang.String,
    CreationDate: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime,
    DefaultTarget: java.lang.String,
    Description: java.lang.String,
    DocumentStatistics: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue],
    EditingCycles: scala.Double,
    EditingDuration: scala.Double,
    Generator: java.lang.String,
    Keywords: activexDashInteropLib.SafeArray[java.lang.String],
    Language: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    ModificationDate: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime,
    ModifiedBy: java.lang.String,
    PrintDate: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime,
    PrintedBy: java.lang.String,
    Subject: java.lang.String,
    TemplateDate: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime,
    TemplateName: java.lang.String,
    TemplateURL: java.lang.String,
    Title: java.lang.String,
    UserDefinedProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyContainer,
    create: js.Function0[scala.Unit],
    getUserDefinedProperties: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyContainer],
    loadFromMedium: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ],
    loadFromStorage: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ],
    resetUserData: js.Function1[java.lang.String, scala.Unit],
    storeToMedium: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ],
    storeToStorage: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ]
  ): DocumentProperties = {
    val __obj = js.Dynamic.literal(Author = Author, AutoloadSecs = AutoloadSecs, AutoloadURL = AutoloadURL, CreationDate = CreationDate, DefaultTarget = DefaultTarget, Description = Description, DocumentStatistics = DocumentStatistics, EditingCycles = EditingCycles, EditingDuration = EditingDuration, Generator = Generator, Keywords = Keywords, Language = Language, ModificationDate = ModificationDate, ModifiedBy = ModifiedBy, PrintDate = PrintDate, PrintedBy = PrintedBy, Subject = Subject, TemplateDate = TemplateDate, TemplateName = TemplateName, TemplateURL = TemplateURL, Title = Title, UserDefinedProperties = UserDefinedProperties, create = create, getUserDefinedProperties = getUserDefinedProperties, loadFromMedium = loadFromMedium, loadFromStorage = loadFromStorage, resetUserData = resetUserData, storeToMedium = storeToMedium, storeToStorage = storeToStorage)
  
    __obj.asInstanceOf[DocumentProperties]
  }
}

