package typings.activexDashLibreoffice.comNs.sunNs.starNs.reflectionNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reflects a method parameter.
  *
  * This type is superseded by {@link XParameter} , which supports parameters of service constructors as well as parameters of interface methods.
  * @see XInterfaceMethodTypeDescription
  */
trait XMethodParameter extends XInterface {
  /**
    * Returns the name of the parameter
    * @returns name of parameter
    */
  val Name: String
  /**
    * Returns the position of the parameter regarding the IDL method declaration.
    * @returns position of the parameter
    */
  val Position: Double
  /**
    * Returns the type of the parameter.
    * @returns type of parameter
    */
  val Type: XTypeDescription
  /**
    * Returns the name of the parameter
    * @returns name of parameter
    */
  def getName(): String
  /**
    * Returns the position of the parameter regarding the IDL method declaration.
    * @returns position of the parameter
    */
  def getPosition(): Double
  /**
    * Returns the type of the parameter.
    * @returns type of parameter
    */
  def getType(): XTypeDescription
  /**
    * Returns true, if the parameter is declared as [in] or [inout] in IDL.
    * @returns true, if declared [in] or [inout] parameter
    */
  def isIn(): Boolean
  /**
    * Returns true, if the parameter is declared as [out] or [inout] in IDL.
    * @returns true, if declared [out] or [inout] parameter
    */
  def isOut(): Boolean
}

object XMethodParameter {
  @scala.inline
  def apply(
    Name: String,
    Position: Double,
    Type: XTypeDescription,
    acquire: () => Unit,
    getName: () => String,
    getPosition: () => Double,
    getType: () => XTypeDescription,
    isIn: () => Boolean,
    isOut: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XMethodParameter = {
    val __obj = js.Dynamic.literal(Name = Name, Position = Position, Type = Type, acquire = js.Any.fromFunction0(acquire), getName = js.Any.fromFunction0(getName), getPosition = js.Any.fromFunction0(getPosition), getType = js.Any.fromFunction0(getType), isIn = js.Any.fromFunction0(isIn), isOut = js.Any.fromFunction0(isOut), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XMethodParameter]
  }
}

