package typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XCodeNameQuery extends js.Object {
  def getCodeNameForContainer(aObj: XInterface): String
  def getCodeNameForObject(aObj: XInterface): String
}

object XCodeNameQuery {
  @scala.inline
  def apply(getCodeNameForContainer: XInterface => String, getCodeNameForObject: XInterface => String): XCodeNameQuery = {
    val __obj = js.Dynamic.literal(getCodeNameForContainer = js.Any.fromFunction1(getCodeNameForContainer), getCodeNameForObject = js.Any.fromFunction1(getCodeNameForObject))
  
    __obj.asInstanceOf[XCodeNameQuery]
  }
}

