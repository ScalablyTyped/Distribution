package typings.activexLibreoffice.com_.sun.star.sheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XIconSetEntry extends StObject {
  
  var Formula: String = js.native
  
  /** See com.sun.star.sheet.IconSetEntryType for possible values. */
  var Type: Double = js.native
  
  def getFormula(): String = js.native
  
  /** See com.sun.star.sheet.IconSetEntryType for possible values. */
  def getType(): Double = js.native
  
  def setFormula(Formula: String): Unit = js.native
  
  /** See com.sun.star.sheet.IconSetEntryType for possible values. */
  def setType(Type: Double): Unit = js.native
}
object XIconSetEntry {
  
  @scala.inline
  def apply(
    Formula: String,
    Type: Double,
    getFormula: () => String,
    getType: () => Double,
    setFormula: String => Unit,
    setType: Double => Unit
  ): XIconSetEntry = {
    val __obj = js.Dynamic.literal(Formula = Formula.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], getFormula = js.Any.fromFunction0(getFormula), getType = js.Any.fromFunction0(getType), setFormula = js.Any.fromFunction1(setFormula), setType = js.Any.fromFunction1(setType))
    __obj.asInstanceOf[XIconSetEntry]
  }
  
  @scala.inline
  implicit class XIconSetEntryMutableBuilder[Self <: XIconSetEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormula(value: String): Self = StObject.set(x, "Formula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFormula(value: () => String): Self = StObject.set(x, "getFormula", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetType(value: () => Double): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetFormula(value: String => Unit): Self = StObject.set(x, "setFormula", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetType(value: Double => Unit): Self = StObject.set(x, "setType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
