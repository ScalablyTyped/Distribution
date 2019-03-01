package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes a verb. */
trait VerbDescriptor extends js.Object {
  /**
    * specifies the attributes of the verb.
    *
    * It can take values from {@link VerbAttributes} .
    */
  var VerbAttributes: scala.Double
  /**
    * specifies the flags that are set for the verb.
    *
    * The flags can be used to build the verb's menu.
    */
  var VerbFlags: scala.Double
  /** specifies the id of the verb. */
  var VerbID: scala.Double
  /** specifies the name of the verb. */
  var VerbName: java.lang.String
}

object VerbDescriptor {
  @scala.inline
  def apply(
    VerbAttributes: scala.Double,
    VerbFlags: scala.Double,
    VerbID: scala.Double,
    VerbName: java.lang.String
  ): VerbDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("VerbAttributes")(VerbAttributes)
    __obj.updateDynamic("VerbFlags")(VerbFlags)
    __obj.updateDynamic("VerbID")(VerbID)
    __obj.updateDynamic("VerbName")(VerbName)
    __obj.asInstanceOf[VerbDescriptor]
  }
}

