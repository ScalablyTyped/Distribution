package typings.activexLibreoffice.com_.sun.star.xml

import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * This service describes a container for XML attributes.
  *
  * Each attribute is accessed with its local name, or optionally, its local name with its namespace prefix. The type and value of an attribute is stored
  * in a `AttributeData` struct. If you use a namespace in the `AttributeData` , you must use a prefix in the name and you must use a namespace, if you
  * use a prefix.
  */
type AttributeContainer = XNameContainer

/**
  * describes an import filter for XML-based file formats.
  * @since OOo 1.1.2
  */
type ImportFilter = XImportFilter

/**
  * This service describes a container for XML namespaces.
  *
  * Each namespace is accessed with its prefix and the URL is stored as a string.
  * @see com.sun.star.xforms.Binding
  */
type NamespaceContainer = XNameContainer

/**
  * describes an export filter for XML-based file formats.
  *
  * It is an extension of {@link com.sun.star.document.ExportFilter} and differs from it only in that an {@link com.sun.star.xml.sax.XDocumentHandler}
  * needs to be passed through the XInitialization interface. This XDocumentHandler will then be used to export the XML data stream.
  */
type XMLExportFilter = typings.activexLibreoffice.com_.sun.star.document.ExportFilter
