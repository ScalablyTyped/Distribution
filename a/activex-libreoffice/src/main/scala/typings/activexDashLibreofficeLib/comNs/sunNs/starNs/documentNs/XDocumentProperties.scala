package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides document-specific information such as the author, creation date, and user-defined fields.
  *
  * This interface manages access to document meta-data properties. Such properties may be set from the outside via the setter methods (e.g. when
  * importing arbitrary document formats that support document properties), or imported from an ODF package via the methods {@link loadFromStorage()} and
  * {@link loadFromMedium()} . The properties may also be stored via the methods {@link storeToStorage()} and {@link storeToMedium()} .
  * @see XDocumentPropertiesSupplier for getting access to an instance from a loaded document
  * @see DocumentProperties for a service that implements this interface
  * @since OOo 3.0
  */
trait XDocumentProperties extends js.Object {
  /** contains the initial author of the document. */
  var Author: java.lang.String
  /**
    * contains the number of seconds after which a specified URL is to be loaded after the document is loaded into a desktop frame.
    *
    * A value of 0 is valid and describes a redirection. A value of 0 together with an empty `string` as {@link AutoloadURL} describes a case where no
    * autoload is specified.
    * @see AutoloadURL
    * @throws com::sun::star::lang::IllegalArgumentException if argument is negative
    */
  var AutoloadSecs: scala.Double
  /**
    * contains the URL to load automatically at a specified time after the document is loaded into a desktop frame.
    *
    * An empty URL is valid and describes a case where the document shall be reloaded from its original location after some time described by the attribute
    * {@link AutoloadSecs} . An empty `string` together with an {@link AutoloadSecs} value of 0 describes a case where no autoload is specified.
    * @see AutoloadSecs
    */
  var AutoloadURL: java.lang.String
  /** contains the date and time when the document was created. */
  var CreationDate: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime
  /**
    * contains the name of the default frame into which links should be loaded if no target is specified.
    *
    * This applies to the autoload feature too, but to others as well.
    */
  var DefaultTarget: java.lang.String
  /**
    * contains a multi-line comment describing the document.
    *
    * Line delimiters can be UNIX, Macintosh or DOS style.
    */
  var Description: java.lang.String
  /**
    * contains some statistics about the document.
    *
    * The contained statistics may be specific to the type of the document.
    */
  var DocumentStatistics: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue]
  /**
    * describes how often the document was edited and saved.
    * @throws com::sun::star::lang::IllegalArgumentException if argument is negative
    */
  var EditingCycles: scala.Double
  /**
    * contains the net time of editing the document (in seconds).
    * @throws com::sun::star::lang::IllegalArgumentException if argument is negative
    */
  var EditingDuration: scala.Double
  /**
    * identifies which application was used to create or last modify the document.
    *
    * The generating application will set this attribute when it creates a new document or it saves a document. When a document is loaded that itself
    * contains such an attribute it will be preserved until the document is saved again.
    */
  var Generator: java.lang.String
  /** contains a list of keywords for the document. */
  var Keywords: activexDashInteropLib.SafeArray[java.lang.String]
  /** contains the default language of the document. */
  var Language: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /**
    * contains the date and time of the last time the document was stored.
    *
    * If the document has never been stored, contains a default value.
    */
  var ModificationDate: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime
  /** contains the name of the person who most recently stored the document. */
  var ModifiedBy: java.lang.String
  /**
    * contains the date and time when the document was last printed.
    *
    * If the document has never been printed, contains a default value.
    */
  var PrintDate: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime
  /** contains the name of the person who most recently printed the document. */
  var PrintedBy: java.lang.String
  /** contains the subject of the document. */
  var Subject: java.lang.String
  /** contains the date and time of when the document was created or updated from the template. */
  var TemplateDate: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime
  /**
    * contains the name of the template from which the document was created.
    *
    * The value is an empty `string` if the document was not created from a template or if it was detached from the template.
    */
  var TemplateName: java.lang.String
  /**
    * contains the URL of the template from which the document was created.
    *
    * The value is an empty `string` if the document was not created from a template or if it was detached from the template.
    */
  var TemplateURL: java.lang.String
  /** contains the title of the document. */
  var Title: java.lang.String
  /**
    * provides access to a container for user-defined properties.
    *
    * The returned object also implements the interface {@link com.sun.star.beans.XPropertySet} .
    * @returns a container that provides access to user-defined properties
    */
  val UserDefinedProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyContainer
  /**
    * provides access to a container for user-defined properties.
    *
    * The returned object also implements the interface {@link com.sun.star.beans.XPropertySet} .
    * @returns a container that provides access to user-defined properties
    */
  def getUserDefinedProperties(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyContainer
  /**
    * loads document properties from an ODF package or an OLE container.
    * @param URL the URL of the source document The URL could be part of the Medium parameter, but because often no other parameters except the URL are needed
    * @param Medium the {@link com.sun.star.document.MediaDescriptor} representing the source
    * @throws com::sun::star::io::WrongFormatException if parsing the XML document fails
    * @throws com::sun::star::lang::WrappedTargetException if thrown when trying to open a stream in the given storage
    * @throws com::sun::star::io::IOException if thrown when trying to open a stream in the given storage
    */
  def loadFromMedium(
    URL: java.lang.String,
    Medium: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
  /**
    * loads document properties from an ODF package.
    *
    * This method is used for accessing an ODF package that is owned by someone else, e.g., a document.
    * @param Storage the {@link com.sun.star.embed.Storage} representing the ODF package
    * @param Medium the {@link com.sun.star.document.MediaDescriptor} representing the source This is unfortunately necessary in order to properly resolve rel
    * @throws com::sun::star::lang::IllegalArgumentException if argument is `NULL`
    * @throws com::sun::star::io::WrongFormatException if parsing the XML document fails
    * @throws com::sun::star::lang::WrappedTargetException if thrown when trying to open a stream in the given storage
    * @throws com::sun::star::io::IOException if thrown when trying to open a stream in the given storage
    */
  def loadFromStorage(
    Storage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage,
    Medium: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
  /**
    * resets all attributes that could identify the user.
    *
    * Clears the document properties, such that it appears the document has just been created. This is a convenience method which resets several attributes
    * at once, as follows: {@link Author} is set to the given parameter.{@link CreationDate} is set to the current date and time.{@link ModifiedBy} is
    * cleared.{@link ModificationDate} is cleared.{@link PrintedBy} is cleared.{@link PrintDate} is cleared.{@link EditingDuration} is cleared.{@link
    * EditingCycles} is set to 1.
    * @param Author the new value of the {@link Author} attribute.
    */
  def resetUserData(Author: java.lang.String): scala.Unit
  /**
    * stores document properties to an ODF package or an OLE container.
    * @param URL the URL of the target document The URL could be part of the Medium parameter, but because often no other parameters except the URL are needed
    * @param Medium the {@link com.sun.star.document.MediaDescriptor} representing the target
    * @throws com::sun::star::lang::WrappedTargetException if thrown when trying to open a stream in the given storage
    * @throws com::sun::star::io::IOException if thrown when writing to the storage
    */
  def storeToMedium(
    URL: java.lang.String,
    Medium: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
  /**
    * stores document properties to an ODF package.
    *
    * This method is used for accessing an ODF package that is owned by someone else, e.g., a document. Note that the implementation may choose to store the
    * meta-data in either OOo or ODF format, depending on the MediaType property of the given Storage argument.
    * @param Storage the {@link com.sun.star.embed.Storage} representing the ODF package
    * @param Medium the {@link com.sun.star.document.MediaDescriptor} representing the source This is unfortunately necessary in order to properly resolve rel
    * @throws com::sun::star::lang::IllegalArgumentException if argument is `NULL`
    * @throws com::sun::star::lang::WrappedTargetException if thrown when trying to open a stream in the given storage
    * @throws com::sun::star::io::IOException if thrown when writing to the storage
    */
  def storeToStorage(
    Storage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage,
    Medium: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
}

object XDocumentProperties {
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
  ): XDocumentProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Author")(Author)
    __obj.updateDynamic("AutoloadSecs")(AutoloadSecs)
    __obj.updateDynamic("AutoloadURL")(AutoloadURL)
    __obj.updateDynamic("CreationDate")(CreationDate)
    __obj.updateDynamic("DefaultTarget")(DefaultTarget)
    __obj.updateDynamic("Description")(Description)
    __obj.updateDynamic("DocumentStatistics")(DocumentStatistics)
    __obj.updateDynamic("EditingCycles")(EditingCycles)
    __obj.updateDynamic("EditingDuration")(EditingDuration)
    __obj.updateDynamic("Generator")(Generator)
    __obj.updateDynamic("Keywords")(Keywords)
    __obj.updateDynamic("Language")(Language)
    __obj.updateDynamic("ModificationDate")(ModificationDate)
    __obj.updateDynamic("ModifiedBy")(ModifiedBy)
    __obj.updateDynamic("PrintDate")(PrintDate)
    __obj.updateDynamic("PrintedBy")(PrintedBy)
    __obj.updateDynamic("Subject")(Subject)
    __obj.updateDynamic("TemplateDate")(TemplateDate)
    __obj.updateDynamic("TemplateName")(TemplateName)
    __obj.updateDynamic("TemplateURL")(TemplateURL)
    __obj.updateDynamic("Title")(Title)
    __obj.updateDynamic("UserDefinedProperties")(UserDefinedProperties)
    __obj.updateDynamic("getUserDefinedProperties")(getUserDefinedProperties)
    __obj.updateDynamic("loadFromMedium")(loadFromMedium)
    __obj.updateDynamic("loadFromStorage")(loadFromStorage)
    __obj.updateDynamic("resetUserData")(resetUserData)
    __obj.updateDynamic("storeToMedium")(storeToMedium)
    __obj.updateDynamic("storeToStorage")(storeToStorage)
    __obj.asInstanceOf[XDocumentProperties]
  }
}

