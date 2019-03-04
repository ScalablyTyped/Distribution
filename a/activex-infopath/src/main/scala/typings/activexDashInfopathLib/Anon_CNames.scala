package typings
package activexDashInfopathLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CNames extends js.Object {
  val cNames: scala.Double
  val lcid: scala.Double
  var rgdispid: scala.Double
  val rgszNames: scala.Double
  val riid: activexDashStdoleLib.stdoleNs.GUID
}

object Anon_CNames {
  @scala.inline
  def apply(
    cNames: scala.Double,
    lcid: scala.Double,
    rgdispid: scala.Double,
    rgszNames: scala.Double,
    riid: activexDashStdoleLib.stdoleNs.GUID
  ): Anon_CNames = {
    val __obj = js.Dynamic.literal(cNames = cNames, lcid = lcid, rgdispid = rgdispid, rgszNames = rgszNames, riid = riid)
  
    __obj.asInstanceOf[Anon_CNames]
  }
}

