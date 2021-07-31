package typings.activexLibreoffice.com_.sun.star.datatransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Different platforms use different types to describe data formats available during data exchange operations like clipboard or drag&drop.
  * Implementations of this service do convert system dependent data types to a {@link DataFlavor} and vice versa.
  * @see com.sun.star.datatransfer.XDataFormatTranslator
  * @see com.sun.star.datatransfer.DataFlavor Converts a {@link DataFlavor} to system data types and vice versa.
  */
type DataFormatTranslator = typings.activexLibreoffice.com_.sun.star.datatransfer.XDataFormatTranslator

/**
  * Used to create an instance that implement the interface {@link XMimeContentType} from a string representation of such a MIME content-type that
  * conforms to [Rfc2045]{@link url="ftp://ftp.isi.edu/in-notes/rfc2045.txt"} and [Rfc2046]{@link url="ftp://ftp.isi.edu/in-notes/rfc2046.txt"} .
  * @see com.sun.star.datatransfer.XMimeContentTypeFactory
  */
type MimeContentTypeFactory = typings.activexLibreoffice.com_.sun.star.datatransfer.XMimeContentTypeFactory

/**
  * Exception will be thrown if there is a request for data in a {@link DataFlavor} that is not supported by a data source.
  * @see com.sun.star.datatransfer.DataFlavor
  * @see com.sun.star.datatransfer.XTransferable
  */
type UnsupportedFlavorException = typings.activexLibreoffice.com_.sun.star.uno.Exception
