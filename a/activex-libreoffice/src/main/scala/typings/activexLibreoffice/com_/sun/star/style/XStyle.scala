package typings.activexLibreoffice.com_.sun.star.style

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNamed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a template for a style (aka style sheet). */
trait XStyle
  extends StObject
     with XNamed {
  
  /** @returns the name of the parent style, probably empty. */
  var ParentStyle: String
  
  /** @returns the name of the parent style, probably empty. */
  def getParentStyle(): String
  
  /** @returns `TRUE` if this type is used in the document. */
  def isInUse(): Boolean
  
  /** identifies a style as defined by the user. */
  def isUserDefined(): Boolean
  
  /** sets the name of the parent style. */
  def setParentStyle(aParentStyle: String): Unit
}
object XStyle {
  
  inline def apply(
    Name: String,
    ParentStyle: String,
    acquire: () => Unit,
    getName: () => String,
    getParentStyle: () => String,
    isInUse: () => Boolean,
    isUserDefined: () => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit,
    setName: String => Unit,
    setParentStyle: String => Unit
  ): XStyle = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], ParentStyle = ParentStyle.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getName = js.Any.fromFunction0(getName), getParentStyle = js.Any.fromFunction0(getParentStyle), isInUse = js.Any.fromFunction0(isInUse), isUserDefined = js.Any.fromFunction0(isUserDefined), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setName = js.Any.fromFunction1(setName), setParentStyle = js.Any.fromFunction1(setParentStyle))
    __obj.asInstanceOf[XStyle]
  }
  
  extension [Self <: XStyle](x: Self) {
    
    inline def setGetParentStyle(value: () => String): Self = StObject.set(x, "getParentStyle", js.Any.fromFunction0(value))
    
    inline def setIsInUse(value: () => Boolean): Self = StObject.set(x, "isInUse", js.Any.fromFunction0(value))
    
    inline def setIsUserDefined(value: () => Boolean): Self = StObject.set(x, "isUserDefined", js.Any.fromFunction0(value))
    
    inline def setParentStyle(value: String): Self = StObject.set(x, "ParentStyle", value.asInstanceOf[js.Any])
    
    inline def setSetParentStyle(value: String => Unit): Self = StObject.set(x, "setParentStyle", js.Any.fromFunction1(value))
  }
}
