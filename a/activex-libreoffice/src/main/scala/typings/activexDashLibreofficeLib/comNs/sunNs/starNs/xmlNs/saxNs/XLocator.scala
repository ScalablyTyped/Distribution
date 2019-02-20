package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to associate a SAX event with a document location.
  *
  * This interface is an IDL version of the Java interface **org.xml.sax.Locator** .
  */
trait XLocator
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the column number where the current document event ends. */
  val ColumnNumber: scala.Double
  /** @returns the line number where the current document event ends. */
  val LineNumber: scala.Double
  /** @returns the public identifier for the current document event. */
  val PublicId: java.lang.String
  /** @returns the system identifier for the current document event. */
  val SystemId: java.lang.String
  /** @returns the column number where the current document event ends. */
  def getColumnNumber(): scala.Double
  /** @returns the line number where the current document event ends. */
  def getLineNumber(): scala.Double
  /** @returns the public identifier for the current document event. */
  def getPublicId(): java.lang.String
  /** @returns the system identifier for the current document event. */
  def getSystemId(): java.lang.String
}

