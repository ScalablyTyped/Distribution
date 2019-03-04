package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object supporting this interface indicates to interested parties or clients the name of the default method for this object.
  *
  * For example where ExampleObject is an instance of an Object that supports this interface which returns the default method name "defaultMethod".A
  * scripting engine could use this information to support syntax like
  *
  * "ExampleObject( Param1 .... ParamN )"
  *
  * which would be equivalent to writing
  *
  * "ExampleObject.defaultMethod( Param1 ... ParamN )"
  */
trait XDefaultMethod
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Returns the name of the default method
    * @returns The `string` name of default method
    */
  val DefaultMethodName: java.lang.String
  /**
    * Returns the name of the default method
    * @returns The `string` name of default method
    */
  def getDefaultMethodName(): java.lang.String
}

object XDefaultMethod {
  @scala.inline
  def apply(
    DefaultMethodName: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getDefaultMethodName: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XDefaultMethod = {
    val __obj = js.Dynamic.literal(DefaultMethodName = DefaultMethodName, acquire = acquire, getDefaultMethodName = getDefaultMethodName, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XDefaultMethod]
  }
}

