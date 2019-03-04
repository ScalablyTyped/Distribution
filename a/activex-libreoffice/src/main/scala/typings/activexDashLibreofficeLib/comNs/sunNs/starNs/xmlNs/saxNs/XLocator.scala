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
    acquire: js.Function0[scala.Unit],
    getColumnNumber: js.Function0[scala.Double],
    getLineNumber: js.Function0[scala.Double],
    getPublicId: js.Function0[java.lang.String],
    getSystemId: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XLocator = {
    val __obj = js.Dynamic.literal(ColumnNumber = ColumnNumber, LineNumber = LineNumber, PublicId = PublicId, SystemId = SystemId, acquire = acquire, getColumnNumber = getColumnNumber, getLineNumber = getLineNumber, getPublicId = getPublicId, getSystemId = getSystemId, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XLocator]
  }
}

