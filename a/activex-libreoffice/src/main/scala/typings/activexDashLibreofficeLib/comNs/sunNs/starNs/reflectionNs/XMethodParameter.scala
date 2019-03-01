package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reflects a method parameter.
  *
  * This type is superseded by {@link XParameter} , which supports parameters of service constructors as well as parameters of interface methods.
  * @see XInterfaceMethodTypeDescription
  */
trait XMethodParameter
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Returns the name of the parameter
    * @returns name of parameter
    */
  val Name: java.lang.String
  /**
    * Returns the position of the parameter regarding the IDL method declaration.
    * @returns position of the parameter
    */
  val Position: scala.Double
  /**
    * Returns the type of the parameter.
    * @returns type of parameter
    */
  val Type: XTypeDescription
  /**
    * Returns the name of the parameter
    * @returns name of parameter
    */
  def getName(): java.lang.String
  /**
    * Returns the position of the parameter regarding the IDL method declaration.
    * @returns position of the parameter
    */
  def getPosition(): scala.Double
  /**
    * Returns the type of the parameter.
    * @returns type of parameter
    */
  def getType(): XTypeDescription
  /**
    * Returns true, if the parameter is declared as [in] or [inout] in IDL.
    * @returns true, if declared [in] or [inout] parameter
    */
  def isIn(): scala.Boolean
  /**
    * Returns true, if the parameter is declared as [out] or [inout] in IDL.
    * @returns true, if declared [out] or [inout] parameter
    */
  def isOut(): scala.Boolean
}

object XMethodParameter {
  @scala.inline
  def apply(
    Name: java.lang.String,
    Position: scala.Double,
    Type: XTypeDescription,
    acquire: js.Function0[scala.Unit],
    getName: js.Function0[java.lang.String],
    getPosition: js.Function0[scala.Double],
    getType: js.Function0[XTypeDescription],
    isIn: js.Function0[scala.Boolean],
    isOut: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XMethodParameter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Position")(Position)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getPosition")(getPosition)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("isIn")(isIn)
    __obj.updateDynamic("isOut")(isOut)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XMethodParameter]
  }
}

