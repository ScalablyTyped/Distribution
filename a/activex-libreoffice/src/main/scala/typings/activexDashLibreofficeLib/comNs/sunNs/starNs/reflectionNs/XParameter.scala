package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reflects a parameter of an interface method or a service constructor.
  *
  * This type supersedes {@link XMethodParameter} , which only supports parameters of interface methods (which cannot have rest parameters).
  * @since OOo 2.0
  */
trait XParameter extends XMethodParameter {
  /**
    * Returns whether this is a rest parameter.
    *
    * A rest parameter must always come last in a parameter list.
    *
    * Currently, only service constructors can have rest parameters, and those rest parameters must be in parameters of type `any` .
    * @returns `TRUE` if and only if this parameter is a rest parameter
    */
  def isRestParameter(): scala.Boolean
}

object XParameter {
  @scala.inline
  def apply(
    Name: java.lang.String,
    Position: scala.Double,
    Type: XTypeDescription,
    acquire: () => scala.Unit,
    getName: () => java.lang.String,
    getPosition: () => scala.Double,
    getType: () => XTypeDescription,
    isIn: () => scala.Boolean,
    isOut: () => scala.Boolean,
    isRestParameter: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XParameter = {
    val __obj = js.Dynamic.literal(Name = Name, Position = Position, Type = Type, acquire = js.Any.fromFunction0(acquire), getName = js.Any.fromFunction0(getName), getPosition = js.Any.fromFunction0(getPosition), getType = js.Any.fromFunction0(getType), isIn = js.Any.fromFunction0(isIn), isOut = js.Any.fromFunction0(isOut), isRestParameter = js.Any.fromFunction0(isRestParameter), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XParameter]
  }
}

