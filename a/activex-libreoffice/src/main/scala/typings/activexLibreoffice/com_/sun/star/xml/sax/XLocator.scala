package typings.activexLibreoffice.com_.sun.star.xml.sax

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to associate a SAX event with a document location.
  *
  * This interface is an IDL version of the Java interface **org.xml.sax.Locator** .
  */
@js.native
trait XLocator extends XInterface {
  /** @returns the column number where the current document event ends. */
  val ColumnNumber: Double = js.native
  /** @returns the line number where the current document event ends. */
  val LineNumber: Double = js.native
  /** @returns the public identifier for the current document event. */
  val PublicId: String = js.native
  /** @returns the system identifier for the current document event. */
  val SystemId: String = js.native
  /** @returns the column number where the current document event ends. */
  def getColumnNumber(): Double = js.native
  /** @returns the line number where the current document event ends. */
  def getLineNumber(): Double = js.native
  /** @returns the public identifier for the current document event. */
  def getPublicId(): String = js.native
  /** @returns the system identifier for the current document event. */
  def getSystemId(): String = js.native
}

object XLocator {
  @scala.inline
  def apply(
    ColumnNumber: Double,
    LineNumber: Double,
    PublicId: String,
    SystemId: String,
    acquire: () => Unit,
    getColumnNumber: () => Double,
    getLineNumber: () => Double,
    getPublicId: () => String,
    getSystemId: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XLocator = {
    val __obj = js.Dynamic.literal(ColumnNumber = ColumnNumber.asInstanceOf[js.Any], LineNumber = LineNumber.asInstanceOf[js.Any], PublicId = PublicId.asInstanceOf[js.Any], SystemId = SystemId.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getColumnNumber = js.Any.fromFunction0(getColumnNumber), getLineNumber = js.Any.fromFunction0(getLineNumber), getPublicId = js.Any.fromFunction0(getPublicId), getSystemId = js.Any.fromFunction0(getSystemId), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XLocator]
  }
  @scala.inline
  implicit class XLocatorOps[Self <: XLocator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColumnNumber(value: Double): Self = this.set("ColumnNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineNumber(value: Double): Self = this.set("LineNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicId(value: String): Self = this.set("PublicId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystemId(value: String): Self = this.set("SystemId", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetColumnNumber(value: () => Double): Self = this.set("getColumnNumber", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLineNumber(value: () => Double): Self = this.set("getLineNumber", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPublicId(value: () => String): Self = this.set("getPublicId", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSystemId(value: () => String): Self = this.set("getSystemId", js.Any.fromFunction0(value))
  }
  
}

