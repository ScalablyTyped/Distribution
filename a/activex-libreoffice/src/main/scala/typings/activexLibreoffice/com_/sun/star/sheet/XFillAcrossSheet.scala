package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated Deprecated */
trait XFillAcrossSheet
  extends StObject
     with XInterface {
  
  /** copies data between ranges onto different sheets in the document. */
  def fillAcrossSheets(nContentFlags: Double): Unit
}
object XFillAcrossSheet {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    fillAcrossSheets: Double => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFillAcrossSheet = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), fillAcrossSheets = js.Any.fromFunction1(fillAcrossSheets), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XFillAcrossSheet]
  }
  
  @scala.inline
  implicit class XFillAcrossSheetMutableBuilder[Self <: XFillAcrossSheet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFillAcrossSheets(value: Double => Unit): Self = StObject.set(x, "fillAcrossSheets", js.Any.fromFunction1(value))
  }
}
