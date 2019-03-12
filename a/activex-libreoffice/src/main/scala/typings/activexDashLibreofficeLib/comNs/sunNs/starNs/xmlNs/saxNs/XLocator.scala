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

object XLocator {
  @scala.inline
  def apply(
    ColumnNumber: scala.Double,
    LineNumber: scala.Double,
    PublicId: java.lang.String,
    SystemId: java.lang.String,
    acquire: () => scala.Unit,
    getColumnNumber: () => scala.Double,
    getLineNumber: () => scala.Double,
    getPublicId: () => java.lang.String,
    getSystemId: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XLocator = {
    val __obj = js.Dynamic.literal(ColumnNumber = ColumnNumber, LineNumber = LineNumber, PublicId = PublicId, SystemId = SystemId, acquire = js.Any.fromFunction0(acquire), getColumnNumber = js.Any.fromFunction0(getColumnNumber), getLineNumber = js.Any.fromFunction0(getLineNumber), getPublicId = js.Any.fromFunction0(getPublicId), getSystemId = js.Any.fromFunction0(getSystemId), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XLocator]
  }
}

