package typings.activexLibreoffice.com_.sun.star.xml.sax

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class XLocatorMutableBuilder[Self <: XLocator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnNumber(value: Double): Self = StObject.set(x, "ColumnNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetColumnNumber(value: () => Double): Self = StObject.set(x, "getColumnNumber", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLineNumber(value: () => Double): Self = StObject.set(x, "getLineNumber", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPublicId(value: () => String): Self = StObject.set(x, "getPublicId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSystemId(value: () => String): Self = StObject.set(x, "getSystemId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLineNumber(value: Double): Self = StObject.set(x, "LineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicId(value: String): Self = StObject.set(x, "PublicId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemId(value: String): Self = StObject.set(x, "SystemId", value.asInstanceOf[js.Any])
  }
}
