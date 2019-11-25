package typings.activexDashWord

import typings.activexDashStdole.stdole.GUID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CNames extends js.Object {
  val cNames: Double
  val lcid: Double
  var rgdispid: Double
  val rgszNames: Double
  val riid: GUID
}

object Anon_CNames {
  @scala.inline
  def apply(cNames: Double, lcid: Double, rgdispid: Double, rgszNames: Double, riid: GUID): Anon_CNames = {
    val __obj = js.Dynamic.literal(cNames = cNames.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any], rgdispid = rgdispid.asInstanceOf[js.Any], rgszNames = rgszNames.asInstanceOf[js.Any], riid = riid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CNames]
  }
}

