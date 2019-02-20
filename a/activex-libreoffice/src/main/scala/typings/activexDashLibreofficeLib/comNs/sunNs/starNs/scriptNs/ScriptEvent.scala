package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * script event that gets delivered whenever a script event takes place.
  *
  * For that to happen, a "ScriptEventDescriptor" must be registered at and attached to an object by an {@link XEventAttacherManager} .
  */
trait ScriptEvent extends AllEventObject {
  /**
    * script code as string.
    *
    * The code has to correspond with the language defined by ScriptType.
    */
  var ScriptCode: java.lang.String
  /** type of the script language as string; for example, "Basic" or "StarScript". */
  var ScriptType: java.lang.String
}

